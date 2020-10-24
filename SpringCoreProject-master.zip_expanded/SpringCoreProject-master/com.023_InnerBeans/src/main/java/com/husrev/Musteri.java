package com.husrev;

public class Musteri {

	private Siparis siparis;

	public Musteri() {
		System.out.println("Musteri sinifinin constructor metodu.");
	}

	public Siparis getSiparis() {
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		System.out.println("setSiparis metodu");
		this.siparis = siparis;
	}

	public void hesabiOde() {
		System.out.println("Musteri sinifin hesabiOde metodu.");
		siparis.toplamSonucAl();

	}
}
