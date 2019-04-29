package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import in.fireye.xinge.enums.OpType;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TagListObject {

  @JsonProperty("tags")
  private ArrayList<String> tags;

  @JsonProperty("op")
  private OpType op;

  public TagListObject() {
  }

  public TagListObject(ArrayList<String> tags, OpType op) {
    this.tags = tags;
    this.op = op;
  }

  public ArrayList<String> getTags() {
    return tags;
  }

  public void setTags(ArrayList<String> tags) {
    this.tags = tags;
  }

  public OpType getOp() {
    return op;
  }

  public void setOp(OpType op) {
    this.op = op;
  }
}


