package com.ghh.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
    //配置前置增强通知
    //@Before("execution(* com.ghh.anno.*.*(..))")
    public void before(){
        System.out.println("前置增强......");
    }

    @AfterReturning("execution(* com.ghh.anno.*.*(..))")
    public void afterReturning(){
        System.out.println("后置增强......");
    }

    //@Around("execution(* com.ghh.anno.*.*(..))")
    @Around("MyAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强...");
        return proceed;
    }

    //@AfterThrowing("execution(* com.ghh.anno.*.*(..))")
    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    //@After("execution(* com.ghh.anno.*.*(..))")
    @After("MyAspect.pointcut()")
    public void after(){
        System.out.println("最终增强...");
    }

    @Pointcut("execution(* com.ghh.anno.*.*(..))")
    public void pointcut(){};
}
