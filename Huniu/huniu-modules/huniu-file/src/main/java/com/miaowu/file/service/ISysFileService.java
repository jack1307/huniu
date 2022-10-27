package com.miaowu.file.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Jack
 * @date 2022年10月27日
 */
public interface ISysFileService {

    /**
     * 文件上传接口
     *
     * @param file 上传的文件
     * @return 访问地址
     * @throws Exception
     */
    String uploadFile(MultipartFile file) throws Exception;
}
