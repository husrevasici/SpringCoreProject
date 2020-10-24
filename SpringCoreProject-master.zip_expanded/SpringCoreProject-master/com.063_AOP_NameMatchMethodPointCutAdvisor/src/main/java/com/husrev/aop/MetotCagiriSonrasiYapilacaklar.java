package com.husrev.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetotCagiriSonrasiYapilacaklar implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		if (method.getName().equals("selamVer")) {
			System.out.println("---if # selamVer----Spring AOP ile her metotdan SONRA giren afterReturning metodu.-------\n\n");
		} else if (method.getName().equals("personelBilgileriniVer")) {
			System.out.println(
					"--elseif # personelBilgileriniVer---Spring AOP ile her metotdan SONRA giren afterReturning metodu.-------\n\n");
		} else if (method.getName().equals("adiSoyadiKontrolEt")) {
			System.out.println(
					"--elseif # adiSoyadiKontrolEt-----Spring AOP ile her metotdan SONRA giren afterReturning metodu.-------\n\n");
		} else {
			System.out.println("asdasdas");
		}
	}

}
