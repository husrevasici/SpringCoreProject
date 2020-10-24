package com.husrev;

import org.springframework.beans.factory.annotation.*;

public class Ogrenci {
	private Integer yasi;
	private String adi, soyadi;

	public Ogrenci() {

	}

	public Ogrenci(int yasi, String adi, String soyadi) {
		this.yasi = yasi;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
		System.out.println("setAdi mothod");
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
		System.out.println("setSoyadi mothod");
	}

	public Integer getYasi() {
		return yasi;
	}

	@Required
	public void setYasi(Integer yasi) {
		this.yasi = yasi;
		System.out.println("setYasi mothod");
	}

}
