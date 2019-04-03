package in.fireye.xinge;

import in.fireye.xinge.api.AccountApi;
import in.fireye.xinge.api.PushApi;
import in.fireye.xinge.api.TagApi;
import in.fireye.xinge.dto.*;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class XingeTest {

  private PushApi pushApi;
  private TagApi tagApi;
  private AccountApi accountApi;

  @Before
  public void setUp() throws Exception {
    XingeApisFactory apis = XingeApisFactory.builder()
      .withAppid("2302601681ede")
      .withSecretkey("fb4c61481c9faa2f977c958d78501ba0")
      .build();
    this.pushApi = apis.buildPush();
    this.tagApi = apis.buildTag();
    this.accountApi = apis.buildAccount();
  }

  @Test
  public void tagTest(){
    XingeResponse resp = tagApi.tag(XingeTagRequest.builder()
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

    XingeResponse resp = pushApi.push(request);
    assertEquals("测试帐号中没有绑定account所以错误", 10303, resp.getRetCode());
    System.out.println(resp.toString());
  }
}
