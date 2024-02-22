package com.spring.lyf;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	
	private String subject;

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Intit In Annotation");
	}
	@PreDestroy
	public void end()
	{
		System.out.println(" Destroy Method Of Annotation ");
	}

}
