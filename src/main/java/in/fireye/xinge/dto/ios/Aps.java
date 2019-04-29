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

  public Aps setAlert(Alert alert) {
    this.alert = alert;
    return this;
  }

  public int getBadgeType() {
    return badgeType;
  }

  public Aps setBadgeType(int badgeType) {
    this.badgeType = badgeType;
    return this;
  }

  public String getSound() {
    return sound;
  }

  public Aps setSound(String sound) {
    this.sound = sound;
    return this;
  }

  public int getContentAvailable() {
    return contentAvailable;
  }

  public Aps setContentAvailable(int contentAvailable) {
    this.contentAvailable = contentAvailable;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public Aps setCategory(String category) {
    this.category = category;
    return this;
  }

  public String getThreadId() {
    return threadId;
  }

  public Aps setThreadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  public int getMutableContent() {
    return mutableContent;
  }

  public Aps setMutableContent(int mutableContent) {
    this.mutableContent = mutableContent;
    return this;
  }
}
