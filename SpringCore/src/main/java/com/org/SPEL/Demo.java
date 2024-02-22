package com.org.SPEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Demo {
	@Value("#{11+22}")
	private int x;
	@Value("#{22+09}")
	private int y;
	@Value("#{ T (java.lang.Math).PI}")
	private double e;
	@Value("#{new java.lang.String('Ganesh Rathod')}")
	private String name;
	
	@Value("#{8>3}")
	private boolean isActive;

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	// calling static method using spel language
	@Value("#{T (java.lang.Math).sqrt(25)}")
	private double z;

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", name=" + name + ", isActive=" + isActive + ", z=" + z
				+ "]";
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
