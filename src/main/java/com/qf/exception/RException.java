package com.qf.exception;

/**
 * Dis:统一异常接口实体类
 */
public class RException extends RuntimeException{
    private int code;
    private String msg;

    public RException() {
    }

    public RException(String msg) {
        this.msg = msg;
    }

    public RException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
