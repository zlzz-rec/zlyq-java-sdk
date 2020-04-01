package cn.zplatform.appapi.bean.user;

import cn.zplatform.appapi.http.RequestBody;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

/**
 * 用户关注数据导入
 * 参见 中台API文档 TODO 未查询到文档
 *
 * @author Lilac
 * 2020-03-31
 */

@Builder
@AllArgsConstructor
@Data

public class UserFollowRequest implements RequestBody {
    String userId;
    Map<String, Long> followMap;
}