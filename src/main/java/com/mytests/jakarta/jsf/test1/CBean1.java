package com.mytests.jakarta.jsf.test1;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
@MyQualifier1
public class CBean1 extends CBean{
   
    String id = "cb1";

    public String getId() {
        return id;
    }
}
