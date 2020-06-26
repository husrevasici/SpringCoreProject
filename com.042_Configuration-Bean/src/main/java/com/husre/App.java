package com.husre;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(SpringBeansConfig.class);
		context.refresh();
		// Yenilemeyi CRUD islemlerinden sonra yaparız.
		// Konteynir'in tazelemesi performansımıza olumlu katkı saglar.

		Ogrenci ogrenci = context.getBean(Ogrenci.class);
		System.out.println(ogrenci.getSehir().getSehirAdi());
		System.out.println(ogrenci.getSehir().getPlakaNo());

		((ConfigurableApplicationContext) context).close();

	}
}
