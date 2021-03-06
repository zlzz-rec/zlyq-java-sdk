package cn.zplatform.appapi.bean.history.track;

import cn.zplatform.appapi.bean.history.EventCommon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 登录
 * 有登陆结果时触发
 *
 * @author Lilac
 * 2020-04-01
 */
@Builder
@AllArgsConstructor
@Data
public class TrackLogin extends EventCommon {

    private int methord; // 注册方式:  1:手机号   2:微信
    private int isSuccess; // 是否成功:  0失败；1 成功
    private String failReason; // 失败原因

}
