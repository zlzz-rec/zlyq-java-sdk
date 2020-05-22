package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.http.RawBody;

import java.util.Map;

/**
 * app相关接口
 *
 * @author Lilac
 * 2020-03-31
 */
public interface AppService {


    String get(String url, Map<String, String> params, RawBody body, InitConfig initConfig) ;


    String post(String url, Map<String, String> params, RawBody body, InitConfig initConfig);


}
