package com.dcy.feign.interceptor;

import cn.hutool.core.util.StrUtil;
import com.dcy.common.constant.CommonConstant;
import org.slf4j.MDC;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author：dcy
 * @Description:
 * @Date: 2019/9/19 9:55
 */
public class TraceInterceptor implements HandlerInterceptor{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String traceId = request.getHeader(CommonConstant.TRACE_ID_HEADER);
        if (StrUtil.isNotEmpty(traceId)) {
            MDC.put(CommonConstant.LOG_TRACE_ID, traceId);
        }
        return true;
    }
}
