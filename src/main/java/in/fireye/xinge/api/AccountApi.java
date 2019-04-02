package in.fireye.xinge.api;

import feign.RequestLine;
import in.fireye.xinge.dto.XingeAccountBatchRequest;
import in.fireye.xinge.dto.XingeAccountQueryRequest;
import in.fireye.xinge.dto.XingeAccountQueryResponse;
import in.fireye.xinge.dto.XingeResponse;

/**
 * https://xg.qq.com/docs/server_api/v3/account-api.html
 */
public interface AccountApi {

  /**
   * 账号绑定与解绑（批量操作）
   * @param request 请求
   * @return 操作结果
   */
  @RequestLine("POST /device/account/batchoperate")
  XingeResponse accountBatchOperate(XingeAccountBatchRequest request);
  /**
   * 账号绑定与解绑（批量操作）
   * @param request 请求
   * @return 操作结果
   */
  @RequestLine("POST /device/account/query")
  XingeAccountQueryResponse accountQuery(XingeAccountQueryRequest request);
}
