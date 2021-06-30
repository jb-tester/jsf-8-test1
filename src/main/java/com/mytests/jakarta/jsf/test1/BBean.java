package com.mytests.jakarta.jsf.test1;

import javax.enterprise.inject.New;
import javax.inject.Inject;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
@MyScope
public class BBean {
    
    @Inject @MyQualifier1 CBean cb1;
    @Inject @MyQualifier2 CBean cb2;
    
    String p1 ="bbean";

    public String getP1() {
        return p1+"_"+cb1.getId()+"_"+cb2.getId();
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }
}
