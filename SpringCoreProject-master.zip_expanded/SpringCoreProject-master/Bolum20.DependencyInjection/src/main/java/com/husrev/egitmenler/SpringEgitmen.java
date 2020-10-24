package com.husrev.egitmenler;

import com.husrev.egitmen.servisleri.EgitmenServisleri;

public class SpringEgitmen implements Egitmen {
	
	EgitmenServisleri servis;
	
	public SpringEgitmen() {
		System.out.println("Constructor no arg ==== Spring Egitmeni");
	}

	public SpringEgitmen(EgitmenServisleri servis) {
		this.servis = servis;
		// bu constructor'u yazmamız yeterli değil, beans.xml 
		// içerisinden bu constructor ref olarak vermessek burdaki servis objesi
		// initialize olmaz. 
		// Eger constructor ref olarak vermessek sadece bean olarak bu class'ı 
		// oluşturursak yukardaki, default constructor'a girer.
	}

	@Override
	public String egitimPlaniVer() {
		return "Spring ile olusturulmus projeleri incele";
	}

	@Override
	public int egitmenUcretiBelirle() {
		return servis.egitmenUcretiBelirle(10, 200, 1651);
	}

}
