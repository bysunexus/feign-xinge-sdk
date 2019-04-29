package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
  @JsonProperty("account")
  private String account;
  @JsonProperty("account_type")
  private int accountType;

  public Account() {
  }

  public Account(String account) {
    this.account = account;
  }

  public Account(String account, int accountType) {
    this.account = account;
    this.accountType = accountType;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public int getAccountType() {
    return accountType;
  }

  public void setAccountType(int accountType) {
    this.accountType = accountType;
  }
}
