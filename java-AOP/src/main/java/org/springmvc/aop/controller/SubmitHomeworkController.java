package org.springmvc.aop.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springmvc.aop.jdbc.StudentHomeworkjdbc;
import org.springmvc.aop.model.StudentHomework;
import org.springmvc.aop.model.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class SubmitHomeworkController {
    @Pointcut("execution(* org.springmv.aop.jdbc.StudentHomeworkjdbc.*(..))&& args(st)")
    public void service(){}
    @Before("service()")
    public void beforeService(homework h){
        System.out.println("before提交学生作业："+h.getHomeworkId());

    }

    @After("service()")
    public void afterService(homework h){
        System.out.println("after提交学生作业："+ h.getHomeworkId());

    }
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
        sh.setStudentId(Long.getLong(studentId));
        sh.setHomeworkId(Long.getLong( homeworkId));
        sh.setHomeworkContent(homeworkContent);
        sh.setCreateTime(new Date());
        sh.setHomeworkTitle(homeworkTitle);
        StudentHomeworkjdbc.addStudentHomework(sh);
        return"index";
    }
}
