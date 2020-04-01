package cn.zplatform.appapi.auth;

/**
 * 身份验证
 *
 * @author Lilac
 * 2020-03-30
 */
public interface Auth {
    /**
     * 获取用于填充到Header中的计算结果
     * @return str
     */
    String getHeaderStr();
}
