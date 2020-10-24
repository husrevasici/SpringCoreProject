package com.husrev;

public class B {

	private A aObject;
	private String mesaj;
	private int sayi;

	public B(A aObject) {
		System.out.println("B Sinifina ait contructor metodu");
		this.aObject = aObject;
	}

	public void sonucuGoster() {
		System.out.println("B sinifina ait normal bir metod.\n");
		aObject.konsolaYaz();
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		System.out.println("setMejas fonks. gelen deger: " + mesaj);
		this.mesaj = mesaj;
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		System.out.println("setSayi fonks. gelen deger: " + sayi);
		this.sayi = sayi;
	}

	public A getaObject() {
		return aObject;
	}

	public void setaObject(A aObject) {
		System.out.println("setObject fonks. gelen deger: " + aObject);
		this.aObject = aObject;
	}

}
