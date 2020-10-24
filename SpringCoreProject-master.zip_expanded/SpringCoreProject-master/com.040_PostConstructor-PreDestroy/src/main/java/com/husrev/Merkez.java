package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Takip takip = context.getBean("beanTakip", Takip.class);

		System.out.println(takip.getMesaj());
		((ConfigurableApplicationContext) context).close();
	}
}
