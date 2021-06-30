package com.mytests.jakarta.jsf.test1;

import javax.enterprise.inject.Produces;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
public class MyFactory {
    @Produces
    public DBean createDBean() {
        return new DBean("dbean");
    }
    @Produces @MyQualifier3 String q3(){
        return "q3";
    };
}
