package com.husrev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// @Component("javaEgitmeni") 

@Component
 // javaEgitmen class icin olusturulan beans'dir.
 // @Component icerisine verilen bean ismini kendimiz yazmamıza gerek yok
 // Spring Framework burada kendi isim vererek te burdan bir bean turetebilir.
 // Buradaki class ismini kucuk harf yaparak kendi otomatik bir bean olusuturur kisacasi

public class JavaEgitmeni implements Egitmen {
	
	EgitmenServisleri servis;
	
//	public JavaEgitmeni(EgitmenServisleri servis) {
//		
//		this.servis = servis;
//	} 
	
	@Autowired
	public void setServis(EgitmenServisleri servis) {
		this.servis = servis;
	}

	
	@Override
	public int ucretVer() {
		return servis.ucretTeklifiVer();
	}
	
	@Override
	public void egitimPlaniVer() {
		
		System.out.println("Ben Java egitim planlari vermekteyim.");
	}

}
