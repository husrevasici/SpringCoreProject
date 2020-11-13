package org.javaturk.spring.di.ch08.processor.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.javaturk.spring.di.ch08.processor.domain.*;

public class BeanPostProcessorExample {
	public static void main(String[] args) {
		getBeans1();
	}
	
	public static void getBeans1(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("org/javaturk/spring/di/ch08/processor/beanPostProcessor/resources/beans.xml");
		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
		context.close();
	}
}
