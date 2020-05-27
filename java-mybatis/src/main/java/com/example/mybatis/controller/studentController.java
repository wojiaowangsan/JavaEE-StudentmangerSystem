package com.example.mybatis.controller;

import com.example.mybatis.dao.studentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.mybatis.model.student;

import java.util.List;

@Controller
public class studentController {
    @Autowired
private com.example.mybatis.dao.studentMapper studentMapper;
@RequestMapping(value = "/showStudents")
    private String showStudent(Model model){
        List<student> list = studentMapper.findAll();
        model.addAttribute("list",list);
        return "student";
    }

}
