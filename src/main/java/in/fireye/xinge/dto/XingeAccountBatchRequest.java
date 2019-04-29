package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingeAccountBatchRequest extends XingeAccountQueryRequest {

  @JsonProperty("token_accounts")
  private List<TokenAccounts> tokenAccounts;

  public List<TokenAccounts> getTokenAccounts() {
    return tokenAccounts;
  }

  public void setTokenAccounts(List<TokenAccounts> tokenAccounts) {
    this.tokenAccounts = tokenAccounts;
  }
}
