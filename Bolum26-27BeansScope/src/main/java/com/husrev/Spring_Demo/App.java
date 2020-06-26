package com.husrev.Spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		BizimMarket bm1 = (BizimMarket) ctx.getBean("bizimMarket");

		BizimMarket bm2 = (BizimMarket) ctx.getBean("bizimMarket");

		System.out.println(bm1 == bm2);
		System.out.println(bm1);
		System.out.println(bm2);

	}
}
