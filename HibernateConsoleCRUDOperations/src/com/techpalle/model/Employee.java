package com.techpalle.model;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int eno;
	private String ename;
	private int esal;
	private String edesignation;
	public Employee(int eno, String ename, int esal, String edesignation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.edesignation = edesignation;
	}
	public Employee() {
		super();
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	

}
