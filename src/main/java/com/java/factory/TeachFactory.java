package com.java.factory;

import com.java.entity.Teacher;

public class TeachFactory {
    public Teacher creatTeacher(){
        return new Teacher();
    }
}
