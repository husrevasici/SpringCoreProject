package com.husrev;

import java.util.*;

public class Collection {
// https://stackoverflow.com/questions/13033448/creating-property-to-a-ref-bean-spring

	private List<?> list;
	private Set<?> set;
	private Map<?, ?> map;
	private Properties prob;
	private Ogrenci ogrenci;

	public void goster() {

		for (Iterator<String> i = (Iterator<String>) list.iterator(); i.hasNext();) {
			String item = i.next();
			System.out.println(item);
		}
	}

	public List<?> getList() {
		return list;

	}

	public void setList(List<?> list) {
		System.out.println("setList met.");
		this.list = list;
	}

	public Set<?> getSet() {
		return set;
	}

	public void setSet(Set<?> set) {
		System.out.println("setSet met.");
		this.set = set;
	}

	public Map<?, ?> getMap() {
		return map;
	}

	public void setMap(Map<?, ?> map) {
		System.out.println("setMap met.");
		this.map = map;
	}

	public Properties getProb() {
		return prob;
	}

	public void setProb(Properties prob) {
		System.out.println("setProb met.");
		this.prob = prob;
	}

	@Override
	public String toString() {
		return " \nList = " + getList() + "\nSet  = " + getSet() + "\nMap  = " + getMap() + "\nProb = " + getProb();
	}

}
