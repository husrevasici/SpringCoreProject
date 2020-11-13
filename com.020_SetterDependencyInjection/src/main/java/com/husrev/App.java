package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		A aObject = new A();
//		B b = new B(aObject);
//		b.sonucuGoster();

		// Ust satirdaki oop ile cagirdimiz b sinifina ait contructor metodunu
		// asagida spring f. ile yapilisi vardir.

		B b = (B) context.getBean("beanB");
		System.out.println();
		b.sonucuGoster();
		System.out.println(b.getMesaj() + " " + b.getSayi());
		System.out.println(b.getaObject());

	}
}
