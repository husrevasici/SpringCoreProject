package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Listeler list = context.getBean("listelerBean", Listeler.class);
		System.out.println(list);
		
		RegExKontrol regExKontrol = context.getBean("regExKontrolBean", RegExKontrol.class);
		System.out.println(regExKontrol);

		context.close();
	}
}
