package com.husrev;

import java.util.*;

import org.springframework.stereotype.Component;

@Component("kaynakBean")
public class Kaynak {

	private Map<String, String> map;
	private List<String> list;

	public Kaynak() {
		map = new HashMap<String, String>();
		map.put("Hibernate", "Gokce Yurdakul");
		map.put("Spring", "Sema Cakmakci");
		map.put("PrimeFaces", "Aysegul Bilgi");

		list = new ArrayList<String>();
		list.add("Husrev Asici");
		list.add("Suleyman Cicek");
		list.add("Goktug Bacanli");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
}
