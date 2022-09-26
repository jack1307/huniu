package com.miaowu.common.core.exception.auth;

import org.apache.commons.lang3.StringUtils;

/**
 * 未能通过的角色认证异常
 * @author Jack
 * @date 2022年09月26日
 */
public class NotRoleException extends RuntimeException{
    private static final long serialVersionUID = 128153868505623299L;
    public NotRoleException(String role)
    {
        super(role);
    }

    public NotRoleException(String[] roles)
    {
        super(StringUtils.join(roles, ","));
    }

}
