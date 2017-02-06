package com.bucket.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspect {

    @Pointcut("within(com.bucket.spring.aop..*)")
    public void testPointCut() {
        System.out.println("====");

    }

    @Around("testPointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {

        System.out.println("====aspect.....");
        pjp.proceed();
    }
}
