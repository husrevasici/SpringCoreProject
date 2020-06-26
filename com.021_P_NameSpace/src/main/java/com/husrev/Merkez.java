package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Ogrenci ogrenci = (Ogrenci) context.getBean("beanOgrenci");
		
		System.out.println("ADI        		 : " + ogrenci.getAdi());
		System.out.println("SOYADI     	 	 : " + ogrenci.getSoyadi());
		System.out.println("NUMARA     		 : " + ogrenci.getNumarasi());
		System.out.println("Universite       : " + ogrenci.getUniversite().kurumAdi);

	}
}
