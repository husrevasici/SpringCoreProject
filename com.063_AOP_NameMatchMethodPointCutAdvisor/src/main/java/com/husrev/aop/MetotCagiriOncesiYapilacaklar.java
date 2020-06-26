package com.husrev.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MetotCagiriOncesiYapilacaklar implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n-----Spring AOP ile her metottan ONCE devreye giren before metodu");
	}
}
