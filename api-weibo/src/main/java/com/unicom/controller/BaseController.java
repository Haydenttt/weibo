package com.unicom.controller;

import com.unicom.exception.EmWeiboError;
import com.unicom.exception.WeiboException;
import com.unicom.util.CommonUtil;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

/**
 * 基础控制器
 */
@RestController
public class BaseController {

    /**
     * 重要参数获取
     *
     * @return
     */
    protected String getParameterFromMap(Map map, String parameterName)  {
        String parameterValue;
        try {
            parameterValue = (String) map.get(parameterName);
            if (CommonUtil.isStringEmpty(parameterValue)) {
                throw new WeiboException(EmWeiboError.PARAMETER_VALIDATION_ERROR.setErrMsg("参数 " + parameterName + " 未空"));
            }
        } catch (Exception e) {
            throw new WeiboException(EmWeiboError.PARAMETER_VALIDATION_ERROR.setErrMsg("参数 " + parameterName + " 非法"));
        }
        return parameterValue;
    }


    /**
     * 重要参数获取
     *
     * @return
     */
    protected Byte getByteParameterFromMap(Map map, String parameterName)  {
        Byte parameterValue;
        try {
            parameterValue = Byte.valueOf((String) map.get(parameterName));
        } catch (Exception e) {
            throw new WeiboException(EmWeiboError.PARAMETER_VALIDATION_ERROR.setErrMsg("参数 " + parameterName + " 非法"));
        }
        return parameterValue;
    }

}
