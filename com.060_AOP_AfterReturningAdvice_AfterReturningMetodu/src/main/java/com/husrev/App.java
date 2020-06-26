package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonelServis personelServis = context.getBean("personelServisBeanProxy", PersonelServis.class);
		try {
			personelServis.adiSoyadiKontrolEt();
		} catch (Exception e) {
			System.err.println(e);
		}
		personelServis.selamVer("Hosgeldiniz");
		personelServis.personelBilgileriniVer();
	}
}
