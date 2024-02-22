package com.spring.lyf;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Coder implements InitializingBean, DisposableBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Coder() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Coder [name=" + name + "]";
	}

	// init method
	public void afterPropertiesSet() throws Exception {

		System.out.println("In Coder  Intit Method");
	}

	public void destroy() throws Exception {
		System.out.println("Destoying  Coder Bean");

	}
}
