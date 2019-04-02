package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonFormat(shape = JsonFormat.Shape.STRING)
public enum Environment {

  product(0, "product"),
  dev(1, "dev"),
  ;

  private int type;
  private String name;


  Environment(int type, String name) {
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



