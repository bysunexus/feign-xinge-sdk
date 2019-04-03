package in.fireye.xinge.http;

import feign.Client;

public interface IClientCreator {
  /**
   * 创建 feign client
   * @return client
   */
  Client create();
}
