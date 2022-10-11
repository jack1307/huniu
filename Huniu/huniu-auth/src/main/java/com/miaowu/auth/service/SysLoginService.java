package com.miaowu.auth.service;

import com.miaowu.common.core.constant.Constants;
import com.miaowu.common.core.exception.ServiceException;
import com.miaowu.common.core.utils.StringUtils;
import com.miaowu.system.api.RemoteUserService;
import com.miaowu.system.api.model.LoginUser;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jack
 * @date 2022年09月26日
 */
@Component
public class SysLoginService {

    @Resource
    private SysRecordLogService recordLogService;
    @Resource
    private SysPasswordService passwordService;
    @Resource
    private RemoteUserService remoteUserService;

    public LoginUser login(String userName, String password){
        if (StringUtils.isAnyBlank(userName, password)) {
            recordLogService.recordLogininfor(userName, Constants.LOGIN_FAIL, "用户/密码必须填写");
            throw new ServiceException("用户/密码必须填写");
        }

        return null;
    }



}
