package com.husrev.matematik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hesapMakinesiBeanComponent")
public class HesapMakinesi {

	@Autowired
	private Islem islem;

	public Islem getIslem() {
		return islem;
	}

	public void setIslem(Islem islem) {
		System.out.println("setIslem metodu");
		this.islem = islem;
	}

	public void sonuclariGetir(int sayi1, int sayi2) {
		System.out.println("topla: " + islem.topla(sayi1, sayi2));
		System.out.println("cikar: " + islem.cikar(sayi1, sayi2));
		System.out.println("carp: " + islem.carp(sayi1, sayi2));
		System.out.println("bol: " + islem.bol(sayi1, sayi2));
	}

}
