package cn.zplatform.appapi.app;

/**
 * 初始化配置
 * 包括app配置和Domain配置
 * ⚠ app信息️主要用于接口校验  ⚠
 * ⚠ Domain 不同的请求会请求不同的Domain  ⚠
 * @author Lilac
 * 2020-03-31
 */
public interface InitConfig {

    /**
     * 获取 AppId 请前往https://developer.zplatform.cn/apply/list 页面获取
     * @return AppId
     */
    String getAppId();

    /**
     * 获取 AppSecret 请前往https://developer.zplatform.cn/apply/list 页面获取
     * @return AppSecret
     */
    String getAppSecret();

    /**
     * 获取appKey 请前往https://developer.zplatform.cn/apply/list 页面获取
     * @return AppKey
     */
    String getAppKey();

    /**
     * 获取apiKey TODO wiki链接
     * @return AppKey
     */
    String getApiKey();

    /**
     * 获取debug_mode TODO wiki链接
     * @return debug_mode
     */
    String getDebugMode();

    /**
     * 获取debug_mode TODO wiki链接
     * @return debug_mode
     */
    Integer getProjectId();

    /**
     * 获取Domian
     * @return domain
     */
    String getDomain();

    /**
     * 返回 数据是否为空
     * @return true : initConfig为空    false ： initConfig不为空
     */
    boolean isEmpty();


    /**
     * 判断DOMAIN 是否配置。如果未配置需要根据不同环境进行DOMAIN配置
     *
     * @author Lilac
     * 2020-03-31
     */
    boolean isDisabledDomain();
}
