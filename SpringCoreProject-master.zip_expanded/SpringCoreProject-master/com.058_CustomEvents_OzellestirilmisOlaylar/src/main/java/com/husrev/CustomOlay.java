package com.husrev;

import org.springframework.context.ApplicationEvent;

public class CustomOlay extends ApplicationEvent {

	public CustomOlay(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "Custom Event (Ozellesmis Olay)";
	}

}
