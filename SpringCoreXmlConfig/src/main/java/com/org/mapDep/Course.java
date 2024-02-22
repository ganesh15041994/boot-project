package com.org.mapDep;

import java.util.Map;

public class Course {
	private Map<Integer,String> name;

	public Map<Integer, String> getName() {
		return name;
	}

	public void setName(Map<Integer, String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	

}
