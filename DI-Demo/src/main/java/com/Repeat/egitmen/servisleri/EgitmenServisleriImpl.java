package com.Repeat.egitmen.servisleri;

public class EgitmenServisleriImpl implements EgitmenServisleri {

	private int egitmenUcreti;
	@Override
	public int egitmenUcretiBelirle(int tecrube, int haftalikDersSaati, int projeSayisi) {
		// TODO Auto-generated method stub
		egitmenUcreti = (tecrube + haftalikDersSaati + projeSayisi) * 1000;
		return egitmenUcreti;
	
	}

}
