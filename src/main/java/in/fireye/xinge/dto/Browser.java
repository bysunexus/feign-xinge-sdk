package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Browser {

  @JsonProperty(value = "url", required = true)
  private String url = "";

  @JsonProperty(value = "confirm", required = true)
  private int confirm;

  public String getUrl() {
    return url;
  }

  public Browser setUrl(String url) {
    this.url = url;
    return this;
  }

  public int getConfirm() {
    return confirm;
  }

  public Browser setConfirm(int confirm) {
    this.confirm = confirm;
    return this;
  }
}
