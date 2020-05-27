package com.example.mybatis.controller;

import com.example.mybatis.dao.StudentHomeworkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.mybatis.model.StudentHomework ;


import java.util.List;

@Controller
public class studentHomeworkController {
    @Autowired
    private StudentHomeworkMapper studentHomeworkMapper;
    @RequestMapping(value = "/showStudentHomework")
    private String showStudentHomework(Model model){

        List<StudentHomework> list =  studentHomeworkMapper.findAll();
        model.addAttribute("list",list);
        return"StudentHomework";
    }
}
