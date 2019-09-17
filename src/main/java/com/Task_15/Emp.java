package com.Task_15;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	@Id
	private int empId;
	private String empName;
	private int empSalary;
	@OneToOne(fetch = FetchType.LAZY)
	private Laptop laptop;
	@OneToOne(fetch = FetchType.LAZY)
	private Vehicle vehicle;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public Emp(int empId, String empName, int empSalary, Laptop laptop, Vehicle vehicle) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.laptop = laptop;
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", laptop=" + laptop
				+ ", vehicle=" + vehicle + "]";
	}

}
