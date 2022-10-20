package com.miaowu.common.core.exception.user;

/**
 * 用户密码不正确或不符合规范异常类
 * @author Jack
 * @date 2022年10月19日
 */
public class UserPasswordNotMatchException extends UserException{

    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException(String code, Object[] args) {
        super(code, args);
    }
}
