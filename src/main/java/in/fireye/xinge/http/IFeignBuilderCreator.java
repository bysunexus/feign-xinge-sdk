package in.fireye.xinge.http;

import feign.Feign;

/**
 * feign-xinge-sdk
 * feign 构建
 *
 * @author Ben
 * @date 2019-04-03 11:49
 **/
public interface IFeignBuilderCreator {
  /**
   * 创建 feign builder
   * @return feign builder
   */
  Feign.Builder create();
}
