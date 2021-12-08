package com.java.entity;

public class School {
    private Integer id;
    private Teacher teacher;
    private Student student;

    public School() {
    }

    public School(Integer id, Teacher teacher, Student student) {
        this.id = id;
        this.teacher = teacher;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
