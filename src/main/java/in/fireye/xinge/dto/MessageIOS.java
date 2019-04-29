package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.fireye.xinge.dto.ios.Aps;

import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageIOS {

  @JsonProperty(value = "aps", required = true)
  private Aps aps;

  @JsonProperty(value = "custom")
  private Map<String, Object> custom;

  public Aps getAps() {
    return aps;
  }

  public MessageIOS setAps(Aps aps) {
    this.aps = aps;
    return this;
  }

  public Map<String, Object> getCustom() {
    return custom;
  }

  public MessageIOS setCustom(Map<String, Object> custom) {
    this.custom = custom;
    return this;
  }
}
