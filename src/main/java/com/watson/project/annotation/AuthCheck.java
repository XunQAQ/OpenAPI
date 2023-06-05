package com.watson.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验
 *
 * @author watson
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * any role
     *
     * @return
     */
    String[] anyRole() default "";

    /**
     * one rule
     *
     * @return
     */
    String mustRole() default "";

}

