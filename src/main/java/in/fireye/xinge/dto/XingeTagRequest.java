package in.fireye.xinge.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * feign-xinge-sdk
 *
 * @author <a href="mailto:sby@servyou.com.cn">ben</a>
 * @date 2019-03-27 11:32
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XingeTagRequest implements Serializable {
  private static final long serialVersionUID = 2821896566297135145L;
  @JsonProperty("operator_type")
  private Integer operatorType;
  @JsonProperty("platform")
  private String platform;
  @JsonProperty("token_list")
  private List<String> tokenList;
  @JsonProperty("tag_list")
  private List<String> tagList;
  @JsonProperty("tag_token_list")
  private List<String[]> tagTokenList;
  @JsonProperty("seq")
  private Long seq;
  @JsonProperty("op_type")
  private String opType;
  @JsonProperty("op_id")
  private String opId;

  public static Builder builder() {
    return new Builder();
  }

  public String getOpId() {
    return opId;
  }

  public void setOpId(String opId) {
    this.opId = opId;
  }

  public String getOpType() {
    return opType;
  }

  public void setOpType(String opType) {
    this.opType = opType;
  }

  public Integer getOperatorType() {
    return operatorType;
  }

  public void setOperatorType(Integer operatorType) {
    this.operatorType = operatorType;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Long getSeq() {
    return seq;
  }

  public void setSeq(Long seq) {
    this.seq = seq;
  }

  public List<String> getTagList() {
    return tagList;
  }

  public void setTagList(List<String> tagList) {
    this.tagList = tagList;
  }

  public List<String[]> getTagTokenList() {
    return tagTokenList;
  }

  public void setTagTokenList(List<String[]> tagTokenList) {
    this.tagTokenList = tagTokenList;
  }

  public List<String> getTokenList() {
    return tokenList;
  }

  public void setTokenList(List<String> tokenList) {
    this.tokenList = tokenList;
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatorType, platform, tokenList, tagList, tagTokenList, seq, opType, opId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XingeTagRequest that = (XingeTagRequest) o;
    return Objects.equals(operatorType, that.operatorType) &&
      Objects.equals(platform, that.platform) &&
      Objects.equals(tokenList, that.tokenList) &&
      Objects.equals(tagList, that.tagList) &&
      Objects.equals(tagTokenList, that.tagTokenList) &&
      Objects.equals(seq, that.seq) &&
      Objects.equals(opType, that.opType) &&
      Objects.equals(opId, that.opId);
  }

  @Override
  public String toString() {
    return "TagRequest{" +
      "operatorType=" + operatorType +
      ", platform='" + platform + '\'' +
      ", tokenList=" + tokenList +
      ", tagList=" + tagList +
      ", tagTokenList=" + tagTokenList +
      ", seq=" + seq +
      ", opType='" + opType + '\'' +
      ", opId='" + opId + '\'' +
      '}';
  }

  public static final class TagTokenPair {
    private String tag;
    private String token;

    public TagTokenPair() {
    }

    public TagTokenPair(String tag, String token) {
      this.tag = tag;
      this.token = token;
    }

    public String getTag() {
      return tag;
    }

    public TagTokenPair setTag(String tag) {
      this.tag = tag;
      return this;
    }

    public String getToken() {
      return token;
    }

    public TagTokenPair setToken(String token) {
      this.token = token;
      return this;
    }

    public String[] toStringArray() {
      return new String[]{this.tag, this.token};
    }
  }

  public static final class Builder {
    private Integer operatorType;
    private String platform;
    private List<String> tokenList;
    private List<String> tagList;
    private List<String[]> tagTokenList;
    private Long seq;
    private String opType;
    private String opId;

    private Builder() {
    }

    public XingeTagRequest build() {
      XingeTagRequest tagRequest = new XingeTagRequest();
      tagRequest.setOperatorType(operatorType);
      tagRequest.setPlatform(platform);
      tagRequest.setTokenList(tokenList);
      tagRequest.setTagList(tagList);
      tagRequest.setTagTokenList(tagTokenList);
      tagRequest.setSeq(seq);
      tagRequest.setOpType(opType);
      tagRequest.setOpId(opId);
      return tagRequest;
    }

    public Builder withOpId(String opId) {
      this.opId = opId;
      return this;
    }

    public Builder withOpType(String opType) {
      this.opType = opType;
      return this;
    }

    public Builder withOperatorType(OperatorType operatorType) {
      this.operatorType = operatorType.getType();
      return this;
    }

    public Builder withPlatform(Platform platform) {
      this.platform = platform.getName();
      return this;
    }

    public Builder withSeq(Long seq) {
      this.seq = seq;
      return this;
    }

    public Builder withTag(String tag) {
      this.tagList = Collections.singletonList(tag);
      return this;
    }

    public Builder withTagList(List<String> tagList) {
      this.tagList = tagList;
      return this;
    }

    public Builder withTagTokenList(List<TagTokenPair> tagTokenPairList) {
      this.tagTokenList = tagTokenPairList.stream()
        .map(TagTokenPair::toStringArray)
        .collect(Collectors.toList());
      return this;
    }

    public Builder withToken(String token) {
      this.tokenList = Collections.singletonList(token);
      return this;
    }

    public Builder withTokenList(List<String> tokenList) {
      this.tokenList = tokenList;
      return this;
    }
  }
}
