package com.miaowu.system.api.factory;

import com.miaowu.common.core.domain.ResultResponse;
import com.miaowu.system.api.RemoteLogService;
import com.miaowu.system.api.domain.SysLogininfor;
import com.miaowu.system.api.domain.SysOperLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @author Jack
 * @date 2022年09月09日
 */
@Slf4j
public class RemoteLogFallbackFactory implements FallbackFactory<RemoteLogService> {


    @Override
    public RemoteLogService create(Throwable throwable) {
        log.error("日志服务调用失败:{}", throwable.getMessage());
        return new RemoteLogService()
        {
            @Override
            public ResultResponse<Boolean> saveLog(SysOperLog sysOperLog, String source)
            {
                return null;
            }

            @Override
            public ResultResponse<Boolean> saveLoginInfo(SysLogininfor sysLogininfor, String source)
            {
                return null;
            }
        };
    }
}
