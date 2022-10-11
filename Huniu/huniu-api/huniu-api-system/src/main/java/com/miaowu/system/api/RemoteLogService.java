package com.miaowu.system.api;

import com.miaowu.common.core.constant.SecurityConstants;
import com.miaowu.common.core.domain.ResultResponse;
import com.miaowu.system.api.domain.SysLogininfor;
import com.miaowu.system.api.domain.SysOperLog;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * @author Jack
 * @date 2022年09月09日
 */
public interface RemoteLogService {

    @PostMapping("/operlog")
    ResultResponse<Boolean> saveLog(@RequestBody SysOperLog sysOperLog, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

    /**
     * 保存访问记录
     *
     * @param logininfor 访问实体
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/logininfor")
    ResultResponse<Boolean> saveLoginInfo(@RequestBody SysLogininfor logininfor, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
