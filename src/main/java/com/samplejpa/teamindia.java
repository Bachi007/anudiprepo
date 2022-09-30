package com.samplejpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class teamindia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int plId;
	private String firstName;
	private String lastName;
	public int getPlId() {
		return plId;
	}
	public void setPlId(int plId) {
		this.plId = plId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
