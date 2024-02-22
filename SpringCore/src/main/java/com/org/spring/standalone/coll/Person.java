package com.org.spring.standalone.coll;
import java.util.*;
public class Person {
	
	private List<String> friends;
	private Map<String,Integer> fees;
	private Properties properies;
	public Properties getProperies() {
		return properies;
	}
	public void setProperies(Properties properies) {
		this.properies = properies;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + ", properies=" + properies + "]";
	}


	
	
	
}
