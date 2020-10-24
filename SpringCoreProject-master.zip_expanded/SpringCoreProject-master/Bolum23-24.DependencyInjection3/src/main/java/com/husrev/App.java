package com.husrev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.husrev.egitmenler.Egitmen;
import com.husrev.egitmenler.JavaEgitmen;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		JavaEgitmen egitmen = context.getBean("egitmen", JavaEgitmen.class);
		System.out.println(egitmen.egitimPlaniVer());
		System.out.println("EgitmeninUcretin: " + egitmen.egitmenUcretiBelirle());
		System.out.println("Egitmenin Adi: " + egitmen.getEgitmenAdi());

		context.close();
	}
}
