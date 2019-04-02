package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum ActionType {

  OPEN_ACTIVITY_BY_CLASS_NAME(1, "显式通过类名打开activity或app本身"),
  OPEN_WEB(2, "打开浏览器"),
  OPEN_INTENT(3, "打开Intent"),
  OPEN_APP_BY_APK_NAME(4, "通过包名打开应用"),
  OPEN_ACTIVITY_BY_ACTION(5, "隐式通过action打开activity"), //SDK  4.1 以上支持
  OPEN_RECEIVER_BY_ACTION(6, "发送一个action广播"), //SDK  4.1 以上支持
  ;

  private int type;
  private String name;

  ActionType(int type, String name) {
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
