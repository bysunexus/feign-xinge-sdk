package in.fireye.xinge.http;

import feign.Client;

/**
 * feign-xinge-sdk
 * 默认client builder
 *
 * @author Ben
 * @date 2019-04-03 11:28
 **/
public class DefaultClientCreator implements IClientCreator {
  @Override
  public Client create() {
    return new Client.Default(null, null);
  }
}
