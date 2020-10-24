package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Yazar yazar = context.getBean("beanYazar", Yazar.class);
		
		System.out.println(
			     "YAZAR   : " + yazar.getAdi() + " " + yazar.getSoyadi()
			+ "\n KITAP   : " + yazar.getKitapAdi()
			+ "\n ISBN    : " + yazar.getKitap().getEserISBN()
			+ "\n ESER ADI: "+yazar.getKitap().getEserAdi());
		
		((ConfigurableApplicationContext) context).close();
	}
}
