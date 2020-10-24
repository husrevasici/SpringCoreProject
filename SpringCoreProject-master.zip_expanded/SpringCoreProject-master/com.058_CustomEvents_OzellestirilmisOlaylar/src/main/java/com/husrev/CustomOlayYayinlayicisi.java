package com.husrev;

import org.springframework.context.*;

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {

		this.publisher = (ApplicationEventPublisher) publisher;
	}

	public void yayinla() {

		CustomOlay customOlay = new CustomOlay(this);
		publisher.publishEvent(customOlay);
	}

}
