package in.fireye.xinge;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import in.fireye.xinge.api.XingeApi;
import okhttp3.OkHttpClient;

import java.util.Optional;

/**
 * feign-xinge-sdk
 * 信鸽sdk 构建
 *
 * @author Ben
 * @date 2019-04-03 11:28
 **/
public class XingeApiCreator extends AbstractXingeApiCreator {


  public XingeApi createXingeApi() {
    OkHttpClient.Builder builder = new OkHttpClient.Builder()
      .retryOnConnectionFailure(true)
      .followRedirects(true)
      .followSslRedirects(true);

    return Feign.builder()
      .client(new feign.okhttp.OkHttpClient(builder.build()))
      .requestInterceptor(new XingeRequestInterceptor(appid, secretkey))
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .target(XingeApi.class, Optional.of(baseUrl).orElse(XINGE_API_URL));
  }
}
