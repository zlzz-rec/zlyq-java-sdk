package cn.zplatform.appapi.bean.track;

/**
 * 手机系统 类型
 *
 * @author Lilac
 * 2020-05-22
 */
public enum Os {
    IOS("Ios"),
    ANDROID("Android"),
    WINDOWS_PHONE("Windows phone"),
    YUN_OS("YunOS"),
    SYMBIAN("Symbian");

    private final String os;

    Os(String value) {
        this.os = value;
    }
    public String value(){
        return this.os;
    }
}
