package com.rock.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class LogService{

	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("logging around before");
		joinPoint.proceed();
		System.out.println("logging around after");
	}

}
