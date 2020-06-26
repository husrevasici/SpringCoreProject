package com.husrev;

public class Yazar {

	private String adi, soyadi, kitapAdi;
	private Kitap kitap;
	private String bilgi;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
		System.out.println("setAdi" + adi);
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
		System.out.println("setSoyadi" + soyadi);
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
		System.out.println("setKitap" + kitapAdi);
	}

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
		System.out.println("setKitap Bean'i" + kitap);
	}

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
		System.out.println("setBilgi" + bilgi);
	}
}
