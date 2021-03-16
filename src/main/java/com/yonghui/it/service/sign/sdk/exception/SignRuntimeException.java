package com.yonghui.it.service.sign.sdk.exception;

import com.yonghui.it.service.common.exception.ItServiceRuntimeException;

/**
 * 封装运行异常为SignException
 *
 * @author vonchange
 */
public class SignRuntimeException extends ItServiceRuntimeException {

    public SignRuntimeException(String code, String msg) {
        super(code, msg);
    }
    public SignRuntimeException(String code, String msg, Throwable cause) {
        super(code, msg,cause);
    }
    public SignRuntimeException(String msg) {
        super(msg);
    }
    public SignRuntimeException(String msg, Throwable cause) {
        super(msg,cause);
    }


}
