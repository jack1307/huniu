package com.miaowu.system.api.factory;

import com.miaowu.common.core.domain.ResultResponse;
import com.miaowu.system.api.RemoteUserService;
import com.miaowu.system.api.domain.SysUser;
import com.miaowu.system.api.model.LoginUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;

/**
 * @author Jack
 * @date 2022年09月09日
 */
@Slf4j
public class RemoteUserFallbackFactory implements FallbackFactory<RemoteUserService> {


    @Override
    public RemoteUserService create(Throwable throwable) {
        log.error("用户服务调用失败:{}", throwable.getMessage());
        return new RemoteUserService()
        {
            @Override
            public ResultResponse<LoginUser> getUserInfo(String username, String source)
            {
                return ResultResponse.fail("获取用户失败:" + throwable.getMessage());
            }

            @Override
            public ResultResponse<Boolean> registerUserInfo(SysUser sysUser, String source)
            {
                return ResultResponse.fail("注册用户失败:" + throwable.getMessage());
            }
        };
    }
}
