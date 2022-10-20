package com.miaowu.common.core.exception.user;

/**
 * 验证码失效异常类
 * @author Jack
 * @date 2022年10月19日
 */
public class CaptchaExpireException extends UserException{

    private static final long serialVersionUID = 1L;

    public CaptchaExpireException(String code, Object[] args) {
        super(code, args);
    }
}
