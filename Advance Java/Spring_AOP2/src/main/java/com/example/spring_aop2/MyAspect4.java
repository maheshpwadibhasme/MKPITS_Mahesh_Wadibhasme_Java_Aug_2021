package com.example.spring_aop2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect4 {

    @Before("execution(void allgetter())")
    public void beforeAspect1(){
        System.out.println("before1");
    }

    @Before("execution(void allgetter())")
    public void beforeAspect2(){
        System.out.println("before2");
    }
    @Pointcut("execution(public * get*())")
    void allgetter(){}
}
