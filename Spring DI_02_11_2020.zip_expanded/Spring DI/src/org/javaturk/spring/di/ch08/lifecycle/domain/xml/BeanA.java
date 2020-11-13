package org.javaturk.spring.di.ch08.lifecycle.domain.xml;

public class BeanA {
	
	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
	
	@Override
	public String toString() {
		if(beanB != null)
			return "BeanA: " + beanB.toString();
		else
			return "BeanA: " + "beanB is null";
	}
	
	public static BeanA create() {
		return new BeanA();
	}
	
	public void startUp() {
		System.err.println("in BeanA startUp()");
	}
	
	public void cleanUp() {
		System.err.println("in BeanA cleanUp()");
	}
}
