package cn.zplatform.appapi.util;

import java.util.Map;

/**
 * 处理请求相关的工具
 *
 * @author Lilac
 * 2020-03-31
 */
public class RequestTools {

    public static String handlerParamStr(Map<String, String> params) {

        StringBuilder suffix = new StringBuilder();

        for (Map.Entry<String, String > entry: params.entrySet()){
            suffix.append(suffix.length() == 0 ? "?" : "&").append(entry.getKey()).append("=").append(entry.getValue());
        }

        return suffix.toString();
    }
}
