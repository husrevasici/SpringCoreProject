package com.husrev;

public class Adres {
	private String tamAdresi;

	public String getTamAdresi() {
		return tamAdresi;
	}

	public void setTamAdresi(String tamAdresi) {
		this.tamAdresi = tamAdresi;
		System.out.println("Adres clası setTamAdres metotodu");
	}

	@Override
	public String toString() {
		return "TAM ADRES: " + getTamAdresi().toUpperCase().toString();
	}

}
