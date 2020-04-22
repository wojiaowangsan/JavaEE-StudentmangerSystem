package org.springmvc.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springmvc.aop.jdbc.Studentjdbc;
import org.springmvc.aop.model.StudentHomework;
import org.springmvc.aop.model.student;

@Controller
@Aspect
public class addStudentController {
    @Pointcut("execution(* org.springmv.aop.jdbc.Studentjdbc.*(..))&& args(st)")
    public void service(){}
    @Before("service()")
    public void beforeService(student st){
        System.out.println("before添加学生："+st.getStudentName());

    }

    @After("service()")
    public void afterService(student st){
        System.out.println("after添加学生："+st.getStudentName());

    }

    @RequestMapping(path = "addStudent",method = RequestMethod.POST)
private String addStudent(@RequestParam(value = "student_Id") String student_Id,@RequestParam(value = "student_Name") String student_Name){
        student s = new student();
        /**
         * 赋值
         */

        s.setStudentId(Long.parseLong(student_Id));
        s.setStudentName(student_Name );
//        Studentjdbc.addStudent(s);
        Boolean result = Studentjdbc.addStudent(s);
    return"index";
}
}
