package com.husrev.egitmenler;

import com.husrev.egitmen.servisleri.EgitmenServisleri;

public class JavaEgitmen implements Egitmen {

	EgitmenServisleri servis; // burası dependency'im oldu.
	// cunku burdaki nesne asagidaki fonksiyonun hesaplanmasi icin
	// bu nesneye bagimli oldu
	private String egitmenAdi;
	private String egitmenYasi;

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

	public String getEgitmenAdi() {
		System.out.println("============================");
		System.out.println("JavaEgitmen -> getEgitmenAdi metodu");
		return egitmenAdi;
	}

	public void setEgitmenAdi(String egitmenAdi) {
		System.out.println("============================");
		System.out.println("JavaEgitmen -> setEgitmenAdi metodu");
		String x=egitmenAdi;
		System.out.println("beans'tan gelen nesnenin adi: "+x);
		this.egitmenAdi = egitmenAdi;
	}

	public String getEgitmenYasi() {
		System.out.println("============================");
		System.out.println("JavaEgitmen -> getEgitmenYasi metodu");
	
		return egitmenYasi;
	}

	public void setEgitmenYasi(String egitmenYasi) {
		System.out.println("============================");
		System.out.println("JavaEgitmen -> setEgitmenYasi metodu");
		System.out.println("beans'tan gelen nesnenin adi: "+ egitmenYasi);
		this.egitmenYasi = egitmenYasi;
	}


}
