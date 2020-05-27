package com.example.mybatis.controller;

import com.example.mybatis.dao.StudentHomeworkMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.mybatis.model.StudentHomework;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class SubmitHomeworkController {
    @Autowired
    private StudentHomeworkMapper studentHomeworkMapper;
    @RequestMapping(path = "/SubmitHomework",method = RequestMethod.POST)

    private String  submitHomework (@RequestParam(value = "Id") String Id,
                                          @RequestParam(value = "studentId") String studentId,
                                          @RequestParam(value = "homeworkId") String homeworkId,
                                          @RequestParam(value = "homeworkTitle") String homeworkTitle,
                                          @RequestParam(value = "homeworkContent") String homeworkContent

    ){
        StudentHomework sh = new StudentHomework();
        /**
         * 赋值
         */
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sh.setId(Long.getLong( Id));
        sh.setStudent_id(Long.getLong(studentId));
        sh.setHomework_id(Long.getLong( homeworkId));
        sh.setHomework_content(homeworkContent);
        sh.setCreate_time(new Date());
        sh.setHomework_title(homeworkTitle);
        studentHomeworkMapper.insert(sh);
        return"index";
    }
}
