package com.jimking.test2.annotation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@RequestMapping(method = RequestMethod.GET)
public @interface EnableSwitch {

    @AliasFor("msg")
    String value() default "";

    @AliasFor("value")
    String msg() default "";

    /**
     * 调用平台名称
     * @return
     */
    String platformName() default "";
}
