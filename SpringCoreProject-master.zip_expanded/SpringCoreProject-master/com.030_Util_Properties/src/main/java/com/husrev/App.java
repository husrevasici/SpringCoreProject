package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sehir personel = (Sehir) context.getBean("BeanProperties", Sehir.class);

		System.out.println(personel);
		((ConfigurableApplicationContext) context).close();

	}
}
