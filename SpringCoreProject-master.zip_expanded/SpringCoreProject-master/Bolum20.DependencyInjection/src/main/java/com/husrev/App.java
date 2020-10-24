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

		System.out.println(egitmen.egitimPlaniVer());
		System.out.println(egitmen.egitmenUcretiBelirle());
	}
}
