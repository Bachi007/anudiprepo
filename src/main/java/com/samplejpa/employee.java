package com.samplejpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class employee {

	@Id
	private int empId;
	private fullname empfullname;
	private String empRole;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public fullname getEmpfullname() {
		return empfullname;
	}
	public void setEmpfullname(fullname empfullname) {
		this.empfullname = empfullname;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empfullname=" + empfullname + ", empRole=" + empRole + "]";
	}
	
	
}
