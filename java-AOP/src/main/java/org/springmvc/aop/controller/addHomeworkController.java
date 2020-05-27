package org.springmvc.aop.controller;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springmvc.aop.jdbc.Homeworkjdbc;
import org.springmvc.aop.model.StudentHomework;
import org.springmvc.aop.model.homework;
import org.springmvc.aop.model.student;

@Controller
@Aspect
public class addHomeworkController {

    @Pointcut("execution(* org.springmv.aop.jdbc.StudentHomeworkjdbc.*(..))&& args(st)")
    public void service(){}
    @Before("service()")
    public void beforeService(StudentHomework sh){
        System.out.println("before添加学生作业："+sh.getHomeworkId());

    }

    @After("service()")
    public void afterService(StudentHomework sh){
        System.out.println("after添加学生作业："+sh.getHomeworkId());

    }

    @RequestMapping(value = "addHomework",method = RequestMethod.POST)
    private String  addHomeworkController(@RequestParam(value = "homework_Id") String homework_Id,
                                          @RequestParam(value = "homework_Title") String homework_Title,
                                          @RequestParam(value = "homework_Content") String homework_Content
    ){
        homework h= new homework();
        /**
         * 赋值
         */

        h.setHomeworkId(Long.parseLong(homework_Id));
        h.setHomeworkName( homework_Title );
        h.setHomeworkContent(homework_Content);
        Boolean result = Homeworkjdbc.addHomework(h);
        return "index";
    }
}
