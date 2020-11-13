package org.javaturk.spring.di.ch08.processor.beanPostProcessor;

import java.time.LocalDateTime;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.javaturk.spring.di.ch08.processor.domain.*;

public class MyBeanPostProcessor1 implements BeanPostProcessor{
	
	 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 if (beanName.equals("beanA"))
			 ((BeanA) bean).setPreInitializationDate(LocalDateTime.now());
		return bean;
	}

	 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		 if (beanName.equals("beanA"))
			 ((BeanA) bean).setPostInitializationDate(LocalDateTime.now());
		return bean;
	}
}
