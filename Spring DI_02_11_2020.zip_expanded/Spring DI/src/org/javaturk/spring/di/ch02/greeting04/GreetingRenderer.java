package org.javaturk.spring.di.ch02.greeting04;

public interface GreetingRenderer {
	
	public void render();

	public void setGreetingProvider(GreetingProvider provider);

}