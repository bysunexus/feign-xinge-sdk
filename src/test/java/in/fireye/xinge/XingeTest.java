package in.fireye.xinge;

import in.fireye.xinge.api.XingeApi;
import in.fireye.xinge.dto.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class XingeTest {
  private XingeApi xingeApi;

  @Before
  public void setUp() throws Exception {
    XingeApiCreator apis = new XingeApiCreator();
    apis.setAppid("2302601681ede");
    apis.setSecretkey("fb4c61481c9faa2f977c958d78501ba0");

    this.xingeApi = apis.createXingeApi();
  }

  @Test
  public void tagTest(){
    XingeResponse resp = xingeApi.tag(XingeTagRequest.builder()
      .withOperatorType(OperatorType.ADD_SINGLE_TAG_SINGLE)
      .withPlatform(Platform.android)
      .withTag("tag1")
      .withToken("token1")
      .build()
    );
    assertEquals("应当相应成功结果", 0, resp.getRetCode());
    System.out.println(resp.toString());
  }

  @Test
  public void pushTest(){
    XingePushRequest request = new XingePushRequest();
    request.setAudienceType(AudienceType.account.getName());
    request.setPlatform(Platform.android.getName());
    request.setMessageType(MessageType.notify.getName());

    Message message = new Message();
    message.setTitle("test");
    message.setContent("test");
    MessageAndroid android = new MessageAndroid();
    android.setnId(0);
    message.setAndroid(android);
    request.setMessage(message);
    request.setAccountList(Collections.singletonList("account1"));

    XingeResponse resp = xingeApi.push(request);
    assertEquals("测试帐号中没有绑定account所以错误", 10303, resp.getRetCode());
    System.out.println(resp.toString());
  }
}
