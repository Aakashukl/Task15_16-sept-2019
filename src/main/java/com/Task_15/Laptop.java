package com.Task_15;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private String laptopId;
	private String laptopName;
	private int laptopPrice;

	@OneToOne(mappedBy="laptop")
	private Emp emp;

	public String getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(String laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public int getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(int laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public Laptop(String laptopId, String laptopName, int laptopPrice) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
	}

	public Laptop(String laptopId) {
		super();
		this.laptopId = laptopId;
	}

	public Laptop() {
		super();
	}

}
