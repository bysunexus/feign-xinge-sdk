package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountTokens extends Account{

  @JsonProperty("token_list")
  private List<String> tokenList;

  public List<String> getTokenList() {
    return tokenList;
  }

  public void setTokenList(List<String> tokenList) {
    this.tokenList = tokenList;
  }
}
