package com.husrev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kaynakBean")
public class Kaynak {

	private Map<String, String> map;
	private List<String> list;

	@Value("mimaraslan@gmail.com")
	private String ePosta;

	public Kaynak() {

		map = new HashMap<String, String>();
		map.put("Mücahit Sidimi", "msidimi@facebook.com");
		map.put("Adnan Aydemir", "adnan.aydemir.37@facebook.com");
		map.put("Natiq Vahabov", "natiq.vahabov@facebook.com");
		map.put("Kocabiyik Enbiya", "1461oflu@facebook.com");
		map.put("Utku Kutlu", "utku.kutlu.104@facebook.com");

		list = new ArrayList<String>();
		list.add("Mücahit Sidimi");
		list.add("Adnan Aydemir");
		list.add("Natiq Vahabov");
		list.add("Kocabiyik Enbiya");
		list.add("Utku Kutlu");
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

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}
}
