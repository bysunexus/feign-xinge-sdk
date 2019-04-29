package in.fireye.xinge.enums;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
public enum AudienceType {

  all(0, "all"),
  tag(1, "tag"),
  token(2, "token"),
  token_list(3, "token_list"),
  account(4, "account"),
  account_list(5, "account_list"),
  ;

  private int type;
  private String name;

  AudienceType(int type, String name) {
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
