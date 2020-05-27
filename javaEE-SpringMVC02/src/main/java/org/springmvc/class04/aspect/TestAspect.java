package org.springmvc.class04.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
public class TestAspect {
    @Pointcut("execution(* org.springmvc.class04.*.*{..})")
    public void service(){}
    @Before("service()")
    public void beforeService(){
        System.out.println("After Service");

    }
    @Around("service()")
    public Object aroundservice(MethodInvocationProceedingJoinPoint JP){
        Object object=null;
        try{
            System.out.println("Before Around Service.");
            object=JP.proceed();
            System.out.println("After Around Service.");
        }catch(Throwable throwable){
            throwable.printStackTrace();
        }
        return object;
    }
}
