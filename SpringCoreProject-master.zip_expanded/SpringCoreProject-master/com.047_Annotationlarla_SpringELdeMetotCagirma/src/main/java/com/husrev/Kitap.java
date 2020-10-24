package com.husrev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanKitap")
public class Kitap {

	@Value("99999999999")
	private long eserISBN;

	@Value("Spring Framework")
	private String eserAdi;

	public String kitapBilgisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {
		this.eserISBN = eserISBN;
		this.eserAdi = eserAdi;

		return "\n\t YAZAR : " + yazarAdi + " " + "YAZARSOYADI : " + yazarSoyadi + 
			   "\n\t KITAP : " + getEserAdi()
			  +"\n\t ISBN  :" + getEserISBN() + "\n";

	}

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
	}
}
