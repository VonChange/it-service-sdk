package com.yonghui.it.service.sign.sdk.exception;

import com.yonghui.it.service.common.exception.ItServiceException;

/**
 * 封装运行异常为SignException
 *
 * @author vonchange
 */
public class SignException extends ItServiceException {

    public SignException(String msg) {
        super(msg);
    }
    public SignException(String code, String msg) {
        super(code, msg);
    }
}
