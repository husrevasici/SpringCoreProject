package com.husrev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanYazar")
public class Yazar {

	@Value("Husrev")
	private String adi;

	@Value("Asici")
	private String soyadi;

	@Value("#{beanKitap}")
	private Kitap kitap;

	@Value("#{beanKitap.eserAdi}")
	private String kitapAdi;

	@Value("#{beanKitap.kitapBilgisiniAl('Suleyman','Cicek','Ekmekci','+5652165146')}")
	private String bilgi;

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

	public Kitap getKitap() {
		return kitap;
	}

	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getBilgi() {
		return bilgi;
	}

	public void setBilgi(String bilgi) {
		this.bilgi = bilgi;
	}

}
