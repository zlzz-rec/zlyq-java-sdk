package cn.zplatform.appapi.app;

public interface AppInfo {

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
     * 返回 数据是否为空
     * @return true : appInfo为空    false ： appInfo不为空
     */
    boolean isEmpty();
}
