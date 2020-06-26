package com.husrev.Spring.Core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Ucgen ucgen = (Ucgen) ctx.getBean("ucgen");

		ucgen.ciz();

	}
}
