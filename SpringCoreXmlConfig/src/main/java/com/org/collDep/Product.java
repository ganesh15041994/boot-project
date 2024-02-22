package com.org.collDep;

import java.util.List;

public class Product {

	private List <String> prod;

	public List<String> getProd() {
		return prod;
	}

	public void setProd(List<String> prod) {
		this.prod = prod;
	}

	@Override
	public String toString() {
		return "Product [prod=" + prod + "]";
	}
	
}
