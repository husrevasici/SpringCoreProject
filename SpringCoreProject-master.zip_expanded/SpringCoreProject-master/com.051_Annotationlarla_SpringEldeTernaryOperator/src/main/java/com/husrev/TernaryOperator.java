package com.husrev;

import org.springframework.beans.factory.annotation.Value;

public class TernaryOperator {

	@Value("#{sayilarBean.sayi1 lt sayilarBean.sayi4 ? true : false}")
	private boolean kontrol;

	public boolean isKontrol() {
		return kontrol;
	}

	public void setKontrol(boolean kontrol) {
		this.kontrol = kontrol;
	}

	@Override
	public String toString() {
		return "TernaryOperator kontrol sunucu: " + kontrol;
	}

}
