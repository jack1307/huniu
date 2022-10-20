package com.miaowu.common.security.annotation;

import java.lang.annotation.*;

/**
 * 内部认证注解
 * @author Jack
 * @date 2022年10月20日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InnerAuth {

    boolean isUser() default false;
}
