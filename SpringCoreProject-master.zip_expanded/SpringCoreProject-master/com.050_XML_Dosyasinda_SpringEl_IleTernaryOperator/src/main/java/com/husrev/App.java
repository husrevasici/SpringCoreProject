package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		TernaryOperator ternaryOperator = context.getBean("ternaryOperatorBean", TernaryOperator.class);

		System.out.println("ternary: " + ternaryOperator);

		System.out.println("Sonuc: " + ternaryOperator.isKontrol());

		((ConfigurableApplicationContext) context).close();

	}
}
