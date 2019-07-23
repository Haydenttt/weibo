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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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
        } catch (Exception e){
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("HTTP GET请求获取元数据失败！"));
        }
        return result;
    }

    /**
     * 发送HttpPost请求，参数为json字符串
     *
     * @param url     请求地址
     * @param jsonStr json字符串
     * @return
     */
    public static String sendPost(String url, String jsonStr) {
//        String result;
//
//        // 设置entity
//        StringEntity stringEntity = new StringEntity(jsonStr, Consts.UTF_8);
//        stringEntity.setContentType("application/json");
//
//        HttpPost httpPost = new HttpPost(url);
//        httpPost.setEntity(stringEntity);
//
//        try (CloseableHttpClient httpclient = getBuilder().build();
//             CloseableHttpResponse httpResponse = httpclient.execute(httpPost)) {
//            HttpEntity httpEntity = httpResponse.getEntity();
//            result = EntityUtils.toString(httpEntity);
//        }
//        return result;
        String result="";

        try {
            URL strUrl = new URL(url);
            //通过调用url.openConnection()来获得一个新的URLConnection对象，并且将其结果强制转换为HttpURLConnection.
            HttpURLConnection urlConnection = (HttpURLConnection) strUrl.openConnection();
            urlConnection.setRequestMethod("POST");
            //设置连接的超时值为30000毫秒，超时将抛出SocketTimeoutException异常
            urlConnection.setConnectTimeout(30000);
            //设置读取的超时值为30000毫秒，超时将抛出SocketTimeoutException异常
            urlConnection.setReadTimeout(30000);
            //将url连接用于输出，这样才能使用getOutputStream()。getOutputStream()返回的输出流用于传输数据
            urlConnection.setDoOutput(true);
            //设置通用请求属性为默认浏览器编码类型
            urlConnection.setRequestProperty("content-type", "application/x-www-form-urlencoded");
            //getOutputStream()返回的输出流，用于写入参数数据。
            OutputStream outputStream = urlConnection.getOutputStream();
            outputStream.write(jsonStr.getBytes());
            outputStream.flush();
            outputStream.close();
            //此时将调用接口方法。getInputStream()返回的输入流可以读取返回的数据。
            InputStream inputStream = urlConnection.getInputStream();
            byte[] data = new byte[1024];
            StringBuilder sb = new StringBuilder();
            //inputStream每次就会将读取1024个byte到data中，当inputSteam中没有数据时，inputStream.read(data)值为-1
            while (inputStream.read(data) != -1) {
                String s = new String(data, Charset.forName("utf-8"));
                sb.append(s);
            }
            result = sb.toString();
            inputStream.close();
        } catch (Exception e){
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("HTTP POST x-www-form-urlencoded请求获取元数据失败！"));
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
        }catch (Exception e){
            throw new WeiboException(EmWeiboError.UNKNOW_ERROR.setErrMsg("HTTP POST MultipartFile请求获取元数据失败！"));
        }
        return result;
    }

//    // MultipartFile里面的name就是表单的name，文件名是originalFilename
//    private static MultipartFile fileToMultipartFile(File file, String name) throws IOException {
//        log.info("File转MultipartFile：文件路径：{}", file.getAbsolutePath());
//        FileInputStream inputStream = new FileInputStream(file);
//        Path path = Paths.get(file.getAbsolutePath());
//        String contentType = Files.probeContentType(path);
//        if (StringUtils.isEmpty(contentType)) {
//            contentType = "application/octet-stream";
//        }
//        MultipartFile multipartFile = new MockMultipartFile(
//                name,
//                file.getName(),
//                contentType,
//                inputStream);
//        log.info("File转MultipartFile：转换后的文件信息：[name:{}, originalFilename:{} ,contentType:{}]",
//                multipartFile.getName(),
//                multipartFile.getOriginalFilename(),
//                multipartFile.getContentType());
//        return multipartFile;
//    }

//    public static void main(String[] args) throws IOException {
//    System.out.println(sendGet("http://ef.zhiweidata.com/index/indexUp.do"));
//    System.out.println(sendPost("http://ef.zhiweidata.com/index/oneEvent.do","eventId=d6e62d4dbc728a7e10015705"));
//    }
}
