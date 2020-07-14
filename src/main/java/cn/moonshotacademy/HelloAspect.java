package cn.moonshotacademy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {
    @Around(value = "execution(* cn.moonshotacademy.HelloWorld.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable { 
        System.out.println("start log: " + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log: " + joinPoint.getSignature().getName());
        return object;
    }
}