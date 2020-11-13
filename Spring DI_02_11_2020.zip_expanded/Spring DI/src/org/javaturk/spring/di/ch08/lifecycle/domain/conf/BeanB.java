package org.javaturk.spring.di.ch08.lifecycle.domain.conf;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {

	private BeanC beanC;

	public BeanC getBeanC() {
		return beanC;
	}

	@Autowired
	public void setBeanC(BeanC beanC) {
		this.beanC = beanC;
	}
	
	@Override
	public String toString() {
		if(beanC != null)
			return "BeanB: " + beanC.toString();
		else
			return "BeanB: " + "beanC is null";
	}
	
//	public void startUp() {
//		System.err.println("in BeanB startUp()");
//	}
//	
//	public void cleanUp() {
//		System.err.println("in BeanB cleanUp()");
//	}
}
