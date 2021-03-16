package com.yonghui.it.service.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SDKProperty {
    String value() default ""; //字段说明
    boolean required() default false;
    boolean hidden() default false;
    String example() default "";
    boolean optional() default false;//可选
}