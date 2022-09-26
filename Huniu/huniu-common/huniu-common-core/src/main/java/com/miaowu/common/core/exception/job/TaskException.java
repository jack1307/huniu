package com.miaowu.common.core.exception.job;

/**
 * @author Jack
 * @date 2022年09月26日
 */
public class TaskException extends Exception{
    private static final long serialVersionUID = 6854407408451374573L;

    private Code code;

    public TaskException(String msg, Code code)
    {
        this(msg, code, null);
    }

    public TaskException(String msg, Code code, Exception nestedEx)
    {
        super(msg, nestedEx);
        this.code = code;
    }

    public Code getCode()
    {
        return code;
    }

    public enum Code
    {
        TASK_EXISTS, NO_TASK_EXISTS, TASK_ALREADY_STARTED, UNKNOWN, CONFIG_ERROR, TASK_NODE_NOT_AVAILABLE
    }
}
