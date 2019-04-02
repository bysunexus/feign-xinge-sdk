package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.fireye.xinge.dto.ios.Aps;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageIOS {

  @JsonProperty(value = "aps", required = true)
  private Aps aps;

  @JsonProperty(value = "custom")
  private String custom;

  @JsonProperty(value = "xg")
  private String xg;


  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public String getXg() {
    return xg;
  }

  public void setXg(String xg) {
    this.xg = xg;
  }


  public Aps getAps() {
    return aps;
  }

  public void setAps(Aps aps) {
    this.aps = aps;
  }

}
