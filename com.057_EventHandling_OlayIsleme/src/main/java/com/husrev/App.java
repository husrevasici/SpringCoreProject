package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		context.start();
		Sozler sozler = context.getBean("beanSozler", Sozler.class);
		sozler.EkranaYaz();
		context.stop();
		context.close();
	}
}
