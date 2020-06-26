package com.husrev.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetotCagiriSonrasiYapilacaklar implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("-------Spring AOP ile her metotdan SONRA giren afterReturning metodu.-------\n\n");
	}

}
