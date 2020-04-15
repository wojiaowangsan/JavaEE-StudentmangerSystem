package org.springmvc.class04.model;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class student {
    private Long studentId;
    private String studentName;
    public Long getStudentId() {
        return studentId;
    }
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
    public String getStudentName(){return studentName;}
    public void setStudentName(String studentName){this.studentName=studentName;}

}
