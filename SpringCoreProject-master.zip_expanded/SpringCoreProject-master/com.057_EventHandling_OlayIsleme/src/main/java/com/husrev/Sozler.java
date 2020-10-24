package com.husrev;

public class Sozler {

	private String cumle;

	public void EkranaYaz() {
		System.out.println("----------------------------");
		System.out.println(getCumle());
		System.out.println("----------------------------");
	}

	public String getCumle() {
		return cumle;
	}

	public void setCumle(String cumle) {
		this.cumle = cumle;
	}

}
