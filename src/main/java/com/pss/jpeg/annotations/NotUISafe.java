package com.pss.jpeg.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.SOURCE;

@Target({LOCAL_VARIABLE, FIELD, PARAMETER, METHOD })
@Retention(SOURCE)
public @interface NotUISafe {
}
