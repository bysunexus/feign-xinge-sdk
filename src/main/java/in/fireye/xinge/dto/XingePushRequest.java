package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingePushRequest {
  @JsonProperty("audience_type")
  private String audienceType;
  @JsonProperty("platform")
  private String platform;
  @JsonProperty("message")
  private Message message;
  @JsonProperty("message_type")
  private String messageType;

  @JsonProperty("expire_time")
  private Integer expireTime;
  @JsonProperty("send_time")
  private String sendTime;
  @JsonProperty("multi_pkg")
  private Boolean multiPkg;
  @JsonProperty("loop_times")
  private Integer loopTimes;
  @JsonProperty("loop_interval")
  private Integer loopInterval;
  @JsonProperty("environment")
  private String environment;
  @JsonProperty("badge_type")
  private Integer badgeType;
  @JsonProperty("stat_tag")
  private String statTag;
  @JsonProperty("seq")
  private Long seq;
  @JsonProperty("tag_list")
  private TagListObject tagList;
  @JsonProperty("account_list")
  private List<String> accountList;
  @JsonProperty("account_push_type")
  private Integer accountPushType;
  @JsonProperty("account_type")
  private Integer accountType;
  @JsonProperty("token_list")
  private List<String> tokenList;
  @JsonProperty("push_id")
  private String pushId;

  public String getAudienceType() {
    return audienceType;
  }

  public void setAudienceType(String audienceType) {
    this.audienceType = audienceType;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public Integer getExpireTime() {
    return expireTime;
  }

  public void setExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
  }

  public String getSendTime() {
    return sendTime;
  }

  public void setSendTime(String sendTime) {
    this.sendTime = sendTime;
  }

  public Boolean getMultiPkg() {
    return multiPkg;
  }

  public void setMultiPkg(Boolean multiPkg) {
    this.multiPkg = multiPkg;
  }

  public Integer getLoopTimes() {
    return loopTimes;
  }

  public void setLoopTimes(Integer loopTimes) {
    this.loopTimes = loopTimes;
  }

  public Integer getLoopInterval() {
    return loopInterval;
  }

  public void setLoopInterval(Integer loopInterval) {
    this.loopInterval = loopInterval;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public Integer getBadgeType() {
    return badgeType;
  }

  public void setBadgeType(Integer badgeType) {
    this.badgeType = badgeType;
  }

  public String getStatTag() {
    return statTag;
  }

  public void setStatTag(String statTag) {
    this.statTag = statTag;
  }

  public Long getSeq() {
    return seq;
  }

  public void setSeq(Long seq) {
    this.seq = seq;
  }

  public TagListObject getTagList() {
    return tagList;
  }

  public void setTagList(TagListObject tagList) {
    this.tagList = tagList;
  }

  public List<String> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<String> accountList) {
    this.accountList = accountList;
  }

  public Integer getAccountPushType() {
    return accountPushType;
  }

  public void setAccountPushType(Integer accountPushType) {
    this.accountPushType = accountPushType;
  }

  public Integer getAccountType() {
    return accountType;
  }

  public void setAccountType(Integer accountType) {
    this.accountType = accountType;
  }

  public List<String> getTokenList() {
    return tokenList;
  }

  public void setTokenList(List<String> tokenList) {
    this.tokenList = tokenList;
  }

  public String getPushId() {
    return pushId;
  }

  public void setPushId(String pushId) {
    this.pushId = pushId;
  }
}
