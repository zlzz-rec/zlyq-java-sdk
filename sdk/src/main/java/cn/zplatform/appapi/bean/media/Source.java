package cn.zplatform.appapi.bean.media;

/**
 * 视频来源
 *
 * @author Lilac
 * 2020-04-15
 */
public enum Source {
    SourceUserUpload(1), // 用户上传
    SourceAdminUpload(2), // 后台上传
    SourceSpider(3) // 爬虫
    ;

    private final int event;

    Source(Integer value) {
        this.event = value;
    }
}
