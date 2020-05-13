package cn.zplatform.appapi.bean.user;

import cn.zplatform.appapi.http.RawBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * 用户关注数据导入
 * 参见 中台API文档 https://wiki.zplatform.cn/pages/server_user_iface.html
 *
 * @author Lilac
 * 2020-03-31
 */

@Builder
@AllArgsConstructor
@Data

public class UserFollowRawBody implements RawBody {
    String userId;
    Map<String, Long> followMap;
}
