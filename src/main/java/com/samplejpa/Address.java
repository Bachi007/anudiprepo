package com.samplejpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Address {
	@Id
	private int adId;
	private String adCity;
	private int adPincode;
	
	public int getAdId() {
		return adId;
	}
	public void setAdId(int adId) {
		this.adId = adId;
	}
	public String getAdCity() {
		return adCity;
	}
	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}
	public int getAdPincode() {
		return adPincode;
	}
	public void setAdPincode(int adPincode) {
		this.adPincode = adPincode;
	}
	
}
