package in.fireye.xinge.api;

import feign.RequestLine;
import in.fireye.xinge.dto.XingePushRequest;
import in.fireye.xinge.dto.XingeResponse;

/**
 * https://xg.qq.com/docs/server_api/v3/push_api_v3.html
 */
public interface PushApi {
  /**
   * push_api_v3
   *
   * @param message 请求
   * @return 响应结果
   */

  @RequestLine("POST /push/app")
  XingeResponse push(XingePushRequest message);
}
