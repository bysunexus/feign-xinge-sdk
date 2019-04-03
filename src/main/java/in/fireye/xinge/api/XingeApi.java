package in.fireye.xinge.api;

import feign.RequestLine;
import in.fireye.xinge.dto.*;

/**
 *
 */
public interface XingeApi {
  /**
   * push_api_v3
   * https://xg.qq.com/docs/server_api/v3/push_api_v3.html
   *
   * @param message 请求
   * @return 响应结果
   */
  @RequestLine("POST /push/app")
  XingeResponse push(XingePushRequest message);

  /**
   * tag_api_v3
   * https://xg.qq.com/docs/server_api/v3/tag_api_v3.html
   *
   * @param request 请求
   * @return 响应结果
   */
  @RequestLine("POST /device/tag")
  XingeResponse tag(XingeTagRequest request);

  /**
   * 账号绑定与解绑（批量操作）
   * https://xg.qq.com/docs/server_api/v3/account-api.html
   *
   * @param request 请求
   * @return 操作结果
   */
  @RequestLine("POST /device/account/batchoperate")
  XingeResponse accountBatchOperate(XingeAccountBatchRequest request);

  /**
   * 账号绑定与解绑（批量操作）
   * https://xg.qq.com/docs/server_api/v3/account-api.html
   *
   * @param request 请求
   * @return 操作结果
   */
  @RequestLine("POST /device/account/query")
  XingeAccountQueryResponse accountQuery(XingeAccountQueryRequest request);
}
