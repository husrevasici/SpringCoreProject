package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Personel personel = (Personel) context.getBean("BeanPersonel", Personel.class);

		System.out.println(" ADI:				:" + personel.adi);
		System.out.println("SOYADI:				:" + personel.soyadi);
		System.out.println("ADRES:				:" + personel.adres);
		System.out.println("GOREVI:				:" + personel.gorevi);
		System.out.println("ANNE ADI:			:" + personel.anneAdi);
		System.out.println("BABA ADI:			:" + personel.babaAdi);
		System.out.println("TELNO:				:" + personel.telNo);

		System.out.println("DOGUM YILI:			:" + personel.dogumYili);
		System.out.println("MAASI:				:" + personel.maasi);
		System.out.println("MEDENI HALI:		:" + personel.medeniHali);
		System.out.println("EHLİYET:			:" + personel.isEhliyet());

		((ConfigurableApplicationContext) context).close();

	}
}
