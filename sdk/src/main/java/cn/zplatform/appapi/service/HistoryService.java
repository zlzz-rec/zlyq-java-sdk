package cn.zplatform.appapi.service;

import cn.zplatform.appapi.app.InitConfig;
import cn.zplatform.appapi.bean.history.TrackInfo;

/**
 * 用户中心相关服务处理
 *
 * @author Lilac
 * 2020-03-31
 */
public interface HistoryService extends AppService {

    /**
     * 上传用户历史埋点数据
     * 调用次接口后会在中量系统中注册成功用户并得到用户唯一标识
     * @param body 请求Body数据
     * @param initConfig app数据
     * @return response
     */
    String trackSynchronize(TrackInfo body, InitConfig initConfig);

}
