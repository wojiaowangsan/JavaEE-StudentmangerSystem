package org.springmvc.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springmvc.aop.jdbc.StudentHomeworkjdbc;
import org.springmvc.aop.model.StudentHomework;

import java.util.List;

@Controller
public class studentHomeworkController {
    @RequestMapping(value = "/showStudentHomework")
    private String showStudentHomework(Model model){

        List<StudentHomework> list = StudentHomeworkjdbc.selectAll();
        model.addAttribute("list",list);
        return"StudentHomework";
    }
}
