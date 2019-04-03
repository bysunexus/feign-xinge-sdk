package in.fireye.xinge;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * feign-xinge-sdk
 * 信鸽认证拦截器
 *
 * @author Ben
 * @date 2019-04-03 15:30
 **/
public class XingeResponseInterceptor implements RequestInterceptor {
  private String appid;
  private String secretkey;
  private String authString;

  public XingeResponseInterceptor(String appid, String secretkey) {
    this.appid = appid;
    this.secretkey = secretkey;
    this.authString = Base64.getEncoder()
      .encodeToString((this.appid + ":" + this.secretkey).getBytes(StandardCharsets.UTF_8));
  }
  @Override
  public void apply(RequestTemplate template) {
    template.header("Content-Type", "application/json");
    template.header("Accept", "application/json");
    template.header("Authorization", "Basic " + authString);
  }
}
