package com.miaowu.gateway.service;

import com.miaowu.common.core.exception.CaptchaException;
import com.miaowu.common.core.web.domain.AjaxResult;

import java.io.IOException;

/**
 * 验证码处理
 * @author Jack
 * @date 2022年10月27日
 */
public interface ValidateCodeService {
    /**
     * 生成验证码
     */
    AjaxResult createCaptcha() throws IOException, CaptchaException;

    /**
     * 校验验证码
     */
    void checkCaptcha(String key, String value) throws CaptchaException;
}
