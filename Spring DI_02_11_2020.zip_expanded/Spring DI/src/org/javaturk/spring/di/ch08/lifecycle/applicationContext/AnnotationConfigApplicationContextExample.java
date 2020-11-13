package org.javaturk.spring.di.ch08.lifecycle.applicationContext;

import java.util.Arrays;

import org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain1.*;
import org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain2.*;
import org.javaturk.spring.di.ch08.lifecycle.callback.domain.domain3.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({ "org.javaturk.spring.di.ch08.lifecycle.event.domain.domain1", "org.javaturk.spring.di.ch08.lifecycle.event.domain.domain2" })
public class AnnotationConfigApplicationContextExample {

	public static void main(String[] args) {
//		getBeans1();
		getBeans2();
//		getBeans3();
//		getBeans4();
//		getBeans5();
//		getBeans6();
//		getBeans7();
//		getBeans8();
	}

	public static void getBeans1() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExample.class);
		context.close();
	}

	public static void getBeans2() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.event.domain.domain1");
		context.refresh();
//		BeanA beanA = (BeanA) context.getBean("beanA");
		context.close();
	}

	public static void getBeans3() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.javaturk.spring.di.ch08.lifecycle.event.domain.domain1");
//		BeanA beanA = (BeanA) context.getBean("beanA");
		context.close();
	}

	public static void getBeans4() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				"org.javaturk.spring.di.ch08.lifecycle.event.domain.domain1");
		BeanA beanA = (BeanA) context.getBean("beanA");
		listBeans(context);
		context.scan("org.javaturk.spring.di.ch08.lifecycle.event.domain.domain2");
		listBeans(context);
//		context.getBean("beanC");
//		context.getBean("beanD");
		context.close();
	}
	
	public static void getBeans5() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfigApplicationContextExampleAppConfig.class);
		context.close();
	}
	
	public static void getBeans6() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
		listBeans(context);
		context.refresh();
		context.close();
	}
	
	public static void getBeans7() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("org.javaturk.spring.di.ch08.lifecycle.event.domain.domain1");
		listBeans(context);
//		context.refresh();
//		context.getBean("beanA");
//		context.refresh();
		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
		listBeans(context);
		context.refresh();
		context.getBean("beanE");
		context.getBean("beanF");
		
		context.close();
	}
	
	public static void getBeans8() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(BeanA.class);
//		context.refresh();
//		context.getBean("beanA");
		listBeans(context);
		context.register(AnnotationConfigApplicationContextExampleAppConfig.class);
		context.refresh();
		listBeans(context);
//		context.getBean("beanE");
//		context.getBean("beanF");
		
		context.close();
	}
	
	public static void listBeans(AnnotationConfigApplicationContext context) {
		System.out.println("\nListing beans: " + context.getBeanDefinitionCount() + " beans defined.");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println();
	}
}

@Configuration
class AnnotationConfigApplicationContextExampleAppConfig{
	
	@Bean
	public BeanE beanE() {
		return new BeanE();
	}
	
	@Bean
	public BeanF beanF() {
		return new BeanF();
	}
	
	@Bean
	public String name() {
		return "Bean_E";
	}
}
