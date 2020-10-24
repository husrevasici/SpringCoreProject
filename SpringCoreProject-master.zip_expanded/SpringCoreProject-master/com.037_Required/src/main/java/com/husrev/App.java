package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Ogrenci ogrenci = context.getBean("beanOgrenci", Ogrenci.class);

		System.out.println("ADI: " + ogrenci.getAdi());
		System.out.println("SOYADI: " + ogrenci.getSoyadi());
		System.out.println("YASI: " + ogrenci.getYasi());
//		System.out.println(ogrenci);

		((ConfigurableApplicationContext) context).close();
	}
}
