package com.husrev;

import org.springframework.context.ApplicationListener;

public class CustomOlayIsleyicisi implements ApplicationListener<CustomOlay> {

	public void onApplicationEvent(CustomOlay event) {
		System.out.println(event.toString());
	}

}
