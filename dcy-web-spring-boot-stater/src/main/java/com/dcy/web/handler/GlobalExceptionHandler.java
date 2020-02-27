package com.dcy.web.handler;

import com.dcy.common.exception.ValidException;
import com.dcy.common.model.ResponseData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author：dcy
 * @Description: 全局的的异常拦截器（拦截所有的控制器）
 * @Date: 2019/9/6 13:25
 */
@RestControllerAdvice
@Order(-1)
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 拦截未知的运行时异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ResponseData<String> ex(Exception e) {
        return ResponseData.error(e.getMessage());
    }

    /**
     * 校验异常
     *
     * @param validException
     * @return
     */
    @ExceptionHandler(ValidException.class)
    @ResponseBody
    public ResponseData<String> valid(ValidException validException) {
        return ResponseData.error(validException.getMessage());
    }
}
