package org.spri.SpringCore;

public class Student {
	private int id ;
	private String name ;
	public Student(int id, String name, String add) {
		
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	public int getId() {
		return id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(int id) {
		this.id = id;
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
	private String add;

}
