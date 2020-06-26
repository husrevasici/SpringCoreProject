package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Calisan calisan = context.getBean("beanCalisan", Calisan.class);

		System.out.println(calisan.getSehir().getSehirAdi());

		((ConfigurableApplicationContext) context).close();

	}
}
