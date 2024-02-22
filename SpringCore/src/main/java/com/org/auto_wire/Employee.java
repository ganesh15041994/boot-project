package com.org.auto_wire;

public class Employee {

	private Address add;
	private String name;
	public Employee() {
		System.out.println("Object created of Employee ");
		
	}
	public Employee(Address add, String name) {
		super();
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
