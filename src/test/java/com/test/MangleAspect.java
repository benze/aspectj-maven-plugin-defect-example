package com.test;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MangleAspect {

    @Pointcut("execution(* com.test.ServiceImpl.*(..))")
    private void workItemServices() {
    }
    
    
    @Around("workItemServices()")
    public Object mangleOutput(ProceedingJoinPoint pjp ) throws Throwable {
    	String output = (String)pjp.proceed();
    	
    	output = new Date().toString();
    	return output;
    }
}
