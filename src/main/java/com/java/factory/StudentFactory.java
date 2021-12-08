package com.java.factory;

import com.java.entity.Student;

public class StudentFactory {

    public static Student createStudent(){
        return new Student();
    }
}
