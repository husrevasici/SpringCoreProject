package com.husrev;

public class Siparis {

	int tutar;

	public Siparis() {
		System.out.println("Siparis sinifinin constructor. ");
	}

	public void toplamSonucAl() {
		System.out.println("siparis sinifinin toplamSonucAl metodu.");
		System.out.println("toplam: " + tutar);
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		System.out.println("setTutar metodu");
		this.tutar = tutar;
	}

}
