package com.dcy.common.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author：dcy
 * @Description: 返回给前台的通用包装
 * @Date: 2019/8/9 11:40
 */
@Getter
@Setter
public class ResponseData<T> {
    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String msg;

    /**
     * 响应对象
     */
    private T data;

    public ResponseData() {

    }

    public ResponseData(Boolean success, Integer code, String msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    //=================================成功返回==================================

    public static <T> ResponseData<T> success() {
        return new ResponseData<T>(true, ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), null);
    }

    public static <T> ResponseData<T> success(T object) {
        return new ResponseData<T>(true, ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getMsg(), object);
    }

    public static <T> ResponseData<T> success(ResponseCode responseCode) {
        return new ResponseData<T>(true, responseCode.getCode(), responseCode.getMsg(), null);
    }

    public static <T> ResponseData<T> success(ResponseCode responseCode, T object) {
        return new ResponseData<T>(true, responseCode.getCode(), responseCode.getMsg(), object);
    }

    public static <T> ResponseData<T> success(String msg, T object) {
        return new ResponseData<T>(true, ResponseCode.SUCCESS.getCode(), msg, object);
    }

    //=================================失败返回==================================

    public static <T> ResponseData<T> error(String msg) {
        return new ResponseData<T>(false, ResponseCode.ERROR.getCode(), msg, null);
    }

    public static <T> ResponseData<T> error(Integer code, String msg) {
        return new ResponseData<T>(false, code, msg, null);
    }

    public static <T> ResponseData<T> error(ResponseCode responseCode) {
        return new ResponseData<T>(false, responseCode.getCode(), responseCode.getMsg(), null);
    }
}
