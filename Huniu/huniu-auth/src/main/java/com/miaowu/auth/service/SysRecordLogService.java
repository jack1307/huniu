package com.miaowu.auth.service;

import com.miaowu.common.core.constant.Constants;
import com.miaowu.common.core.constant.SecurityConstants;
import com.miaowu.common.core.utils.ServletUtils;
import com.miaowu.common.core.utils.StringUtils;
import com.miaowu.common.core.utils.ip.IpUtils;
import com.miaowu.system.api.RemoteLogService;
import com.miaowu.system.api.domain.SysLogininfor;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Jack
 * @date 2022年09月26日
 */
@Component
public class SysRecordLogService {
    
    @Resource
    private RemoteLogService remoteLogService;
    
    /**
     * 记录登录信息
     *
     * @param userName 用户名
     * @param status 状态
     * @param message 消息内容
     * @return
     */
    public void recordLogininfor(String userName, String status, String message) {

        SysLogininfor logininfor = new SysLogininfor();
        logininfor.setUserName(userName);
        logininfor.setIpaddr(IpUtils.getIpAddr(ServletUtils.getRequest()));
        logininfor.setMsg(message);
        // 日志状态
        if (StringUtils.equalsAny(status, Constants.LOGIN_SUCCESS, Constants.LOGOUT, Constants.REGISTER))
        {
            logininfor.setStatus(Constants.LOGIN_SUCCESS_STATUS);
        }
        else if (Constants.LOGIN_FAIL.equals(status))
        {
            logininfor.setStatus(Constants.LOGIN_FAIL_STATUS);
        }
        remoteLogService.saveLoginInfo(logininfor, SecurityConstants.INNER);
    }
}
