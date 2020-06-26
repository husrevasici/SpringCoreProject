package com.husrev;

import org.springframework.beans.factory.annotation.Autowired;

public class Ders {

	@Autowired
	private Ogrenci ogrenci;
	private int puan;
	private String ders;

	public Ogrenci getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(Ogrenci ogrenci) {
		this.ogrenci = ogrenci;
		System.out.println("setOgrenci metodu");
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
		System.out.println("setPuan metodu");
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
		System.out.println("setDers metodu");
	}

}
