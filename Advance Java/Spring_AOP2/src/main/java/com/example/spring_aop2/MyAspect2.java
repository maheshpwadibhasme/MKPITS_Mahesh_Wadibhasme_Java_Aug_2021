package com.example.spring_aop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect2 {
    @Before("execution(public * getName())")
    public void beforeAdvice(){
        System.out.println("before");
    }
    @After("execution(public * getName())")
    public void afterAdvice(){
        System.out.println("after");
    }
}
