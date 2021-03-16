package com.yonghui.it.service.common.exception;

/**
 * 封装运行异常为SignException
 *
 * @author vonchange
 */
public class ItServiceException extends Exception {
    private static final long serialVersionUID = 1L;
    private String msg;
    private String code = "500000";

    public ItServiceException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ItServiceException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public ItServiceException(String code, String msg) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public ItServiceException(String code, String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
