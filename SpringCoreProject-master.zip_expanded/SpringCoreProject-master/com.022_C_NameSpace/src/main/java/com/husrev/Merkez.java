package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Calisan calisan = (Calisan) context.getBean("beanCalisan");
		System.out.println("adi: " + calisan.getAdi());
		System.out.println("Soyadi: " + calisan.getSoyadi());
		System.out.println("Yasi" + calisan.getYasi());
		
		System.out.println("Adres: " + calisan.getAdres());
		
		System.out.println("Cadde: " + calisan.getAdres().getCadde());
		System.out.println("Daire: " + calisan.getAdres().getDaire());
		System.out.println("Mahalle: " + calisan.getAdres().getMahalle());
		System.out.println("No: " + calisan.getAdres().getNo());
		System.out.println("Sehir: " + calisan.getAdres().getSehir());
		System.out.println("Semt: " + calisan.getAdres().getSemt());

	}

}
