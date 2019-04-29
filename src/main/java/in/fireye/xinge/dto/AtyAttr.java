package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AtyAttr {

  @JsonProperty(value = "if", required = true, defaultValue = "0")
  private int atyAttrIntentFlag = 0;

  @JsonProperty(value = "pf", required = true, defaultValue = "0")
  private int atyAttrPendingIntentFlag = 0;

  public int getAtyAttrIntentFlag() {
    return atyAttrIntentFlag;
  }

  public AtyAttr setAtyAttrIntentFlag(int atyAttrIntentFlag) {
    this.atyAttrIntentFlag = atyAttrIntentFlag;
    return this;
  }

  public int getAtyAttrPendingIntentFlag() {
    return atyAttrPendingIntentFlag;
  }

  public AtyAttr setAtyAttrPendingIntentFlag(int atyAttrPendingIntentFlag) {
    this.atyAttrPendingIntentFlag = atyAttrPendingIntentFlag;
    return this;
  }
}
