package com.example.mybatis.controller;

import com.example.mybatis.dao.homeworkMapper;
import com.example.mybatis.model.homework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class addHomeworkController {
    @Autowired
    private com.example.mybatis.dao.homeworkMapper homeworkMapper;
    @RequestMapping(value = "addHomework",method = RequestMethod.POST)
    private String  addHomeworkController(@RequestParam(value = "homework_Id") String homework_Id,
                                          @RequestParam(value = "homework_Title") String homework_Title,
                                          @RequestParam(value = "homework_Content") String homework_Content
    ){
        homework h= new homework();
        /**
         * 赋值
         */

        h.setHomework_Id(Long.parseLong(homework_Id));
        h.setHomework_Title( homework_Title );
        h.setHomework_Content(homework_Content);
       int result =homeworkMapper.insert(h);
        return "index";
    }
}
