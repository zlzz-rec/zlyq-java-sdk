package cn.zplatform.appapi.bean.history;

import lombok.Getter;

/**
 * 内容类型
 *
 * @author Lilac
 * 2020-04-01
 */
@Getter
public enum ContentType {

    ContentTypeVideo  (1),
    ContentTypeShortArticle (2),
    ContentTypeLongArticle  (3)
    ;

    private final int contentType;

    ContentType(int value) {
        this.contentType = value;
    }

}
