package in.fireye.xinge.enums;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum AccountPushType {
  latest_device_of_singe_account(0, "往单个账号的最新的device上推送信息"),
  all_devices_of_singe_account(1, "往单个账号关联的所有device设备上推送信息"),

  ;

  private int type;
  private String name;

  AccountPushType(int type, String name) {
    this.type = type;
    this.name = name;
  }

  @JsonValue
  public int getType() {
    return type;
  }

  public String getName() {
    return name;
  }

}
