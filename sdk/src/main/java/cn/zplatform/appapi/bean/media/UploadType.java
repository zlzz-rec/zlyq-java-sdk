package cn.zplatform.appapi.bean.media;

/**
 * 上传类型
 *
 * @author Lilac
 * 2020-04-15
 */
public enum UploadType {
    UploadType(1), // 未知
    UploadTypeUnknown(2), // 拍摄
    UploadTypeShot(3) // 本地导入
    ;

    private final int event;

    UploadType(Integer value) {
        this.event = value;
    }
}
