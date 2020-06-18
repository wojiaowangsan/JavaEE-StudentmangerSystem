package com.example.mybatis.model;

import java.io.Serializable;

public class homework implements Serializable {
    private Long homework_Id;
    private String homework_Title;
    private String homework_Content;

    public Long getHomework_Id() {
        return homework_Id;
    }

    public void setHomework_Id(Long homework_Id) {
        this.homework_Id = homework_Id;
    }

    public String getHomework_Title() {
        return homework_Title;
    }

    public void setHomework_Title(String homework_Title) {
        this.homework_Title = homework_Title;
    }

    public String getHomework_Content() {
        return homework_Content;
    }

    public void setHomework_Content(String homework_Content) {
        this.homework_Content = homework_Content;
    }

    @Override
    public String toString() {
        return "homework{" +
                "homework_Id=" + homework_Id +
                ", homework_Title='" + homework_Title + '\'' +
                ", homework_Content='" + homework_Content + '\'' +
                '}';
    }
}
