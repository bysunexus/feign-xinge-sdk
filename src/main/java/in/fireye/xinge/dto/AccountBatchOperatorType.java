package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccountBatchOperatorType {
  TOKEN_APPEND_ACCOUNT(1, "token 追加设置account"),
  TOKEN_OVERRID_ACCOUNT(2, "token覆盖设置account"),
  TOKEN_DELETE_ACCOUNT(3, "token删除绑定的多个account"),
  TOKEN_DELETE_ALL_ACCOUNT(4, "token 删除绑定的所有account"),
  ACCOUNT_DELETE_ALL_TOKEN(5, "删除绑定的所有token"),
 ;

  private int type;
  private String note;

  AccountBatchOperatorType(int type, String note) {
    this.type = type;
    this.note = note;
  }

  public String getNote() {
    return note;
  }


  @JsonValue
  public int getType() {
    return type;
  }


}
