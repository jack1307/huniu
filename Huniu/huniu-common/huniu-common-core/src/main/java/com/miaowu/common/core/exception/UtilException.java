package com.miaowu.common.core.exception;

/**
 * 工具类异常
 * @author Jack
 * @date 2022年09月23日
 */
public class UtilException extends RuntimeException{
    private static final long serialVersionUID = 1633889415240984708L;

    public UtilException(Throwable e)
    {
        super(e.getMessage(), e);
    }

    public UtilException(String message)
    {
        super(message);
    }

    public UtilException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
}
