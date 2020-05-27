package org.springmvc.class04.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.springmvc.class04.*")
public class TestSpring {
    public static  void main(String[] args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(TestSpring.class);
    }
}
