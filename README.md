# zlyq-java-sdk

安装使用 

最新jdk列表

maven 导入 
```xml
    <dependency>
        <groupId>com.github.zlzz-rec</groupId>
        <artifactId>sdk</artifactId>
        <version>0.0.2</version>
    </dependency>
```

接口调用 示例

- [测试用例](https://github.com/zlzz-rec/zlyq-java-sdk/tree/master/sdk/src/test/java/cn/zplatform/appapi/service/impl)
- 用户信息同步接口 示例
```java
package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppFactoryInitConfig;
import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.user.UserInfoSynchronizeRawBody;

public class UserInfoSynchronizeDemo {

    private UserInfoSynchronizeRequest userInfo() {
        return UserInfoSynchronizeRequest.builder()
                .thirdId("51982")
                .nickname("test name")
                .gender(1)
                .udid("ABC")
                .build();
    }

    private InitConfig initConfig() {
        return DefaultInitConfig.builder()
                .appId("")
                .appKey("")
                .appSecret("")
                .domain("http://testappapi.zplatform.cn")
                .build();
    }

    private String userInfoSynchronize() {
        return new UserServiceImpl().userInfoSynchronize(
                userInfo(),
                initConfig());
    }

    public static void main(String[] args) {
        String responseStr = new UserInfoSynchronizeDemo().userInfoSynchronize();
        System.out.println("接口返回数据为" + responseStr);
    }
}
```

问题反馈 