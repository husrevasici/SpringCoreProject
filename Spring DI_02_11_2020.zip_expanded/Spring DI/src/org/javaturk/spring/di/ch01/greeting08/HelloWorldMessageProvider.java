package org.javaturk.spring.di.ch01.greeting08;

class HelloWorldGreetingProvider implements GreetingProvider {

	@Override
	public String getGreeting() {
		return "Hello World!";
	}

}
