package com.husrev.egitmenler;

import com.husrev.egitmen.servisleri.EgitmenServisleri;

public class JavaEgitmen implements Egitmen {

	EgitmenServisleri servis; // burası dependency'im oldu.
	// cunku burdaki nesne asagidaki fonksiyonun hesaplanmasi icin
	// bu nesneye bagimli oldu


	public JavaEgitmen() {
		System.out.println("============================");
		System.out.println("JavaEgitmen class = no arg Const");
	}

	public void setServis(EgitmenServisleri servis) {
		System.out.println("============================");
		System.out.println("JavaEgitmen -> Set servis metodu");
		this.servis = servis;
	}
	
	@Override
	public String egitimPlaniVer() {
		System.out.println("============================");
		return "Her gun 2 saat Java kodlama uzerine calis";
	}

	@Override
	public int egitmenUcretiBelirle() {
		return servis.egitmenUcretiBelirle(3, 3, 2);
	}


}
