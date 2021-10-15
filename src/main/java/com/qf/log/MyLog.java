package com.qf.log;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//指定到方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
    String value() default "用户操作";
}
