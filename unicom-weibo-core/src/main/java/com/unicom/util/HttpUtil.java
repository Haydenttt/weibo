package com.unicom.util;

import com.unicom.exception.EmWeiboError;
import com.unicom.exception.WeiboException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @program: unicom
 * @description:
 * @author: Hayden TONG
 * @create: 2019-07-15 16:37
 **/

public class HttpUtil {

    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/75.0.3770.100 Safari/537.36";

    // 超时设置
    private static final RequestConfig requestConfig = RequestConfig.custom()
            .setConnectTimeout(5000)
            .setConnectionRequestTimeout(5000)
            .setSocketTimeout(10000)
            .build();

    // 编码设置
    private static final ConnectionConfig connectionConfig = ConnectionConfig.custom()
            .setMalformedInputAction(CodingErrorAction.IGNORE)
            .setUnmappableInputAction(CodingErrorAction.IGNORE)
            .setCharset(Consts.UTF_8)
            .build();

    private static HttpClientBuilder getBuilder() {
        List<Header> headers = new ArrayList<>();
        Header header = new BasicHeader("User-Agent", USER_AGENT);
        headers.add(header);
        return HttpClients.custom().setDefaultConnectionConfig(connectionConfig).setDefaultHeaders(headers).setDefaultRequestConfig(requestConfig);
    }

    /**
     * 发送HttpGet请求
     *
     * @param url 请求地址
     * @return
     */
    public static String sendGet(String url) {
        String result;
        HttpGet httpGet = new HttpGet(url);
        try (CloseableHttpClient httpclient = getBuilder().build();
             CloseableHttpResponse response = httpclient.execute(httpGet)) {
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity);
        } catch (Exception e) {
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("HTTP GET请求获取元数据失败！"));
        }
        return result;
    }

    /**
     * 发送HttpPost请求，参数为json字符串
     *
     * @param url   请求地址
     * @param param json字符串
     * @return
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！" + e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }


    /**
     * 发送HttpPost请求，提交表单，支持文件上传
     *
     * @param url    请求地址
     * @param params 表单参数
     * @param files  上传文件
     * @return
     */
    public static String sendPost(String url, Map<String, Object> params, List<MultipartFile> files) throws IOException {
        String result;
        // 设置entity
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setCharset(Charset.forName("UTF-8"));
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE);
        // 文件表单参数
        if (CollectionUtils.isNotEmpty(files)) {
            for (MultipartFile file : files) {
                Path path = Paths.get(file.getOriginalFilename());
                String contentType = Files.probeContentType(path);
                if (StringUtils.isEmpty(contentType)) {
                    contentType = "application/octet-stream";
                }
                builder.addBinaryBody(file.getName(), file.getInputStream(), ContentType.create(contentType), file.getOriginalFilename());
            }
        }
        // 普通表单参数
        if (MapUtils.isNotEmpty(params)) {
            params.forEach((k, v) -> {
                StringBody stringBody = new StringBody(v.toString(), ContentType.create("text/plain", "UTF-8"));
                builder.addPart(k, stringBody);
            });
        }

        HttpPost httpPost = new HttpPost(url);
        httpPost.setEntity(builder.build());

        try (CloseableHttpClient httpclient = getBuilder().build();
             CloseableHttpResponse httpResponse = httpclient.execute(httpPost)) {
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity);
        } catch (Exception e) {
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("HTTP POST MultipartFile请求获取元数据失败！"));
        }
        return result;
    }
}
