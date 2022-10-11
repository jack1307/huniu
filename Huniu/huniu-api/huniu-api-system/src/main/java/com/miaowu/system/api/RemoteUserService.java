package com.miaowu.system.api;

import com.miaowu.common.core.constant.SecurityConstants;
import com.miaowu.common.core.domain.ResultResponse;
import com.miaowu.system.api.domain.SysUser;
import com.miaowu.system.api.model.LoginUser;
import org.springframework.web.bind.annotation.*;

/**
 * @author Jack
 * @date 2022年09月09日
 */
public interface RemoteUserService {

    /**
     * 通过用户名查询用户信息
     *
     * @param username 用户名
     * @param source 请求来源
     * @return 结果
     */
    @GetMapping("/user/info/{username}")
    ResultResponse<LoginUser> getUserInfo(@PathVariable("username") String username, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);

    /**
     * 注册用户信息
     *
     * @param sysUser 用户信息
     * @param source 请求来源
     * @return 结果
     */
    @PostMapping("/user/register")
    ResultResponse<Boolean> registerUserInfo(@RequestBody SysUser sysUser, @RequestHeader(SecurityConstants.FROM_SOURCE) String source);
}
