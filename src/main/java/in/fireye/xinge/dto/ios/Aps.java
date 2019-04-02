package in.fireye.xinge.dto.ios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ref: https://developer.apple.com/documentation/usernotifications/setting_up_a_remote_notification_server/generating_a_remote_notification?language=objc
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Aps {

  @JsonProperty(value = "alert", required = true)
  private Alert alert;

  @JsonProperty(value = "badge_type", required = true)
  private int badgeType;

  @JsonProperty(value = "sound")
  private String sound;

  @JsonProperty(value = "content-available")
  private int contentAvailable;

  @JsonProperty(value = "category")
  private String category;

  @JsonProperty(value = "thread-id")
  private String threadId;

  /**
   * The notification service app extension flag. If the value is 1, the system passes the
   * notification to your notification service app extension before delivery. Use your extension to
   * modify the notification’s content.
   */
  @JsonProperty(value = "mutable-content")
  private int mutableContent;

  public Alert getAlert() {
    return alert;
  }

  public void setAlert(Alert alert) {
    this.alert = alert;
  }

  public int getBadgeType() {
    return badgeType;
  }

  public void setBadgeType(int badgeType) {
    this.badgeType = badgeType;
  }

  public String getSound() {
    return sound;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public int getContentAvailable() {
    return contentAvailable;
  }

  public void setContentAvailable(int contentAvailable) {
    this.contentAvailable = contentAvailable;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public int getMutableContent() {
    return mutableContent;
  }

  public void setMutableContent(int mutableContent) {
    this.mutableContent = mutableContent;
  }
}
