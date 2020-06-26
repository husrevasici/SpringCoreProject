package com.husrev.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ogrenci database table.
 * 
 */
@Entity
@Table(name="ogrenci")
@NamedQuery(name = "Ogrenci.findAll", query = "SELECT o FROM Ogrenci o")
public class Ogrenci implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "adi")
	private String adi;

	@Column(name = "bolum")
	private String bolum;

	@Column(name = "fakulte")
	private String fakulte;

	@Column(name = "no")
	private String no;

	@Column(name = "soyadi")
	private String soyadi;

	public Ogrenci() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return this.adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getBolum() {
		return this.bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getFakulte() {
		return this.fakulte;
	}

	public void setFakulte(String fakulte) {
		this.fakulte = fakulte;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getSoyadi() {
		return this.soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}