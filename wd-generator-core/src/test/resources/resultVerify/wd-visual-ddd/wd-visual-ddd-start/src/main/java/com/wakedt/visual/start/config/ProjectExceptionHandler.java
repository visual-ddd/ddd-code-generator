package com.wakedt.visual.start.config;

import com.wakedata.common.spring.exception.GlobalExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 项目全局异常处理器
 *
 * @author visual-ddd
 * @since 1.0
 */
@Slf4j
@RestControllerAdvice
public class ProjectExceptionHandler extends GlobalExceptionHandler {

}