package com.samplejpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class emp {
	@Id
	private int eid;
	private String ename;
	private String edomain;
	@ManyToOne
	
	private Address address;

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdomain() {
		return edomain;
	}
	public void setEdomain(String edomain) {
		this.edomain = edomain;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "emp [eid=" + eid + ", ename=" + ename + ", edomain=" + edomain + "]";
	}
	
	
}
