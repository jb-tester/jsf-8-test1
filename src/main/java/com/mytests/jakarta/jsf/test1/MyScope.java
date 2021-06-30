package com.mytests.jakarta.jsf.test1;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
@Stereotype
@Target({ TYPE, METHOD, FIELD })
@Retention(RUNTIME)
@Named
@ApplicationScoped
public @interface MyScope {
    
}
