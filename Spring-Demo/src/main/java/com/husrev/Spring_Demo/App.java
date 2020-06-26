package com.husrev.Spring_Demo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		BizimMarket bm1 = (BizimMarket) ctx.getBean("bizimMarket");
		bm1.bizimReklam();
		((FileSystemXmlApplicationContext) ctx).close();

	}
}
