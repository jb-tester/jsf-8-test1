package com.mytests.jakarta.jsf.test1;

/**
 * *******************************
 * <p>Created by irina on 23.06.2020.</p>
 * <p>Project: foo</p>
 * *******************************
 */
public class DBean {
    public String getId() {
        return id;
    }

    private final String id;

    public DBean(String db) {
        this.id = db;
    }
}
