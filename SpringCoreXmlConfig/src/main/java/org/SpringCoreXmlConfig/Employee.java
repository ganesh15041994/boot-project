package org.SpringCoreXmlConfig;

public class Employee {
	private String name;
	private String add;
	private String city;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", add=" + add + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
