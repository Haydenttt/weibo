package com.unicom.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;

/**
 * json工具类
 *
 * @author
 */
public class JsonUtil {

    private ObjectMapper mapper;

    {
        mapper = new ObjectMapper();
        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    /**
     * 默认:包含空字符串和null
     */
    public static final JsonUtil DEFAULT = new JsonUtil();

    /**
     * 排除null但是包含空字符串
     */
    public static final JsonUtil EXCLUDE_NULL = new JsonUtil(JsonInclude.Include.NON_NULL);

    /**
     * 排除空字符串和null
     */
    public static final JsonUtil EXCLUDE_EMPTY = new JsonUtil(JsonInclude.Include.NON_EMPTY);

    private JsonUtil() {
    }

    private JsonUtil(JsonInclude.Include include) {
        mapper.setSerializationInclusion(include);
    }

    /**
     * object序列化为json字符串
     *
     * @param target object对象
     * @return json格式的string
     * @throws Exception
     */
    public String toJson(Object target) {
        try {
            return mapper.writeValueAsString(target);
        } catch (Exception e) {
            System.err.println("#################JsonUtil toJson###############:" + e);
        }
        return "";
    }

    /**
     * 反序列号json字符串为对象
     *
     * @param json   json格式的字符串
     * @param target 目标对象
     * @param <T>    泛型
     * @return 对象
     * @throws Exception
     */
    public <T> T fromJson(String json, Class<T> target) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
            return mapper.readValue(json, target);
        } catch (Exception e) {
            System.err.println("#################JsonUtil fromJson###############:" + e);
        }
        return null;
    }

    /**
     * 反序列号json字符串为对象
     *
     * @param <T>      泛型
     * @param json     字符串
     * @param javaType 类型
     * @return javaType类型的对象
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public <T> T fromJson(String json, JavaType javaType) {
        if (StringUtils.isEmpty(json)) {
            return null;
        }
        try {
            return (T) mapper.readValue(json, javaType);
        } catch (Exception e) {
            System.err.println("#################JsonUtil fromJson###############:" + e);
        }
        return null;
    }

    /**
     * 将一个Object转换为另一种类型Object
     *
     * @param object
     * @param javaType
     * @param <T>
     * @return
     */
    public <T> T toObject(Object object, JavaType javaType) {
        String json = toJson(object);
        return fromJson(json, javaType);
    }

    /**
     * 将一个Object转换为另一种类型Object
     *
     * @param object
     * @param target
     * @param <T>
     * @return
     */
    public <T> T toObject(Object object, Class<T> target) {
        String json = toJson(object);
        return fromJson(json, target);
    }
}
