package in.fireye.xinge.api;

import feign.RequestLine;
import in.fireye.xinge.dto.XingeResponse;
import in.fireye.xinge.dto.XingeTagRequest;

/**
 * https://xg.qq.com/docs/server_api/v3/tag_api_v3.html
 */
public interface TagApi {

  /**
   * tag_api_v3
   *
   * @param request 请求
   * @return 响应结果
   */
  @RequestLine("POST /device/tag")
  XingeResponse tag(XingeTagRequest request);
}
