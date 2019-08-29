package com.springaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;

@Aspect
public class Track {

	@Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {}
	
	//@Before("execution(* *(..))")
	@Before("anyPublicOperation()")
	public void logMy(JoinPoint joinPoint) {
		System.out.println("before method:"+joinPoint.getSignature().getName());
	}
	
	@After("execution(* *(..))")
	public void logAfter(JoinPoint joinPoint) {
		System.out.println("after method:"+joinPoint.getSignature().getName());
	}
	
	@Around("execution(* *(..))")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("before @Around method:"+joinPoint.getSignature().getName());
		Object obj=joinPoint.proceed();
		System.out.println("after @Around method:"+joinPoint.getSignature().getName());
		System.out.println("return: "+obj);
	}
	
	@AfterReturning(pointcut="execution(* com.finastra.springaop.CreditCardPayment.*(..))",returning="result")
	public void logAfterReturning(JoinPoint joinPoint,Object result) {
		System.out.println("@AfterReturning method:"+joinPoint.getSignature().getName());
		System.out.println("return: "+result);
	}
	
	@AfterThrowing(pointcut="execution(* com.finastra.springaop.CreditCardPayment.*(..))",throwing="error")
	public void logAfterReturning(JoinPoint joinPoint,Throwable error) {
		System.out.println("after method:"+joinPoint.getSignature().getName());
		System.out.println("exception: "+error);
	}
	
	
	
}
