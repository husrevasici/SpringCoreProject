package com.husrev.aop;

import org.springframework.aop.ThrowsAdvice;

public class MetotCagiriIstisnaSonrasiYapilacaklar implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out
				.println("-----Spring AOP ile her metotlardaki bir ISTISNA SONRA calisan afterThrowing metodu.----\n");
	}
}
