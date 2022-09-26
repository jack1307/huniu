package com.miaowu.common.core.exception.file;

import com.miaowu.common.core.exception.base.BaseException;

/**
 * 文件信息异常类
 * @author Jack
 * @date 2022年09月26日
 */
public class FileException extends BaseException {

    private static final long serialVersionUID = -5876604051536388018L;

    public FileException(String code, Object[] args)
    {
        super("file", code, args, null);
    }
}
