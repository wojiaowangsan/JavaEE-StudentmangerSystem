package com.example.mybatis.model;

import java.io.Serializable;

public class student implements Serializable {

    private Long student_id;
    private String student_name;
    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                '}';
    }
}
