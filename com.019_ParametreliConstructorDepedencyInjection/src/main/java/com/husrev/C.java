package com.husrev;

public class C {

	public C() {
		System.out.println("C sinifin default constructor'u\n");
	}

	public C(A aObject, B bObject) {
		System.out.println("C sinifin [A aObject: " + aObject + "B bObject: " + bObject + "] constructor'u\n");
		aObject.konsolaYaz();
		bObject.sonucuGoster();
	}

	public C(String mesaj, int sayi) {
		System.out.println("C sinifin [String mesaj : " + mesaj + ", int sayi : " + sayi + "] constructor'u");
		System.out.println(mesaj + " " + sayi);
	}

}
