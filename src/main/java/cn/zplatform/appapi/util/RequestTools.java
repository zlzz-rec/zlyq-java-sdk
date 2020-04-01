package cn.zplatform.appapi.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Map;

/**
 * 处理请求相关的工具
 *
 * @author Lilac
 * 2020-03-31
 */
@Slf4j
public class RequestTools {

    public static String handlerParamStr(Map<String, String> params) {

        StringBuilder suffix = new StringBuilder();

        for (Map.Entry<String, String > entry: params.entrySet()){
            suffix.append(suffix.length() == 0 ? "?" : "&").append(entry.getKey()).append("=").append(entry.getValue());
        }

        return suffix.toString();
    }

    public static String execute(HttpUriRequest req) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(req)) {

            // Get HttpResponse Status
            log.debug("ProtocolVersion :[{}] StatusCode :[{}] ReasonPhrase :[{}]", response.getProtocolVersion(),
                    response.getStatusLine().getStatusCode(), response.getStatusLine().getReasonPhrase());

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // return it as a String
                String result = EntityUtils.toString(entity);
                log.debug("result :[{}]", result);
                return result;
            }

        } catch (IOException e) {
            log.error("请求出现错误 : " + e.getMessage());
            e.printStackTrace();
        }

        return "";
    }
}
