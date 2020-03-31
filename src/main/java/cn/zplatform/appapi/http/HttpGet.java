package cn.zplatform.appapi.http;

import org.apache.http.client.methods.HttpPost;

/**
 * 封装Get请求
 * 项目中Get请求比较特殊。需要通过Body传值。httpclient 默认不支持 这里进行一次封装
 * 参考 https://stackoverflow.com/questions/12535016/apache-httpclient-get-with-body
 *
 * @author Lilac
 * 2020-03-31
 */
public class HttpGet extends HttpPost {
    public final static String METHOD_NAME = "GET";

    public HttpGet(String url) {
        super(url);
    }

    @Override
    public String getMethod() {
        return METHOD_NAME;
    }
}
