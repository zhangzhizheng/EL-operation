package com.my.domain;

public class Fruits {
	private String fname;
	private float fprice;
	public Fruits(String fname, float fprice) {
		this.fname = fname;
		this.fprice = fprice;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public float getFprice() {
		return fprice;
	}
	public void setFprice(float fprice) {
		this.fprice = fprice;
	}
	@Override
	public String toString() {
		return "Fruits [fname=" + fname + ", fprice=" + fprice + "]";
	}
	public Fruits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
