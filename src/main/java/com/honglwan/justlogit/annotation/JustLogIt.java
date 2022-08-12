package com.honglwan.justlogit.annotation;

import com.honglwan.justlogit.model.LogType;

import java.lang.annotation.*;

/**
 * @author honglwan
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JustLogIt {

    String value() default "";

    LogType type() default LogType.ALL;
}
