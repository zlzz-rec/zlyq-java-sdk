package cn.zplatform.appapi.app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * 开普勒 InitConfig 仅供参考
 *
 * @author Lilac
 * 2020-03-31
 */
@Data
@Builder
@AllArgsConstructor
public class KeplerInitConfig implements InitConfig {

    String apiKey;
    String domain;
    String debugMode;
    Integer projectId;

    @Override
    public String getAppId() {
        return null;
    }

    @Override
    public String getAppSecret() {
        return null;
    }

    @Override
    public String getAppKey() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return StringUtils.isEmpty(apiKey);
    }

    @Override
    public boolean isDisabledDomain(){
        return StringUtils.isEmpty(this.domain) ;
    }
}
