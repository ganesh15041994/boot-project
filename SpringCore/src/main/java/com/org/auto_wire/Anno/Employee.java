package com.org.auto_wire.Anno;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	//@Autowired 
	// we can use here 
	private Address add;
	private String name;
	public Employee() {
		System.out.println("Object created of Employee ");
		
	}
	
	// or we can use on Constructor also 
	@Autowired
	public Employee(Address add) {
		super();
		System.out.println("Inside Constructor");
		this.add = add;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [add=" + add + ", name=" + name + "]";
	}
	public Address getAdd() {
		return add;
	}
	//@Autowired
	// or we can use on setter method also
	public void setAdd(Address add) {
		this.add = add;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
