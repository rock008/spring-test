package com.rock.log;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Component
public class LogService implements MethodInterceptor{

	public void logAround(){
		System.out.println("logging around");
	}

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		return arg0.proceed();
	}

}
