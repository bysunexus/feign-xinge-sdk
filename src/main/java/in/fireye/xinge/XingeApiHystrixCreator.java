package in.fireye.xinge;

import feign.hystrix.FallbackFactory;
import feign.hystrix.HystrixFeign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import in.fireye.xinge.api.XingeApi;
import in.fireye.xinge.dto.*;
import okhttp3.OkHttpClient;

import java.util.Optional;

/**
 * feign-xinge-sdk
 * 信鸽api hystrix 构建
 *
 * @author Ben
 * @date 2019-04-03 18:00
 **/
public class XingeApiHystrixCreator extends AbstractXingeApiCreator {
  @Override
  public XingeApi createXingeApi() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder()
      .retryOnConnectionFailure(true)
      .followRedirects(true)
      .followSslRedirects(true);

    return HystrixFeign.builder()
      .client(new feign.okhttp.OkHttpClient(builder.build()))
      .requestInterceptor(new XingeRequestInterceptor(appid, secretkey))
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .target(
        XingeApi.class,
        Optional.of(baseUrl).orElse(XINGE_API_URL),
        (FallbackFactory<XingeApi>) cause -> new XingeApi() {
          @Override
          public XingeResponse push(XingePushRequest message) {
            return new XingeResponse(0, -1, "请求失败");
          }

          @Override
          public XingeResponse tag(XingeTagRequest request) {
            return new XingeResponse(0, -1, "请求失败");
          }

          @Override
          public XingeResponse accountBatchOperate(XingeAccountBatchRequest request) {
            return new XingeResponse(0, -1, "请求失败");
          }

          @Override
          public XingeAccountQueryResponse accountQuery(XingeAccountQueryRequest request) {
            return new XingeAccountQueryResponse(0, -1, "请求失败");
          }
        }

      );
  }
}
