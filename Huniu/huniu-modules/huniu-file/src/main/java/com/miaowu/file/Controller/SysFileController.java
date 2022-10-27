package com.miaowu.file.Controller;

import com.miaowu.common.core.domain.ResultResponse;
import com.miaowu.common.core.utils.file.FileUtils;
import com.miaowu.file.service.ISysFileService;
import com.miaowu.system.api.domain.SysFile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件请求处理
 * @author Jack
 * @date 2022年10月27日
 */
@RestController
@Slf4j
public class SysFileController {

    @Autowired
    private ISysFileService sysFileService;

    /**
     * 文件上传请求
     */
    @PostMapping("upload")
    public ResultResponse<SysFile> upload(MultipartFile file)
    {
        try
        {
            // 上传并返回访问地址
            String url = sysFileService.uploadFile(file);
            SysFile sysFile = new SysFile();
            sysFile.setName(FileUtils.getName(url));
            sysFile.setUrl(url);
            return ResultResponse.ok(sysFile);
        }
        catch (Exception e)
        {
            log.error("上传文件失败", e);
            return ResultResponse.fail(e.getMessage());
        }
    }


}
