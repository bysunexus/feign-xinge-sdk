package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {

  @JsonProperty("title")
  private String title;

  @JsonProperty("content")
  private String content;

  @JsonProperty("accept_time")
  private ArrayList<AcceptTimePair> acceptTime;

  @JsonProperty("xg_media_resources")
  private String xgMediaResources;

  @JsonProperty("android")
  private MessageAndroid android;

  @JsonProperty("ios")
  private MessageIOS ios;

  public String getTitle() {
    return title;
  }

  public Message setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getContent() {
    return content;
  }

  public Message setContent(String content) {
    this.content = content;
    return this;
  }

  public ArrayList<AcceptTimePair> getAcceptTime() {
    return acceptTime;
  }

  public Message setAcceptTime(ArrayList<AcceptTimePair> acceptTime) {
    this.acceptTime = acceptTime;
    return this;
  }

  public String getXgMediaResources() {
    return xgMediaResources;
  }

  public Message setXgMediaResources(String xgMediaResources) {
    this.xgMediaResources = xgMediaResources;
    return this;
  }

  public MessageAndroid getAndroid() {
    return android;
  }

  public Message setAndroid(MessageAndroid android) {
    this.android = android;
    return this;
  }

  public MessageIOS getIos() {
    return ios;
  }

  public Message setIos(MessageIOS ios) {
    this.ios = ios;
    return this;
  }
}
