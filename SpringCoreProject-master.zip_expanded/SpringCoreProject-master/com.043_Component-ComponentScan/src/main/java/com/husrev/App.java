package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.husrev.matematik.HesapMakinesi;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HesapMakinesi hesapMakinasi = context.getBean("hesapMakinesiBeanComponent", HesapMakinesi.class);

		hesapMakinasi.sonuclariGetir(12, 2);

		((ConfigurableApplicationContext) context).close();
	}
}
