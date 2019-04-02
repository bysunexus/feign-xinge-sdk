package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TokenAccounts {
  @JsonProperty("token")
  private String token;
  @JsonProperty("account_list")
  private List<Account> accountList;

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public List<Account> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<Account> accountList) {
    this.accountList = accountList;
  }
}
