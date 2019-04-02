package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingeAccountQueryRequest {
  @JsonProperty("operator_type")
  private int operatorType;
  @JsonProperty("platform")
  private String platform;
  @JsonProperty("account_list")
  private List<Account> accountList;
  @JsonProperty("token_list")
  private List<String> tokenList;
  @JsonProperty("op_type")
  private String opType;
  @JsonProperty("op_id")
  private String opId;

  public int getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(int operatorType) {
    this.operatorType = operatorType;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public List<Account> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<Account> accountList) {
    this.accountList = accountList;
  }

  public List<String> getTokenList() {
    return tokenList;
  }

  public void setTokenList(List<String> tokenList) {
    this.tokenList = tokenList;
  }

  public String getOpType() {
    return opType;
  }

  public void setOpType(String opType) {
    this.opType = opType;
  }

  public String getOpId() {
    return opId;
  }

  public void setOpId(String opId) {
    this.opId = opId;
  }
}
