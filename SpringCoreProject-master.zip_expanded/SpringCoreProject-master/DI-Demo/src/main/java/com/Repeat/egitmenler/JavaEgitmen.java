package com.Repeat.egitmenler;

import com.Repeat.egitmen.servisleri.EgitmenServisleri;

public class JavaEgitmen implements Egitmen {

	EgitmenServisleri servis; // burası dependency'im oldu.
	// cunku burdaki nesne asagidaki fonksiyonun hesaplanmasi icin
	// bu nesneye bagimli oldu

	
	
	public JavaEgitmen(EgitmenServisleri egitmenServisi) {
		this.servis = egitmenServisi;
		System.out.println("servis ismi: "+this.servis);
	}

	
	@Override
	public String egitimPlaniVer() {
		return "Her gun 2 saat Java kodlama uzerine calis";
	}


	@Override
	public int egitmenUcretiBelirle() {
		return servis.egitmenUcretiBelirle(3, 3, 2);
	}

}
