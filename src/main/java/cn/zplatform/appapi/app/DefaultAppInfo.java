package cn.zplatform.appapi.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 默认AppInfo 实现类。仅供参考
 *
 * @author Lilac
 * 2020-03-31
 */
@Data
@Builder
@AllArgsConstructor
public class DefaultAppInfo implements AppInfo {

    String appId;
    String appSecret;
    String appKey;

    @Override
    public boolean isEmpty() {
        return StringUtils.isEmpty(appId) || StringUtils.isEmpty(appSecret) || StringUtils.isEmpty(appKey);
    }
}
