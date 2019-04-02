package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 客户端平台类型
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public enum Platform {

  all(0, "all"),
  android(1, "android"),
  ios(2, "ios"),
  wns(3, "wns"),
  web(4, "web"),
  email(5, "email"),
  sms(6, "sms"),
  ;

  private int type;
  private String name;

  Platform(int type, String name) {
    this.type = type;
    this.name = name;
  }

  public int getType() {
    return type;
  }

  @JsonValue
  public String getName() {
    return name;
  }

}
