package com.example.spring_aop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public int com.example.spring_aop2.Employee.getId())")
    public void beforeAdvice(){
        System.out.println("before");
    }
    @After("execution(public String com.example.spring_aop2.Employee.getName())")
    public void afterAdvice(){
        System.out.println("After");
    }

    @Before("execution(public int com.example.spring_aop2.Student.getId())")
    public void beforeAdvice2(){
        System.out.println("before");
    }
    @After("execution(public String com.example.spring_aop2.Student.getName())")
    public void afterAdvice2(){
        System.out.println("after");
    }
}
