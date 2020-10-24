package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Selam nesne1 = (Selam) context.getBean("selam");

		// nesne1.setMesaj("Mulla Husrev Asici");
		nesne1.goster();

		System.out.println("*****************\n");
		Yazar nesne2 = (Yazar) context.getBean("yazar");

		// nesne1.setMesaj("Mulla Husrev Asici");
		nesne2.goster();

	}
}
