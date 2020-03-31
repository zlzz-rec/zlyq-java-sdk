package cn.zplatform.appapi.service.impl;

import cn.zplatform.appapi.app.AppInfo;
import cn.zplatform.appapi.app.DefaultAppInfo;

/**
 * 进行提交的类用于本地测试
 *
 * @author Lilac
 * 2020-03-31
 */
public class Submit {

    public final static AppInfo appInfo = DefaultAppInfo.builder()
            .appId("")
            .appKey( "")
            .appSecret("")
            .build();

}
