package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Administrator on 2018/7/10.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptTimePair {

  @JsonProperty("start")
  public AcceptTimePoint start;

  @JsonProperty("end")
  public AcceptTimePoint end;

  public AcceptTimePoint getStart() {
    return start;
  }

  public void setStart(AcceptTimePoint start) {
    this.start = start;
  }

  public AcceptTimePoint getEnd() {
    return end;
  }

  public void setEnd(AcceptTimePoint end) {
    this.end = end;
  }
}
