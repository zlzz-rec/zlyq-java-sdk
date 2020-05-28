package cn.zplatform.appapi.bean.track;

/**
 * sdk 类型
 *
 * @author Lilac
 * 2020-05-22
 */
public enum Platform {
    IOS("Ios"),
    ANDROID("Android"),
    H5("H5"),
    MP("Mp");
    private final String paltform;

    Platform(String value) {
        this.paltform = value;
    }
    public String value(){
        return this.paltform;
    }
}
