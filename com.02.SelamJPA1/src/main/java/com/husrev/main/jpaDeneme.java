package com.husrev.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.SelamJPA.model.Personel;
import com.husrev.main.jpaDeneme;

public class jpaDeneme {

	public static void main(String[] args) {
		EntityManagerFactory emf;
		EntityManager em;
		
		Personel personel = new Personel();
		//personel.setPersonelId(5);
		personel.setPersonelAdi("elif");
		personel.setPersonelSoyadi("Asici");
		//---------------------------------------------

		emf = Persistence.createEntityManagerFactory("com.02.SelamJPA1"); //persistence-unit adi
		em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
			em.persist(personel);
		et.commit();
		
		
		System.out.println("\nID : " + personel.getPersonelId() +
				"\nADI : " + personel.getPersonelAdi() +
				"\nSOYADI : " + personel.getPersonelSoyadi() 
				);
		
		em.close();
		emf.close();
		
	}

}
