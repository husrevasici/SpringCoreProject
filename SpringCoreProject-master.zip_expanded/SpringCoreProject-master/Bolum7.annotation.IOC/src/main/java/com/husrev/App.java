package com.husrev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Egitmen benimEgitmen = context.getBean("javaEgitmeni", Egitmen.class);
		benimEgitmen.egitimPlaniVer();
		System.out.println(benimEgitmen.ucretVer());

		context.close();
	}
}
