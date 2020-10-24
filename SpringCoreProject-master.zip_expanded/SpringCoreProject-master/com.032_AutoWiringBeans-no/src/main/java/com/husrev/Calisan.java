package com.husrev;

public class Calisan {

	private String adi, soyadi;
	private Adres adres;

	public Calisan(Adres adres) {
		this.adres = adres;
		System.out.println("calisan constructor metodu");
	}

	@Override
	public String toString() {
		return "CALISANIN " + adres;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}
