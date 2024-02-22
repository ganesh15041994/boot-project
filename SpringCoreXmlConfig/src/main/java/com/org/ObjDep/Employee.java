package com.org.ObjDep;

public class Employee {
	private Address add;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [add=" + add + ", name=" + name + "]";
	}

	

}
