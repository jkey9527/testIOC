package com.java.entity;

import java.io.Serializable;

public class Teacher implements Serializable {

    private Integer id;

    private String sex;

    private String name;

    public Teacher() {
    }

    public Teacher(Integer id, String sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
