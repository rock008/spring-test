package com.rock.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.aspectj.lang.Signature;
@Component
public class LogService{

	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		printInvokeInfo(joinPoint);
		System.out.println("logging around before");
		joinPoint.proceed();
		System.out.println("logging around after");
	}

	private void printInvokeInfo(ProceedingJoinPoint joinPoint){
		Object target = joinPoint.getTarget();
		String classname = target.getClass().getName();
	    Signature sinature =	joinPoint.getSignature();
	    String methodName = sinature.getName();
	    System.out.println("invoke "+classname+"."+methodName);
	}
	
}
