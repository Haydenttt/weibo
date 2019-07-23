package com.unicom.exception;

import com.unicom.http.ApiResult;
import com.unicom.util.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.file.AccessDeniedException;

/**
 * 统一异常处理
 *
 * @Author: XuJianHua
 * @Date: 2019/1/4 14:53
 */
@ControllerAdvice
public class UnicomWeiboExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(UnicomWeiboExceptionHandler.class);

    /**
     * 统一异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler({Exception.class, RuntimeException.class})
    @ResponseBody
    public ApiResult exception(Exception e) {
        ApiResult result = new ApiResult();
        //特意抛出的异常，不需要打印错误日志,直接返回
        if (e instanceof UnicomWeiboException) {
            UnicomWeiboException upe = (UnicomWeiboException) e;
            result.setStatus(upe.getStatus());
            result.setMessage(upe.getEmsg());
            return result;
        //spring security抛出的异常
        } else if(e instanceof WeiboException){
            WeiboException weiboException = (WeiboException)e;
            result.setMessage(weiboException.getErrMsg());
            result.setStatus(weiboException.getErrCode());
        }else if (e instanceof AuthenticationException) {
            result.setMessage(e.getMessage());
            result.setStatus(198);
        //不检查的异常
        } else if (e instanceof RuntimeException) {
            result.setMessage("Network error,Please try again later!");
            result.setStatus(199);
        //服务器异常
        } else if (e instanceof Exception) {
            result.setMessage(ExceptionUtil.getMessage(e));
            result.setStatus(299);
        }
        logger.error("############# Unicom unified exception handling ##############", e);
        return result;
    }

    /**
     * 权限控制-异常处理
     */
    @ExceptionHandler({AccessDeniedException.class})
    @ResponseBody
    public ApiResult AccessDeniedException(AccessDeniedException e) {
        ApiResult result = new ApiResult();
        result.setMessage(ExceptionUtil.getMessage(e));
        result.setStatus(403);
        logger.error("############# Unicom permission exception handling ##############", e);
        return result;
    }
}
