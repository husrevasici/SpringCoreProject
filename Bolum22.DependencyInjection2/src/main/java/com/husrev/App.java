package com.husrev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.husrev.egitmenler.Egitmen;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Egitmen egitmen = context.getBean("egitmen", Egitmen.class);
		Egitmen egitmen1 = context.getBean("egitmen1", Egitmen.class);

		System.out.println(egitmen.egitimPlaniVer());
		
		System.out.println(egitmen.egitmenUcretiBelirle());
	
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		System.out.println(egitmen1.egitimPlaniVer());
		
		System.out.println(egitmen1.egitmenUcretiBelirle());
		
		context.close();
	}
}
