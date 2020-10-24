package com.husrev;

public class B {

	private A aObject;

	public B(A aObject) {
		System.out.println("B Sinifina ait contructor metodu" + aObject);
		this.aObject = aObject;
	}

	public void sonucuGoster() {
		System.out.println("B sinifina ait normal bir metod.\n");
//		aObject.konsolaYaz();
	}
}
