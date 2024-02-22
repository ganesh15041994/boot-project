package org.SpringAnnotationCOnfig;

//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.stereotype.Component;

//@Component("ob")

public class Student {
	
	private Address add;
	public Student(Address add) {
		super();
		this.add = add;
	}
	public void show()
	{
		this.add.Hi();
		System.out.println("hi");
	}

}
