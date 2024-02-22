package com.spring.autowire.prac;

public class Product {

	private String pname;

	public Product() {
		super();
		System.out.println("Constructor of Product");
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + "]";
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

}
