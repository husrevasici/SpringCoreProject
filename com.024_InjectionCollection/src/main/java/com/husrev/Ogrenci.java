package com.husrev;

import java.util.*;

public class Ogrenci {

	List<?> ogrenciList;
	Set<?> ogrenciSet;
	Map<?, ?> ogrenciMap;
	Properties ogrenciPro;

	public Ogrenci() {
		System.out.println("ogrenci Class'ı constructor");
	}

	public List<?> getOgrenciList() {
		return ogrenciList;
	}

	public void setOgrenciList(List<?> ogrenciList) {
		this.ogrenciList = ogrenciList;
	}

	public Set<?> getOgrenciSet() {
		return ogrenciSet;
	}

	public void setOgrenciSet(Set<?> ogrenciSet) {
		this.ogrenciSet = ogrenciSet;
	}

	public Map<?, ?> getOgrenciMap() {
		return ogrenciMap;
	}

	public void setOgrenciMap(Map<?, ?> ogrenciMap) {
		this.ogrenciMap = ogrenciMap;
	}

	public Properties getOgrenciPro() {
		return ogrenciPro;
	}

	public void setOgrenciPro(Properties ogrenciPro) {
		this.ogrenciPro = ogrenciPro;
	}
}
