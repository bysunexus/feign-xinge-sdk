package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageAndroid {

  @JsonProperty(value = "n_id", defaultValue = "0")
  private int nId = 0;

  @JsonProperty(value = "builder_id", required = true)
  private int builderId;

  @JsonProperty(value = "ring", defaultValue = "1")
  private int ring = 1;

  private String ringRaw;

  @JsonProperty(value = "vibrate", defaultValue = "1")
  private int vibrate = 1;

  @JsonProperty(value = "lights", defaultValue = "1")
  private int lights = 1;

  @JsonProperty(value = "clearable", defaultValue = "1")
  private int clearable = 1;

  @JsonProperty(value = "icon_type", defaultValue = "1")
  private int iconType = 0;

  @JsonProperty(value = "icon_res")
  private String iconRes;

  @JsonProperty(value = "style_id", defaultValue = "1")
  private int styleId = 1;

  @JsonProperty(value = "small_icon")
  private String smallIcon;

  @JsonProperty(value = "action")
  private ClickAction action;

  @JsonProperty(value = "custom_content")
  private String customContent;

  public int getnId() {
    return nId;
  }

  public void setnId(int nId) {
    this.nId = nId;
  }

  public int getBuilderId() {
    return builderId;
  }

  public void setBuilderId(int builderId) {
    this.builderId = builderId;
  }

  public int getRing() {
    return ring;
  }

  public void setRing(int ring) {
    this.ring = ring;
  }

  public String getRingRaw() {
    return ringRaw;
  }

  public void setRingRaw(String ringRaw) {
    this.ringRaw = ringRaw;
  }

  public int getVibrate() {
    return vibrate;
  }

  public void setVibrate(int vibrate) {
    this.vibrate = vibrate;
  }

  public int getLights() {
    return lights;
  }

  public void setLights(int lights) {
    this.lights = lights;
  }

  public int getClearable() {
    return clearable;
  }

  public void setClearable(int clearable) {
    this.clearable = clearable;
  }

  public int getIconType() {
    return iconType;
  }

  public void setIconType(int iconType) {
    this.iconType = iconType;
  }

  public String getIconRes() {
    return iconRes;
  }

  public void setIconRes(String iconRes) {
    this.iconRes = iconRes;
  }

  public int getStyleId() {
    return styleId;
  }

  public void setStyleId(int styleId) {
    this.styleId = styleId;
  }

  public String getSmallIcon() {
    return smallIcon;
  }

  public void setSmallIcon(String smallIcon) {
    this.smallIcon = smallIcon;
  }

  public ClickAction getAction() {
    return action;
  }

  public void setAction(ClickAction action) {
    this.action = action;
  }

  public String getCustomContent() {
    return customContent;
  }

  public void setCustomContent(String customContent) {
    this.customContent = customContent;
  }
}
