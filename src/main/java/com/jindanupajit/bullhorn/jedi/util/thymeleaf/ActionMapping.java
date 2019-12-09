package com.jindanupajit.bullhorn.jedi.util.thymeleaf;

import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ActionMappings.class)
public @interface ActionMapping {
    Class entity();
    ActionType[] action();
    String url() default "#";
    RequestMethod method() default RequestMethod.GET;
    String label() default "Submit";
}
