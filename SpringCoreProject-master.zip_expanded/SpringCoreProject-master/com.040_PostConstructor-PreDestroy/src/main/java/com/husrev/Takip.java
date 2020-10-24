package com.husrev;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Takip {

	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
		System.out.println("setMesaj");
	}

	@PostConstruct
	public void init() {
		System.out.println("init method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}

}
