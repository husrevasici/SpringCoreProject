package com.husre;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfig {

	@Bean
	public Sehir seatSehir() {
		Sehir sehir = new Sehir();
		sehir.setSehirAdi("Malatya");
		sehir.setPlakaNo(44);
		return sehir;
	}

//	<bean id="sehir" class="com.husrev.Sehir">
//		<property name="sehirAdi" value="Malatya">
//		<property name="plakaNo" value="44">
//	</bean>

	@Bean
	public Ogrenci getaStudent() {
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setSehir(seatSehir());
		return ogrenci;
	}

//	<bean id="ogrenci" class="com.husrev.Ogrenci">
//		<property name="sehir" ref="sehir">
//	</bean>
}
