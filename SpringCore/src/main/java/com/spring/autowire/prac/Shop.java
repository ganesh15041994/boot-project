package com.spring.autowire.prac;

public class Shop {

	private Product prod;
	private int price;
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shop [prod=" + prod + ", price=" + price + "]";
	}
	public Shop() {
		super();
		System.out.println("Shop Cons");
	}
	
	
	
}
