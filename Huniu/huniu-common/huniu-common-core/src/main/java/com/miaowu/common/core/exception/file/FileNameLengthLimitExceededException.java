package com.miaowu.common.core.exception.file;

/**
 * 文件名称超长限制异常类
 * @author Jack
 * @date 2022年09月26日
 */
public class FileNameLengthLimitExceededException extends FileException {

    private static final long serialVersionUID = 9043203664132376612L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength)
    {
        super("upload.filename.exceed.length", new Object[] { defaultFileNameLength });
    }
}
