package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum MessageType {

  notify(0, "notify"),
  message(1, "message"),
  ;

  private int type;
  private String name;

  MessageType(int type, String name) {
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
