package com.miaowu.common.core.exception.user;

import com.miaowu.common.core.exception.base.BaseException;

/**
 * @author Jack
 * @date 2022年09月23日
 */
public class UserException extends BaseException {

    private static final long serialVersionUID = 357590053111454377L;

    public UserException(String code, Object[] args)
    {
        super("user", code, args, null);
    }
}
