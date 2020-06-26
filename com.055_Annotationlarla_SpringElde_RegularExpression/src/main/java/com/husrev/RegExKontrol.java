package com.husrev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("regExKontrolBean")
public class RegExKontrol {

	@Value("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)" + "*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String regEx;

	@Value("#{(listelerBean.mapElemani matches regExKontrolBean.regEx) == true ? 'UYGUN.' : 'UYGUN DEGİL' }")
	private String regExSonuc;

	@Value("#{listelerBean.mapElemani}")
	private String listelerBean_mapElemani;

	@Value("#{listelerBean.listElemani}")
	private String listelerBean_listElemani;

	public String getRegEx() {
		return regEx;
	}

	public void setRegEx(String regEx) {
		this.regEx = regEx;
	}

	public String getRegExSonuc() {
		return regExSonuc;
	}

	public void setRegExSonuc(String regExSonuc) {
		this.regExSonuc = regExSonuc;
	}

	@Override
	public String toString() {
		System.out.println("listelerBean_mapElemani: " + listelerBean_mapElemani);
		System.out.println("listelerBean_listElemani: " + listelerBean_listElemani);
		return "\nGirdiginiz eposta adresi " + regExSonuc;
	}
}
