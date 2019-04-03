package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.Serializable;
import java.util.Objects;

/**
 * feign-xinge-sdk
 * 信鸽接口相应
 *
 * @author Ben
 * @date 2019-04-03 11:28
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingeResponse implements Serializable {
  private static final long serialVersionUID = -860098791027354902L;

  /**
   * 与请求包一致（如果请求包是非法json该字段为0）
   */
  @JsonProperty("seq")
  private long seq;
  /**
   * 错误码，详细参照错误码对照表
   */
  @JsonProperty("ret_code")
  private int retCode;
  /**
   * 请求出错时的错误信息
   */
  @JsonProperty("err_msg")
  private String errMsg;
  /**
   * 推送id
   */
  @JsonProperty("push_id")
  private String pushId;
  /**
   * ios 推送环境
   */
  @JsonProperty("environment")
  private String environment;
  /**
   * 请求正确时，若有额外数据要返回，则结果封装在该字段的json中，若无额外数据，则可能无此字段
   */
  @JsonProperty("result")
  private String result;

  public long getSeq() {
    return seq;
  }

  public void setSeq(long seq) {
    this.seq = seq;
  }

  public int getRetCode() {
    return retCode;
  }

  public void setRetCode(int retCode) {
    this.retCode = retCode;
  }

  public String getErrMsg() {
    return errMsg;
  }

  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }

  public String getPushId() {
    return pushId;
  }

  public void setPushId(String pushId) {
    this.pushId = pushId;
  }

  public String getEnvironment() {
    return environment;
  }

  public void setEnvironment(String environment) {
    this.environment = environment;
  }

  public String getResult() {
    return result;
  }

  @JsonSetter("result")
  public void setResult(JsonNode data) {
    switch(data.getNodeType()) {
      case POJO:
      case OBJECT:
      case NUMBER:
      case BOOLEAN:
      case BINARY:
      case ARRAY:
        this.result = data.toString();
        break;
      case MISSING:
      case NULL:
        this.result = null;
        break;
      case STRING:
      default:
        this.result = data.textValue();
    }

  }

  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    XingeResponse that = (XingeResponse) o;
    return Objects.equals(seq, that.seq) &&
      Objects.equals(retCode, that.retCode) &&
      Objects.equals(errMsg, that.errMsg) &&
      Objects.equals(pushId, that.pushId) &&
      Objects.equals(environment, that.environment) &&
      Objects.equals(result, that.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seq, retCode, errMsg, pushId, environment, result);
  }

  @Override
  public String toString() {
    return "XingeResponse{" +
      "seq=" + seq +
      ", retCode=" + retCode +
      ", errMsg='" + errMsg + '\'' +
      ", pushId='" + pushId + '\'' +
      ", environment='" + environment + '\'' +
      ", result='" + result + '\'' +
      '}';
  }
}
