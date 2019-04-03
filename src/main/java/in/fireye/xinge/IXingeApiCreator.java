package in.fireye.xinge;

import in.fireye.xinge.api.XingeApi;

/**
 * feign-xinge-sdk
 * 信鸽api构建器接口
 *
 * @author Ben
 * @date 2019-04-03 17:52
 **/
public interface IXingeApiCreator {
  /**
   * 创建信鸽api
   * @return XingeApi实例
   */
  XingeApi createXingeApi();
}
