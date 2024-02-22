package com.spring.lyf;

public class Prod {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Price");
		this.name = name;
	}

	public Prod() {
		super();
		System.out.println("Hi Am COnstructor");

	}

	@Override
	public String toString() {
		return "Prod [name=" + name + "]";
	}

	public void init() {
		System.out.println("Inside Init Method");
	}

	// registring shoutdown hook
	public void destroy() {
		System.out.println("Inside Delete");
	}
}
