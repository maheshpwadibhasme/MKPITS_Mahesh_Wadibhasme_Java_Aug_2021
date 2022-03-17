package com.example.spring_aop2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect3 {

    @Before("execution(public * get*(..))")
    public void beforeAspect(){
        System.out.println("before");
    }
    @After("execution(public * get*(..))")
    public void afterAspect(){
        System.out.println("after");
    }
}
