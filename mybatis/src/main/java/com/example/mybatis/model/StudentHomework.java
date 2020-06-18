package com.example.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class StudentHomework implements Serializable {
    private Long id;

    private Long student_id;

    private Long homework_id;

    private String homework_title;

    private String homework_content;

    private Date create_time;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public Long getHomework_id() {
        return homework_id;
    }

    public void setHomework_id(Long homework_id) {
        this.homework_id = homework_id;
    }

    public String getHomework_title() {
        return homework_title;
    }

    public void setHomework_title(String homework_title) {
        this.homework_title = homework_title;
    }

    public String getHomework_content() {
        return homework_content;
    }

    public void setHomework_content(String homework_content) {
        this.homework_content = homework_content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "StudentHomework{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", homework_id=" + homework_id +
                ", homework_title='" + homework_title + '\'' +
                ", homework_content='" + homework_content + '\'' +
                ", create_time=" + create_time +
                '}';
    }
}
