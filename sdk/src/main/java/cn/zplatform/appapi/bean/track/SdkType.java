package cn.zplatform.appapi.bean.track;

/**
 * sdk 类型
 *
 * @author Lilac
 * 2020-05-22
 */
public enum SdkType {
    IOS("Ios"),
    ANDROID("Android"),
    H5("H5"),
    MP("Mp");
    private final String sdkType;

    SdkType(String value) {
        this.sdkType = value;
    }
    public String value(){
        return this.sdkType;
    }
}
