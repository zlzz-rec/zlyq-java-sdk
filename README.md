# zlyq-java-sdk

### 中量引擎服务端SDK (JAVA)



### 安装方法

maven 导入 
```xml
    <dependency>
        <groupId>com.github.zlzz-rec</groupId>
        <artifactId>sdk</artifactId>
        <version>0.0.5</version>
    </dependency>
```

### 中量引擎官网

``` https://www.zplatform.cn/
https://www.zplatform.cn/
```

### 中量引擎官方文档

```https://wiki.zplatform.cn/
https://wiki.zplatform.cn/
```

### 集成方式

##### 集成中量分析服务(私有化)

集成中量分析服务服务的用户



- 设置用户画像 ```cn.zplatform.appapi.service.privateImpl.ProfileServiceImpl ```
- 埋点 ```cn.zplatform.appapi.service.privateImpl.ProfileServiceImpl.TrackServiceImpl```
-  initConfig (初始化参数)需要从中量引擎后台获取。



调用方式请参考

- ``` cn.zplatform.appapi.service.privateImpl.TrackServiceImplTest```

- ```cn.zplatform.appapi.service.privateImpl.ProfileServiceImplTest```



##### 集成中量引擎推荐服务(Saas)


集成中量引擎推荐服务的用户

Saas服务方式提供了向中量引擎服务同步用户数据、媒资数据及埋点数据(以及用户历史交互数据)的方法。

- 埋点数据同步 ```  cn.zplatform.appapi.service.impl.HistoryServiceImpl```  
- 媒资数据同步 ```cn.zplatform.appapi.service.impl.MediaSynchronizeServiceImpl```
- 媒资数据上传 ```cn.zplatform.appapi.service.impl.MediaUploadServiceImpl```
- 用户数据同步 ```cn.zplatform.appapi.service.impl.UserServiceImpl```
- 支付中心调用 ```cn.zplatform.appapi.service.impl.TransactionServiceImpl```




注意:`同步`是指将用户或物品的基本信息同步到中量引擎服务, 因为业务方只需要推荐结果然后自行组装数据所以不需要将源文件上传到中量服务。

调用方式请参考

-  埋点数据同步 ```cn.zplatform.appapi.service.impl.HistoryServiceImplTest```
-  媒资数据同步  ```cn.zplatform.appapi.service.impl.MediaSynchronizeServiceImplTest```
-  媒资数据上传 ```cn.zplatform.appapi.service.impl.MediaUploadServiceImplTest```
-  用户数据同步 ```cn.zplatform.appapi.service.impl.UserServiceImplTest```

-  支付中心调用  ```cn.zplatform.appapi.service.impl.TransactionServiceImplTest```




##### 集成中量引擎推荐服务及客户端信息流SDK(Sass)
集成中量引擎推荐服务的用户, 请使用client下的SyncClient, SyncClient初始化参数需要从中量引擎后台获取。

Saas服务方式提供了向中量引擎服务同步用户数据、媒资数据及埋点数据(以及用户历史交互数据)的方法。

注意:`上传`是指将源文件上传到中量引擎进而获取主键id的过程; `同步`是指将信息(包括上传得到的id)同步到中量引擎服务。因为业务方需要使用推荐结果加上配到的客户端信息流SDK, 所以需要上传源文件到中量服务。

调用方式请参考 ```集成中量引擎推荐服务```

3.项目使用相对路径, 请在工程根目录上一级以模块方式运行test文件, 示例



### 代码结构
```
.
├── README.md
├── pom.xml
├── sdk
│   ├── README.md
│   ├── pom.xml
│   └── src
│       ├── main
│       │   │   └── cn
│       │   │       └── zplatform
│       │   │           └── appapi
│       │   │               ├── app  初始化配置定义
│       │   │               ├── auth 接口校验
│       │   │               ├── bean 请求体定义
│       │   │               ├── http body定义
│       │   │               ├── path 路径定义
│       │   │               ├── service 业务实现
│       │   │               │   ├── impl
│       │   │               │   └── privateImpl
│       │   │               └── util 工具类
│       │   └── resources 配置文件
│       └── test
│               └── cn
│                   └── zplatform
│                       └── appapi 测试代码

```


### 几个基本操作
上传用户埋点

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