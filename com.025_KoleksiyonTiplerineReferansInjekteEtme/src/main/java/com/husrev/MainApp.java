package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Collection collection = context.getBean("Collection", Collection.class);
		System.out.println(collection.toString() + "\n");

	}

}
