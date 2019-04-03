package in.fireye.xinge;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import in.fireye.xinge.api.AccountApi;
import in.fireye.xinge.api.PushApi;
import in.fireye.xinge.api.TagApi;
import in.fireye.xinge.http.DefaultClientCreator;
import in.fireye.xinge.http.DefaultFeignBuilderCreator;
import in.fireye.xinge.http.IClientCreator;
import in.fireye.xinge.http.IFeignBuilderCreator;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Optional;

/**
 * feign-xinge-sdk
 * 信鸽sdk 构建工厂
 *
 * @author Ben
 * @date 2019-04-03 11:28
 **/
public class XingeApisFactory {
  private String baseUrl;
  private XingeRequestInterceptor interceptor;
  private IClientCreator clientCreator = new DefaultClientCreator();
  private IFeignBuilderCreator feignBuilderCreator = new DefaultFeignBuilderCreator();

  public XingeApisFactory(String baseUrl, String appid, String secretkey) {
    this(baseUrl, new XingeRequestInterceptor(appid, secretkey));
  }

  public XingeApisFactory(String baseUrl, XingeRequestInterceptor interceptor) {
    this.baseUrl = baseUrl;
    this.interceptor = interceptor;
  }

  public static Builder builder() {
    return new Builder();
  }

  public PushApi buildPush() {
    return feignBuilderCreator.create()
      .client(clientCreator.create())
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(PushApi.class, baseUrl);
  }

  public TagApi buildTag() {
    return feignBuilderCreator.create()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(TagApi.class, baseUrl);
  }

  public AccountApi buildAccount() {
    return feignBuilderCreator.create()
      .encoder(new JacksonEncoder())
      .decoder(new JacksonDecoder())
      .requestInterceptor(interceptor)
      .target(AccountApi.class, baseUrl);
  }

  public XingeApisFactory setClientCreator(IClientCreator clientCreator) {
    this.clientCreator = clientCreator;
    return this;
  }

  public XingeApisFactory setFeignBuilderCreator(IFeignBuilderCreator feignBuilderCreator) {
    this.feignBuilderCreator = feignBuilderCreator;
    return this;
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
    private IClientCreator clientCreator;
    private IFeignBuilderCreator feignBuilderCreator;
    private Builder() {
    }

    public XingeApisFactory build() {
      XingeApisFactory factory = new XingeApisFactory(baseUrl, appid, secretkey);
      Optional.of(clientCreator).ifPresent(factory::setClientCreator);
      Optional.of(feignBuilderCreator).ifPresent(factory::setFeignBuilderCreator);
      return factory;
    }

    public Builder withBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    public Builder withAppid(String appid) {
      this.appid = appid;
      return this;
    }

    public Builder withSecretkey(String secretkey) {
      this.secretkey = secretkey;
      return this;
    }

    public Builder withClientCreator(IClientCreator clientCreator) {
      this.clientCreator = clientCreator;
      return this;
    }

    public Builder withFeignBuilderCreator(IFeignBuilderCreator feignBuilderCreator) {
      this.feignBuilderCreator = feignBuilderCreator;
      return this;
    }
  }
}
