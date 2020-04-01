package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.app.DefaultInitConfig;

/**
 * 进行提交的类用于本地测试
 *
 * @author Lilac
 * 2020-03-31
 */
public class Submit {

    public final static InitConfig app = DefaultInitConfig.builder()
            .appId("")
            .appKey( "")
            .appSecret("")
            .domain("")
            .build();
    public final static InitConfig track = DefaultInitConfig.builder()
            .appId("")
            .appKey( "")
            .appSecret("")
            .domain("")
            .build();

}
