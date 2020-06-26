package com.husrev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//		A aObject = new A();
//		B b = new B(aObject);
//		b.sonucuGoster();

		// Ust satirdaki oop ile cagirdimiz b sinifina ait contructor metodunu
		// asagida spring f. ile yapilisi vardir.
		B b = (B) context.getBean("beanB");
		b.sonucuGoster();

	}
}
