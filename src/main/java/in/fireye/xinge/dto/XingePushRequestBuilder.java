package in.fireye.xinge.dto;



import in.fireye.xinge.enums.*;

import java.util.ArrayList;
import java.util.List;

/**
 * yqsy-base
 *
 * @author Ben
 * @date 2019-04-29 09:12
 **/
public final class XingePushRequestBuilder {
  private AudienceType audienceType = AudienceType.token_list;
  private Platform platform = Platform.android;
  private MessageType messageType = MessageType.notify;
  private Integer expireTime;
  private String sendTime;
  private Boolean multiPkg;
  private Integer loopTimes;
  private Integer loopInterval;
  private Environment environment;
  private Integer badgeType;
  private String statTag;
  private Long seq;
  private TagListObject tagList;
  private List<String> accountList;
  private AccountPushType accountPushType;
  private AccountType accountType;
  private List<String> tokenList;
  private String pushId;


  private String title;
  private String content;
  private ArrayList<AcceptTimePair> acceptTime;
  private String xgMediaResources;
  private MessageAndroid android;
  private MessageIOS ios;

  private XingePushRequestBuilder() {
  }

  public static XingePushRequestBuilder builder() {
    return new XingePushRequestBuilder();
  }

  public XingePushRequestBuilder withAudienceType(AudienceType audienceType) {
    this.audienceType = audienceType;
    return this;
  }

  public XingePushRequestBuilder withPlatform(Platform platform) {
    this.platform = platform;
    return this;
  }

  public XingePushRequestBuilder withMessageType(MessageType messageType) {
    this.messageType = messageType;
    return this;
  }

  public XingePushRequestBuilder withExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  public XingePushRequestBuilder withSendTime(String sendTime) {
    this.sendTime = sendTime;
    return this;
  }

  public XingePushRequestBuilder withMultiPkg(Boolean multiPkg) {
    this.multiPkg = multiPkg;
    return this;
  }

  public XingePushRequestBuilder withLoopTimes(Integer loopTimes) {
    this.loopTimes = loopTimes;
    return this;
  }

  public XingePushRequestBuilder withLoopInterval(Integer loopInterval) {
    this.loopInterval = loopInterval;
    return this;
  }

  public XingePushRequestBuilder withEnvironment(Environment environment) {
    this.environment = environment;
    return this;
  }

  public XingePushRequestBuilder withBadgeType(Integer badgeType) {
    this.badgeType = badgeType;
    return this;
  }

  public XingePushRequestBuilder withStatTag(String statTag) {
    this.statTag = statTag;
    return this;
  }

  public XingePushRequestBuilder withSeq(Long seq) {
    this.seq = seq;
    return this;
  }

  public XingePushRequestBuilder withTagList(TagListObject tagList) {
    this.tagList = tagList;
    return this;
  }

  public XingePushRequestBuilder withAccountList(List<String> accountList) {
    this.accountList = accountList;
    return this;
  }

  public XingePushRequestBuilder withAccountPushType(AccountPushType accountPushType) {
    this.accountPushType = accountPushType;
    return this;
  }

  public XingePushRequestBuilder withAccountType(AccountType accountType) {
    this.accountType = accountType;
    return this;
  }

  public XingePushRequestBuilder withTokenList(List<String> tokenList) {
    this.tokenList = tokenList;
    return this;
  }

  public XingePushRequestBuilder withPushId(String pushId) {
    this.pushId = pushId;
    return this;
  }

  public XingePushRequestBuilder withTitle(String title) {
    this.title = title;
    return this;
  }

  public XingePushRequestBuilder withContent(String content) {
    this.content = content;
    return this;
  }

  public XingePushRequestBuilder withAcceptTime(ArrayList<AcceptTimePair> acceptTime) {
    this.acceptTime = acceptTime;
    return this;
  }

  public XingePushRequestBuilder withXgMediaResources(String xgMediaResources) {
    this.xgMediaResources = xgMediaResources;
    return this;
  }

  public XingePushRequestBuilder withAndroid(MessageAndroid android) {
    this.android = android;
    return this;
  }

  public XingePushRequestBuilder withIos(MessageIOS ios) {
    this.ios = ios;
    return this;
  }

  public XingePushRequest build() {

    XingePushRequest xingePushRequest = new XingePushRequest();
    xingePushRequest.setAudienceType(audienceType.getName());
    xingePushRequest.setPlatform(platform.getName());
    xingePushRequest.setMessage(
      new Message()
        .setAcceptTime(this.acceptTime)
        .setContent(this.content)
        .setTitle(this.title)
        .setXgMediaResources(this.xgMediaResources)
        .setAndroid(this.android)
        .setIos(this.ios)
    );
    xingePushRequest.setMessageType(messageType.getName());
    xingePushRequest.setExpireTime(expireTime);
    xingePushRequest.setSendTime(sendTime);
    xingePushRequest.setMultiPkg(multiPkg);
    xingePushRequest.setLoopTimes(loopTimes);
    xingePushRequest.setLoopInterval(loopInterval);
    if(null != environment){
      xingePushRequest.setEnvironment(environment.getName());
    }

    xingePushRequest.setBadgeType(badgeType);
    xingePushRequest.setStatTag(statTag);
    xingePushRequest.setSeq(seq);
    xingePushRequest.setTagList(tagList);
    xingePushRequest.setAccountList(accountList);
    if(null != accountPushType){
      xingePushRequest.setAccountPushType(accountPushType.getType());
    }
    if(null != accountType){
      xingePushRequest.setAccountType(accountType.getType());
    }
    xingePushRequest.setTokenList(tokenList);
    xingePushRequest.setPushId(pushId);
    return xingePushRequest;
  }
}
