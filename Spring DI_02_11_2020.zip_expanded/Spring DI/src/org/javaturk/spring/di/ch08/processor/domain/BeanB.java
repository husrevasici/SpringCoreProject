package org.javaturk.spring.di.ch08.processor.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BeanB {
	private LocalDateTime preInitializationDate;
	private LocalDateTime postInitializationDate;

	public void setPreInitializationDate(LocalDateTime preInitializationDate) {
		this.preInitializationDate = preInitializationDate;
	}

	public void setPostInitializationDate(LocalDateTime postInitializationDate) {
		this.postInitializationDate = postInitializationDate;
	}

	@Override
	public String toString() {
		return "BeanA [preInitializationDate=" + preInitializationDate + ", postInitializationDate=" + postInitializationDate + "]";
	}
	
	public void defaultStartUp() {
		System.err.println("in BeanA defaultStartUp()");
	}
	
	public void defaultCleanUp() {
		System.err.println("in BeanA defaultCleanUp()");
	}
	
	public void startUp() {
		System.err.println("in BeanA startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanA cleanUp()");
	}
}
