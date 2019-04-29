package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingeAccountQueryResponse extends XingeResponse {
  private static final long serialVersionUID = -1520992894775170472L;

  @JsonProperty("account_tokens")
  private List<AccountTokens> accountTokens;
  @JsonProperty("token_accounts")
  private List<TokenAccounts> tokenAccounts;

  public XingeAccountQueryResponse(long seq, int retCode, String errMsg) {
    super(seq, retCode, errMsg);
  }

  public XingeAccountQueryResponse() {
  }

  public List<AccountTokens> getAccountTokens() {
    return accountTokens;
  }

  public void setAccountTokens(List<AccountTokens> accountTokens) {
    this.accountTokens = accountTokens;
  }

  public List<TokenAccounts> getTokenAccounts() {
    return tokenAccounts;
  }

  public void setTokenAccounts(List<TokenAccounts> tokenAccounts) {
    this.tokenAccounts = tokenAccounts;
  }
}
