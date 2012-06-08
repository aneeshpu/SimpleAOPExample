package com.aneesh.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: aneeshpu
 * Date: 8/6/12
 * Time: 7:02 AM
 * To change this template use File | Settings | File Templates.
 */
@Aspect
public class MyAspect {

    @Before("execution(* *(..))")
    public void greetAdvice(){
        System.out.println("Inside advice");
    }

}
