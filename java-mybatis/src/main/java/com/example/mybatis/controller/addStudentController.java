package com.example.mybatis.controller;

import com.example.mybatis.dao.studentMapper;
import com.example.mybatis.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class addStudentController {
    @Autowired
    private com.example.mybatis.dao.studentMapper studentMapper;
    @RequestMapping(path = "addStudent",method = RequestMethod.POST)
private String addStudent(@RequestParam(value = "student_Id") String student_Id,@RequestParam(value = "student_Name") String student_Name){
        student s = new student();
        /**
         * 赋值
         */

        s.setStudent_id(Long.parseLong(student_Id));
        s.setStudent_name(student_Name );
//        Studentjdbc.addStudent(s);
       int result = studentMapper.insert(s);
    return"index";
}
}
