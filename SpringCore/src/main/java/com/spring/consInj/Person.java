package com.spring.consInj;

import java.util.List;

public class Person {

	private String name;
	private int id;
	private Certi certi;
	private List<String> list;
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", certi=" + certi + ", list=" + list + "]"+	"{"+this.certi.name+"}";
	}
	public Person(String name, int id,Certi certi,List<String> list) {

		this.name = name;
		this.id = id;
		this.certi=certi;
		this.list=list;
	}

	
	
	
}
