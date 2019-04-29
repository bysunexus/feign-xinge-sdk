package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.fireye.xinge.enums.ActionType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClickAction {

  @JsonProperty(value = "action_type", required = true, defaultValue = "1")
  private int actionType = ActionType.OPEN_ACTIVITY_BY_CLASS_NAME.getType();

  @JsonProperty(value = "activity", required = true)
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

  public ClickAction setActionType(int actionType) {
    this.actionType = actionType;
    return this;
  }

  public String getActivity() {
    return activity;
  }

  public ClickAction setActivity(String activity) {
    this.activity = activity;
    return this;
  }

  public Browser getBrowser() {
    return browser;
  }

  public ClickAction setBrowser(Browser browser) {
    this.browser = browser;
    return this;
  }

  public AtyAttr getAtyAttr() {
    return atyAttr;
  }

  public ClickAction setAtyAttr(AtyAttr atyAttr) {
    this.atyAttr = atyAttr;
    return this;
  }

  public String getIntent() {
    return intent;
  }

  public ClickAction setIntent(String intent) {
    this.intent = intent;
    return this;
  }
}
