package com.husrev;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		context.start();
		Sozler sozler = context.getBean("sozlerBean", Sozler.class);
		sozler.EkranaYaz();
		CustomOlayYayinlayicisi olayYayinlayicisi = context.getBean("customOlayYayinlayicisiBean",
				CustomOlayYayinlayicisi.class);

		olayYayinlayicisi.yayinla();
		olayYayinlayicisi.yayinla();
		olayYayinlayicisi.yayinla();

		context.stop();
		context.close();
	}
}
