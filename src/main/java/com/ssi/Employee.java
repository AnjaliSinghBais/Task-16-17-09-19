package com.ssi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Employee {
	@Id
	private int Empno;
	private String Empname;
	private int sal;
	@OneToOne // (fetch=FetchType.LAZY)
	private Laptop laptop;
	@OneToMany
	private List<Vehicle> veh = new ArrayList<Vehicle>();
	@ManyToMany
	private List<Project> pro = new ArrayList<Project>();

	public List<Project> getPro() {
		return pro;
	}

	public void setPro(List<Project> pro) {
		this.pro = pro;
	}

	public Employee(int empno, String empname, int sal, Laptop laptop, List<Vehicle> veh) {
		super();
		Empno = empno;
		Empname = empname;
		this.sal = sal;
		this.laptop = laptop;
		this.veh = veh;
	}

	public Employee() {
		super();
	}

	public Employee(int empno) {
		super();
		Empno = empno;
	}

	public Employee(int empno, String empname, int sal, Laptop laptop) {
		super();
		Empno = empno;
		Empname = empname;
		this.sal = sal;
		this.laptop = laptop;
	}

	public int getEmpno() {
		return Empno;
	}

	public void setEmpno(int empno) {
		Empno = empno;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

}
