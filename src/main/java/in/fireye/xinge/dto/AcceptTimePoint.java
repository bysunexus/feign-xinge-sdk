package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Administrator on 2018/7/10.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptTimePoint {

  @JsonProperty(value = "hour", required = true)
  public String hour;

  @JsonProperty(value = "min", required = true)
  public String min;

  public String getHour() {
    return hour;
  }

  public void setHour(String hour) {
    this.hour = hour;
  }

  public String getMin() {
    return min;
  }

  public void setMin(String min) {
    this.min = min;
  }
}
