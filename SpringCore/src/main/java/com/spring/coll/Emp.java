package com.spring.coll;

import java.util.*;

public class Emp {
	
	
	private String name;
	private List <String> phones;
	private Set <String> adds;
	private Map <String ,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAdds() {
		return adds;
	}
	public void setAdds(Set<String> adds) {
		this.adds = adds;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> adds, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.adds = adds;
		this.courses = courses;
	}
	

}
