package com.example.demo.monitor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 郭朝彤
 * @date 2017/11/11.
 */
@Aspect
@Component
public class ServiceMonitor {
    @AfterReturning("execution(* com.example..*Service.*(..))")
    public void logServiceAccess(JoinPoint joinPoint) {
        System.out.println("Completed: " + joinPoint);
    }
}
