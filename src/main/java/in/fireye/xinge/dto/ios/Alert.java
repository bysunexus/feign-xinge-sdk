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

  public Alert setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public Alert setSubtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  public String getBody() {
    return body;
  }

  public Alert setBody(String body) {
    this.body = body;
    return this;
  }

  public String getLaunchImage() {
    return launchImage;
  }

  public Alert setLaunchImage(String launchImage) {
    this.launchImage = launchImage;
    return this;
  }

  public String getTitleLocKey() {
    return titleLocKey;
  }

  public Alert setTitleLocKey(String titleLocKey) {
    this.titleLocKey = titleLocKey;
    return this;
  }

  public ArrayList<String> getTitleLocArgs() {
    return titleLocArgs;
  }

  public Alert setTitleLocArgs(ArrayList<String> titleLocArgs) {
    this.titleLocArgs = titleLocArgs;
    return this;
  }

  public String getSubtitleLocKey() {
    return subtitleLocKey;
  }

  public Alert setSubtitleLocKey(String subtitleLocKey) {
    this.subtitleLocKey = subtitleLocKey;
    return this;
  }

  public String getSubtitleLocArgs() {
    return subtitleLocArgs;
  }

  public Alert setSubtitleLocArgs(String subtitleLocArgs) {
    this.subtitleLocArgs = subtitleLocArgs;
    return this;
  }

  public String getLocKey() {
    return locKey;
  }

  public Alert setLocKey(String locKey) {
    this.locKey = locKey;
    return this;
  }

  public ArrayList<String> getLocArgs() {
    return locArgs;
  }

  public Alert setLocArgs(ArrayList<String> locArgs) {
    this.locArgs = locArgs;
    return this;
  }
}
