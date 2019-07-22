package com.unicom.util;

import com.unicom.exception.BusinessException;
import com.unicom.exception.EmBusinessError;

import java.util.Map;

/**
 * 参数校验工具类
 *
 * @Author: xujianhua
 */
public class CheckUtil {

    /***
     * 批量验证字符串参数是否为空
     *
     * @param params
     * @return
     */
    public static boolean checkParams(String[] params) {
        for (String param : params) {
            if (param == null || "".equals(param) || param.isEmpty()) {
                return false;
            }
        }
        return true;
    }

//    验证正确收到分页信息
    public static void checkPageInfo(Map map) throws BusinessException {
        try {
            Integer.parseInt(map.get("currentPage").toString());
            Integer.parseInt(map.get("pageSize").toString());
        } catch (Exception e) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "传入了非法分页信息");
        }
    }
}
