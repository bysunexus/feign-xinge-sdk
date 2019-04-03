package in.fireye.xinge.http;

import feign.Feign;

/**
 * feign-xinge-sdk
 * 默认 feign builder 创建
 *
 * @author Ben
 * @date 2019-04-03 11:52
 **/
public class DefaultFeignBuilderCreator implements IFeignBuilderCreator{
  @Override
  public Feign.Builder create() {
    return Feign.builder();
  }
}
