package com.husrev;

public class Kitap {

	private long eserISBN;
	private String eserAdi;

	public String kitapBilgisiniAl(String yazarAdi, String yazarSoyadi, String eserAdi, long eserISBN) {

		this.eserAdi = eserAdi;
		this.eserISBN = eserISBN;

		return "\n\t YAZAR : " + yazarAdi + " " + "\n\t YAZARSOYADI : " + yazarSoyadi + "\n\t KITAP : " + getEserAdi()
				+ "\n\t ISBN  :" + getEserISBN() + "\n";

	}

	public long getEserISBN() {
		return eserISBN;
	}

	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
		System.out.println("setEserISBN : " + eserISBN);
	}

	public String getEserAdi() {
		return eserAdi;
	}

	public void setEserAdi(String eserAdi) {
		this.eserAdi = eserAdi;
		System.out.println("setEserAdi : " + eserAdi);
	}
}
