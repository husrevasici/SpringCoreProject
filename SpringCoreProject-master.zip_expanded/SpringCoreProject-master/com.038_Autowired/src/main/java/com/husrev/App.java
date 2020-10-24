package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Ders ders = context.getBean("beanDers", Ders.class);

		System.out.println("ADI: " + ders.getOgrenci().getAdi());
		System.out.println("SOYADI: " + ders.getOgrenci().getSoyadi());
		System.out.println("YAS: " + ders.getOgrenci().getYasi());

		System.out.println("PUAN: " + ders.getPuan());
		System.out.println("DERS: " + ders.getDers());

	}
}
