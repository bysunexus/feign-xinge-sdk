package in.fireye.xinge;

import com.google.common.collect.ImmutableMap;
import in.fireye.xinge.api.XingeApi;
import in.fireye.xinge.dto.*;

import static org.junit.Assert.*;

import in.fireye.xinge.enums.AudienceType;
import in.fireye.xinge.enums.MessageType;
import in.fireye.xinge.enums.OperatorType;
import in.fireye.xinge.enums.Platform;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class XingeTest {
  private XingeApi xingeApi;
  private XingeApi xingeHystrixApi;

  @Before
  public void setUp() throws Exception {
    XingeApiCreator creator = new XingeApiCreator();
    creator.setAppid("2302601681ede");
    creator.setSecretkey("fb4c61481c9faa2f977c958d78501ba0");
    this.xingeApi = creator.createXingeApi();

    XingeApiHystrixCreator hystrixCreator = new XingeApiHystrixCreator();
    hystrixCreator.setAppid("2302601681ede");
    hystrixCreator.setSecretkey("fb4c61481c9faa2f977c958d78501ba0");
    this.xingeHystrixApi = hystrixCreator.createXingeApi();
  }

  @Test
  public void tagTest(){
    XingeTagRequest req = XingeTagRequest.builder()
      .withOperatorType(OperatorType.ADD_SINGLE_TAG_SINGLE)
      .withPlatform(Platform.android)
      .withTag("tag1")
      .withToken("token1")
      .build();
    XingeResponse resp = xingeApi.tag(req);
    assertEquals("应当相应成功结果", 0, resp.getRetCode());
    resp = xingeHystrixApi.tag(req);
    assertEquals("应当相应成功结果", 0, resp.getRetCode());
    System.out.println(resp.toString());
  }

  @Test
  public void pushTest(){

    XingePushRequest request = XingePushRequestBuilder.builder()
      .withAudienceType(AudienceType.account)
      .withPlatform(Platform.android)
      .withMessageType(MessageType.notify)
      .withTitle("test")
      .withContent("test")
      .withAndroid(
        new MessageAndroid()
          .setCustomContent(
            ImmutableMap.of("test", "test")
          )
      )
      .withAccountList(Collections.singletonList("account1"))
      .build();

    XingeResponse resp = xingeApi.push(request);
    assertEquals("测试帐号中没有绑定account所以错误", 10303, resp.getRetCode());
    resp = xingeHystrixApi.push(request);
    assertEquals("测试帐号中没有绑定account所以错误", 10303, resp.getRetCode());
    System.out.println(resp.toString());
  }
}
