package com.dcy.common.model;

/**
 * @Author：dcy
 * @Description: http状态码封装
 * @Date: 2020-02-28 08:34
 */
public enum ResponseCode {
    SUCCESS(200, "请求成功"),
    ERROR(500, "请求失败");

    private final int code;
    private final String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
