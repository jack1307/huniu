package com.miaowu.common.core.exception.auth;

import org.apache.commons.lang3.StringUtils;

/**
 * 未能通过的权限认证异常
 * @author Jack
 * @date 2022年09月26日
 */
public class NotPermissionException extends RuntimeException{
    private static final long serialVersionUID = 4189858332503280274L;

    public NotPermissionException(String permission)
    {
        super(permission);
    }

    public NotPermissionException(String[] permissions)
    {
        super(StringUtils.join(permissions, ","));
    }
}
