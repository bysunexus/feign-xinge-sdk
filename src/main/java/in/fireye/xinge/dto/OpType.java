package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum OpType {

  OR("OR"), AND("AND"),
  ;
  private String name;

  OpType(String name) {
    this.name = name;
  }

  @JsonValue
  public String getName() {
    return name;
  }
}
