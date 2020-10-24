package com.husrev.egitmen.servisleri;

public class EgitmenServisleriImpl implements EgitmenServisleri {

	private int egitmenUcreti;

	@Override
	public int egitmenUcretiBelirle(int tecrube, int haftalikDersSaati, int projeSayisi) {
		egitmenUcreti = (tecrube + haftalikDersSaati + projeSayisi) * 1000;
		return egitmenUcreti;
	}

}
