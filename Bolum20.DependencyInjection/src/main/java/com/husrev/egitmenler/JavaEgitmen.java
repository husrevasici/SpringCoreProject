package com.husrev.egitmenler;

import com.husrev.egitmen.servisleri.EgitmenServisleri;

public class JavaEgitmen implements Egitmen {

	EgitmenServisleri servis; // burası dependency'im oldu.
	// cunku burdaki nesne asagidaki fonksiyonun hesaplanmasi icin
	// bu nesneye bagimli oldu

	public JavaEgitmen(EgitmenServisleri servis) {
		this.servis = servis;
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
