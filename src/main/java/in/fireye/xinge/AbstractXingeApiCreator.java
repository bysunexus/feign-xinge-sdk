package in.fireye.xinge;

/**
 * feign-xinge-sdk
 *
 * @author Ben
 * @date 2019-04-03 17:55
 **/
public abstract class AbstractXingeApiCreator implements IXingeApiCreator {
  public static final String XINGE_API_URL = "https://openapi.xg.qq.com/v3";
  protected String baseUrl;
  protected String appid;
  protected String secretkey;

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public void setSecretkey(String secretkey) {
    this.secretkey = secretkey;
  }
}
