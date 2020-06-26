package com.husrev.Spring_Demo;

public class BizimMarket {

	private String marketAdi;
	private int gunlukSatis;

	public BizimMarket(String marketAdi, int gunlukSatis) {
		this.marketAdi = marketAdi;
		this.gunlukSatis = gunlukSatis;
	}

	public BizimMarket() {

	}

	public void bizimReklam() {
		String reklamSlogani = " Ne isterseniz Bizim Markette bulabilirsiniz.";
		System.out.println(reklamSlogani);
	}

	@Override
	public String toString() {
		return "BizimMarket [marketAdi=" + marketAdi + ", gunlukSatis=" + gunlukSatis + "]";
	}

}
