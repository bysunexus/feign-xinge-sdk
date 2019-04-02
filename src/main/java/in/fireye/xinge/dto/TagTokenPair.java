package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagTokenPair {
  @JsonProperty(value = "tag")
  private String tag;
  @JsonProperty(value = "token")
  private String token;

  /**
   * @param tag   tag
   * @param token token
   */
  public TagTokenPair(String tag, String token) {
    this.tag = tag;
    this.token = token;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

}
