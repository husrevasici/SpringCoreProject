package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Ogrenci ogrenci = (Ogrenci) context.getBean("ogrenciBean");

		System.out.println(ogrenci.getOgrenciList());
		System.out.println(ogrenci.getOgrenciSet());
		System.out.println(ogrenci.getOgrenciMap());
		System.out.println(ogrenci.getOgrenciPro());

		((ConfigurableApplicationContext) context).close(); // isimiz bittikten sonra hafiza silme islemi yapar.

	}

}
