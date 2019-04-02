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

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ArrayList<AcceptTimePair> getAcceptTime() {
    return acceptTime;
  }

  public void setAcceptTime(ArrayList<AcceptTimePair> acceptTime) {
    this.acceptTime = acceptTime;
  }

  public String getXgMediaResources() {
    return xgMediaResources;
  }

  public void setXgMediaResources(String xgMediaResources) {
    this.xgMediaResources = xgMediaResources;
  }

  public MessageAndroid getAndroid() {
    return android;
  }

  public void setAndroid(MessageAndroid android) {
    this.android = android;
  }

  public MessageIOS getIos() {
    return ios;
  }

  public void setIos(MessageIOS ios) {
    this.ios = ios;
  }
}
