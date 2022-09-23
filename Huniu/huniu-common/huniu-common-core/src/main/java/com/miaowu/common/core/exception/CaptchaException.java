package com.miaowu.common.core.exception;

/**
 * @author Jack
 * @date 2022年09月23日
 */
public class CaptchaException extends RuntimeException {
    private static final long serialVersionUID = -881086696260908445L;

    public CaptchaException(String msg)
    {
        super(msg);
    }
}
