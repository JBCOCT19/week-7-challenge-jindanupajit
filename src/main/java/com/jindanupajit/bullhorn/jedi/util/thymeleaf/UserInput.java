package com.jindanupajit.bullhorn.jedi.util.thymeleaf;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface UserInput {
    int ordinal() default Integer.MAX_VALUE;
    String label();
    String placeHolder() default "";
    boolean secret() default false;
    boolean ignored() default false;

}
