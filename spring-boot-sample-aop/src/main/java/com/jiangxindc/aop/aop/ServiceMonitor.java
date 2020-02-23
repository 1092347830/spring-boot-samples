package com.jiangxindc.aop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMonitor {

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Before("execution(* com..*Controller.*(..))")
    public void logBeforeAccess(JoinPoint joinPoint) {
        startTime.set(System.currentTimeMillis());
        System.out.println("Begin: " + joinPoint);
    }

    @AfterReturning("execution(* com..*Controller.*(..))")
    public void logAfterAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
        System.out.println("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
    }


}
