package cn.zplatform.appapi.bean.user;

import cn.zplatform.appapi.http.RequestBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 用户信息同步 请求Body封装
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_user_iface.html
 *
 * @author Lilac
 * 2020-03-31
 */

@Builder
@AllArgsConstructor
@Data
public class UserInfoSynchronizeRequest implements RequestBody {

    private String thirdId;
    private String account;
    private String password;
    private String nickname;
    private String avatar;
    private int gender;
    private long birthday;
    private String signature;
    private String region;
    private String extraInfo;
    private long createdAt;
    private long updatedAt;
    private long LoginTime;
    private int is_robot;
    private int status;
    private boolean avatarStorage;
    private String phone;
    private String udid;
    private String deviceType;
}
