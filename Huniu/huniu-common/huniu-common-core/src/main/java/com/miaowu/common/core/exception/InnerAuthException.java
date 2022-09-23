package com.miaowu.common.core.exception;

/**
 * 内部认证异常
 * @author Jack
 * @date 2022年09月23日
 */
public class InnerAuthException extends RuntimeException{
    private static final long serialVersionUID = -5560659597795125520L;

    public InnerAuthException(String message)
    {
        super(message);
    }
}
