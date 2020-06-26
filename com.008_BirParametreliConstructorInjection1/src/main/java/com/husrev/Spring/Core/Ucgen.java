package com.husrev.Spring.Core;

public class Ucgen {

	private String cesit;

	public Ucgen(String cesit1) {
		System.out.println("Ucgen contructor");
		this.cesit = cesit1;
	}

	public String getCesit() {
		System.out.println("getCesit Fonksiyonu");
		return cesit;
	}

	public void setCesit(String cesit) {
		System.out.println("setCesit Fonksiyonu");
		this.cesit = cesit;
	}

	public void ciz() {
		System.out.println("public void ciz metodu");
		System.out.println(getCesit() + " ucgen ciz");
	}

}
