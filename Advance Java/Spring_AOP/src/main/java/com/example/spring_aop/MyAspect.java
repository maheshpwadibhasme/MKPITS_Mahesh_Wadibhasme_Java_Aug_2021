package com.example.spring_aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public int getId())")
    public void beforeAdvice(){
        System.out.println("before");
    }

    @After("execution(public int getId())")
    public void afterAdvice(){
        System.out.println("After");
    }


}
