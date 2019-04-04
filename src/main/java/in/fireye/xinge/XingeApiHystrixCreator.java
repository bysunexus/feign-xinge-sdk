package in.fireye.xinge;

import com.netflix.hystrix.*;
import feign.Feign;
import feign.hystrix.FallbackFactory;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
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

    SetterFactory setterFactory = (target, method) -> {
      String groupKey = target.name();
      String commandKey = Feign.configKey(target.type(), method);
      return HystrixCommand.Setter
        .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
        .andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("xinge.sdk"))
        .andCommandKey(HystrixCommandKey.Factory.asKey(commandKey))
        .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.defaultSetter())
        .andCommandPropertiesDefaults(HystrixCommandProperties.defaultSetter());
    };

    return HystrixFeign.builder()
      .client(new feign.okhttp.OkHttpClient(builder.build()))
      .setterFactory(setterFactory)
      .requestInterceptor(new XingeRequestInterceptor(appid, secretkey))
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .target(
        XingeApi.class,
        Optional.ofNullable(baseUrl).orElse(XINGE_API_URL),
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
