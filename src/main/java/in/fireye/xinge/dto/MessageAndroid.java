package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageAndroid {

  @JsonProperty(value = "n_id", defaultValue = "0")
  private int nid = 0;

  @JsonProperty(value = "builder_id", required = true)
  private int builderId;

  @JsonProperty(value = "ring", defaultValue = "1")
  private int ring = 1;

  @JsonProperty(value = "ring_raw")
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
  private Map<String, Object> customContent;

  public int getNid() {
    return nid;
  }

  public MessageAndroid setNid(int nid) {
    this.nid = nid;
    return this;
  }

  public int getBuilderId() {
    return builderId;
  }

  public MessageAndroid setBuilderId(int builderId) {
    this.builderId = builderId;
    return this;
  }

  public int getRing() {
    return ring;
  }

  public MessageAndroid setRing(int ring) {
    this.ring = ring;
    return this;
  }

  public String getRingRaw() {
    return ringRaw;
  }

  public MessageAndroid setRingRaw(String ringRaw) {
    this.ringRaw = ringRaw;
    return this;
  }

  public int getVibrate() {
    return vibrate;
  }

  public MessageAndroid setVibrate(int vibrate) {
    this.vibrate = vibrate;
    return this;
  }

  public int getLights() {
    return lights;
  }

  public MessageAndroid setLights(int lights) {
    this.lights = lights;
    return this;
  }

  public int getClearable() {
    return clearable;
  }

  public MessageAndroid setClearable(int clearable) {
    this.clearable = clearable;
    return this;
  }

  public int getIconType() {
    return iconType;
  }

  public MessageAndroid setIconType(int iconType) {
    this.iconType = iconType;
    return this;
  }

  public String getIconRes() {
    return iconRes;
  }

  public MessageAndroid setIconRes(String iconRes) {
    this.iconRes = iconRes;
    return this;
  }

  public int getStyleId() {
    return styleId;
  }

  public MessageAndroid setStyleId(int styleId) {
    this.styleId = styleId;
    return this;
  }

  public String getSmallIcon() {
    return smallIcon;
  }

  public MessageAndroid setSmallIcon(String smallIcon) {
    this.smallIcon = smallIcon;
    return this;
  }

  public ClickAction getAction() {
    return action;
  }

  public MessageAndroid setAction(ClickAction action) {
    this.action = action;
    return this;
  }

  public Map<String, Object> getCustomContent() {
    return customContent;
  }

  public MessageAndroid setCustomContent(Map<String, Object> customContent) {
    this.customContent = customContent;
    return this;
  }
}
