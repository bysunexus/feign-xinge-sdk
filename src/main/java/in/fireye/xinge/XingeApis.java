package in.fireye.xinge;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import in.fireye.xinge.api.AccountApi;
import in.fireye.xinge.api.PushApi;
import in.fireye.xinge.api.TagApi;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * feign-xinge-sdk
 *
 * @author <a href="mailto:sby@servyou.com.cn">ben</a>
 * @date 2019-03-27 10:36
 **/
public class XingeApis {
  private String baseUrl;

  private XingeRequestInterceptor interceptor;

  public XingeApis(String baseUrl, String appid, String secretkey) {
    this(baseUrl, new XingeRequestInterceptor(appid, secretkey));
  }

  public XingeApis(String baseUrl, XingeRequestInterceptor interceptor) {
    this.baseUrl = baseUrl;
    this.interceptor = interceptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public PushApi buildPush() {
    return Feign.builder()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(PushApi.class, baseUrl);
  }

  public TagApi buildTag() {
    return Feign.builder()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(TagApi.class, baseUrl);
  }

  public AccountApi buildAccount() {
    return Feign.builder()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(AccountApi.class, baseUrl);
  }

  public static class XingeRequestInterceptor implements RequestInterceptor {
    private String appid;
    private String secretkey;
    private String authString;

    public XingeRequestInterceptor(String appid, String secretkey) {
      this.appid = appid;
      this.secretkey = secretkey;
      this.authString = Base64.getEncoder()
        .encodeToString((this.appid + ":" + this.secretkey).getBytes(StandardCharsets.UTF_8));
    }

    public void apply(RequestTemplate requestTemplate) {
      requestTemplate.header("Content-Type", "application/json");
      requestTemplate.header("Accept", "application/json");
      requestTemplate.header("Authorization", "Basic " + authString);
    }
  }

  public static final class Builder {
    private String baseUrl = "https://openapi.xg.qq.com/v3";
    private String appid;
    private String secretkey;


    private Builder() {
    }

    public XingeApis build() {

      return new XingeApis(baseUrl, appid, secretkey);
    }

    public Builder setAppid(String appid) {
      this.appid = appid;
      return this;
    }

    public Builder setBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    public Builder setSecretkey(String secretkey) {
      this.secretkey = secretkey;
      return this;
    }
  }
}
