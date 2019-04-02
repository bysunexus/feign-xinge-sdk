package in.fireye.xinge.dto.ios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Ref: https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification#2943365
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Alert {

  @JsonProperty(value = "title", required = true)
  private String title;

  @JsonProperty(value = "subtitle")
  private String subtitle;

  @JsonProperty(value = "body", required = true)
  private String body;

  @JsonProperty(value = "launch-image")
  private String launchImage;

  @JsonProperty(value = "title-loc-key")
  private String titleLocKey;

  @JsonProperty(value = "title-loc-args")
  private ArrayList<String> titleLocArgs;

  @JsonProperty(value = "subtitle-loc-key")
  private String subtitleLocKey;

  @JsonProperty(value = "subtitle-loc-args")
  private String subtitleLocArgs;

  @JsonProperty(value = "loc-key")
  private String locKey;

  @JsonProperty(value = "loc-args")
  private ArrayList<String> locArgs;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getLaunchImage() {
    return launchImage;
  }

  public void setLaunchImage(String launchImage) {
    this.launchImage = launchImage;
  }

  public String getTitleLocKey() {
    return titleLocKey;
  }

  public void setTitleLocKey(String titleLocKey) {
    this.titleLocKey = titleLocKey;
  }

  public ArrayList<String> getTitleLocArgs() {
    return titleLocArgs;
  }

  public void setTitleLocArgs(ArrayList<String> titleLocArgs) {
    this.titleLocArgs = titleLocArgs;
  }

  public String getSubtitleLocKey() {
    return subtitleLocKey;
  }

  public void setSubtitleLocKey(String subtitleLocKey) {
    this.subtitleLocKey = subtitleLocKey;
  }

  public String getSubtitleLocArgs() {
    return subtitleLocArgs;
  }

  public void setSubtitleLocArgs(String subtitleLocArgs) {
    this.subtitleLocArgs = subtitleLocArgs;
  }

  public String getLocKey() {
    return locKey;
  }

  public void setLocKey(String locKey) {
    this.locKey = locKey;
  }

  public ArrayList<String> getLocArgs() {
    return locArgs;
  }

  public void setLocArgs(ArrayList<String> locArgs) {
    this.locArgs = locArgs;
  }
}
