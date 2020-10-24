package com.husrev.aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CagirilanMetodunOncesiVeSonrasiOzellikleri implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("***** Cagirilan metodun ONCEKI durumu.");
		System.out.println("***** Cagirilan metodun adi: " + invocation.getMethod().getName());
		System.out.println("***** Cagirilan metodun argumentleri : " + Arrays.toString(invocation.getArguments()));

		try {
			Object result = invocation.proceed();
			System.out.println("***** Cagirilan metodun SONRAKI dururmu.");
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println("*** Cagirilan metota ISTISNA meydana gelme durumu");
			throw e;
		}

	}

}
