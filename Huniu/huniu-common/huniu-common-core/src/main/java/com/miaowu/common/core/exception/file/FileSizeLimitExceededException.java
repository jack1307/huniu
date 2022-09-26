package com.miaowu.common.core.exception.file;

/**
 * @author Jack
 * @date 2022年09月26日
 */
public class FileSizeLimitExceededException extends FileException {

    private static final long serialVersionUID = -8130568888221449180L;

    public FileSizeLimitExceededException(long defaultMaxSize)
    {
        super("upload.exceed.maxSize", new Object[] { defaultMaxSize });
    }
}
