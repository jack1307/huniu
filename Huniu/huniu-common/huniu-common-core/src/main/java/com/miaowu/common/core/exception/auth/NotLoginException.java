package com.miaowu.common.core.exception.auth;

/**
 * 未能通过的登录认证异常
 * @author Jack
 * @date 2022年09月26日
 */
public class NotLoginException extends RuntimeException{

    private static final long serialVersionUID = -8680288982426857507L;

    public NotLoginException(String message)
    {
        super(message);
    }
}
