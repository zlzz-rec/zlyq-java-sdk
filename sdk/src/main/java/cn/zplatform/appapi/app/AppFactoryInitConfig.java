package cn.zplatform.appapi.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 默认 InitConfig 仅供参考
 *
 * @author Lilac
 * 2020-03-31
 */
@Data
@Builder
@AllArgsConstructor
public class AppFactoryInitConfig implements InitConfig {

    String appId;
    String appSecret;
    String appKey;
    String domain;

    @Override
    public boolean isEmpty() {
        return StringUtils.isEmpty(appId) || StringUtils.isEmpty(appSecret) || StringUtils.isEmpty(appKey);
    }

    @Override
    public boolean isDisabledDomain(){
        return StringUtils.isEmpty(this.domain) ;
    }
}
