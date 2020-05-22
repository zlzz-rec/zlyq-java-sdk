package cn.zplatform.appapi.bean.track;

/**
 * 调试模式
 *
 * @author Lilac
 * 2020-05-22
 */
public enum DebugMode {

    NO_DEBUG_MODE("no_debug"),
    DEBUG_AND_IMPORT("debug_and_import"),
    DEBUG_AND_NOT_IMPORT("debug_and_not_import");

    private final String debug_mode;

    DebugMode(String value) {
        this.debug_mode = value;
    }

    String value(){
        return this.debug_mode;
    }
}
