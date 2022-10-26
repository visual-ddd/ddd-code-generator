package com.wd.paas.generator.web.start.config;

import com.wakedata.common.core.dto.ResultDTO;
import com.wakedata.common.core.exception.BizException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 业务异常处理器
 *
 * @author ZhuXueLiang
 * @date 2022/10/22 11:19
 * @version 1.0
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @Value("${return.exception.message:false}")
    private boolean returnExceptionMessage;

    @ExceptionHandler(RuntimeException.class)
    public ResultDTO<Object> runtimeExceptionHandler(final RuntimeException ex, HttpServletRequest request) {
        log.error("Unexpected runtimeException thrown, path={}", getRequestPath(request), ex);
        if(returnExceptionMessage){
            return ResultDTO.fail(ex.getMessage());
        }
        return ResultDTO.fail("系统繁忙，请稍后重试！");
    }

    @ExceptionHandler(BizException.class)
    public ResultDTO<Object> BizExceptionHandler(final BizException e) {
        log.error("BizException error", e);
        return ResultDTO.fail(e.getCode(), e.getMessage());
    }


    private String getRequestPath(HttpServletRequest request) {
        StringBuffer path = request.getRequestURL();
        if (request.getQueryString() != null) {
            path.append("?").append(request.getQueryString());
        }
        return path.toString();
    }
}
