package com.husrev;

public class Listeler {

	private String mapElemani;
	private String listElemani;

	public String getMapElemani() {
		return mapElemani;
	}

	public void setMapElemani(String mapElemani) {
		this.mapElemani = mapElemani;
	}

	public String getListElemani() {
		return listElemani;
	}

	public void setListElemani(String listElemani) {
		this.listElemani = listElemani;
	}

	@Override
	public String toString() {
		return "SECILEN MAP ELEMAN = "+mapElemani+
				"\nSECİLEN LIST ELEMAN = "+listElemani;
	}
}
