package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClickAction {

  @JsonProperty(value = "action_type", required = true, defaultValue = "1")
  private int actionType = ActionType.OPEN_ACTIVITY_BY_CLASS_NAME.getType();

  @JsonProperty(value = "activity", required = true, defaultValue = "")
  private String activity = "";

  @JsonProperty(value = "browser", required = true)
  private Browser browser;

  @JsonProperty(value = "aty_attr", required = true)
  private AtyAttr atyAttr;

  @JsonProperty(value = "intent", required = true)
  private String intent;

  public int getActionType() {
    return actionType;
  }

  public void setActionType(int actionType) {
    this.actionType = actionType;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String activity) {
    this.activity = activity;
  }

  public Browser getBrowser() {
    return browser;
  }

  public void setBrowser(Browser browser) {
    this.browser = browser;
  }

  public AtyAttr getAtyAttr() {
    return atyAttr;
  }

  public void setAtyAttr(AtyAttr atyAttr) {
    this.atyAttr = atyAttr;
  }

  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }
}
