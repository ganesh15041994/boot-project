package org.spring.model;

public class Employee {
private String name;
private String email;
private String pass;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmial() {
	return email;
}
public void setEmial(String emial) {
	this.email = emial;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", email=" + email + ", pass=" + pass + "]";
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
