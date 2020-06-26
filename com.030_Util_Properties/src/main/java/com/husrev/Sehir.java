package com.husrev;

import java.util.Properties;

public class Sehir {

	Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "SONUC: " + properties;
	}

	public void sonucuYaz() {
		System.out.println(properties.toString());
	}

}
