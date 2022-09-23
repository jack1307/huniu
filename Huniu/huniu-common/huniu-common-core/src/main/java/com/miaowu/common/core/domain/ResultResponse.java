package com.miaowu.common.core.domain;

import com.miaowu.common.core.constant.Constants;

import java.io.Serializable;

/**
 * @author Jack
 * @date 2022年09月23日
 */
public class ResultResponse<T> implements Serializable {
    private static final long serialVersionUID = -3444905603557017123L;


    /** 成功 */
    public static final int SUCCESS = Constants.SUCCESS;

    /** 失败 */
    public static final int FAIL = Constants.FAIL;

    private int code;

    private String msg;

    private T data;

    public static <T> ResultResponse<T> ok()
    {
        return restResult(null, SUCCESS, null);
    }

    public static <T> ResultResponse<T> ok(T data)
    {
        return restResult(data, SUCCESS, null);
    }

    public static <T> ResultResponse<T> ok(T data, String msg)
    {
        return restResult(data, SUCCESS, msg);
    }

    public static <T> ResultResponse<T> fail()
    {
        return restResult(null, FAIL, null);
    }

    public static <T> ResultResponse<T> fail(String msg)
    {
        return restResult(null, FAIL, msg);
    }

    public static <T> ResultResponse<T> fail(T data)
    {
        return restResult(data, FAIL, null);
    }

    public static <T> ResultResponse<T> fail(T data, String msg)
    {
        return restResult(data, FAIL, msg);
    }

    public static <T> ResultResponse<T> fail(int code, String msg)
    {
        return restResult(null, code, msg);
    }

    private static <T> ResultResponse<T> restResult(T data, int code, String msg)
    {
        ResultResponse<T> apiResult = new ResultResponse<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
