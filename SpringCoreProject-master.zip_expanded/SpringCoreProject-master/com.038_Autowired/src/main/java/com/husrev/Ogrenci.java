package com.husrev;

public class Ogrenci {
	private int yasi;
	private String adi, soyadi;
	
	public int getYasi() {
		return yasi;
	}

	public void setYasi(int yasi) {
		this.yasi = yasi;
		System.out.println("setYasi metodu");
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
		System.out.println("setAdi metodu");
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
		System.out.println("setSoyadi metodu");
	}
}
