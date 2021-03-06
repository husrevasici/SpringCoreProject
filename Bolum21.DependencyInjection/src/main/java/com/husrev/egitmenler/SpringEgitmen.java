package com.husrev.egitmenler;

import com.husrev.egitmen.servisleri.EgitmenServisleri;

public class SpringEgitmen implements Egitmen {
	
	private EgitmenServisleri servis;
	
	
	@Override
	public String egitimPlaniVer() {
		System.out.println("============================");
		return "Spring ile olusturulmus projeleri incele";
	}

	@Override
	public int egitmenUcretiBelirle() {
		System.out.println("============================");
		return servis.egitmenUcretiBelirle(10, 200, 1651);
	}


	public void setServis(EgitmenServisleri servis) {
		System.out.println("============================");
		System.out.println("setServis metodu");
		this.servis = servis;
	}
}
