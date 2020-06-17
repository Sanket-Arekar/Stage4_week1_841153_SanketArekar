package com.cognizant.truyum.model;

import java.util.List;




public class Cart {
	private int id;
	private int us_id;
	private int c_id;

	
	public Cart(int id, int us_id, int c_id) {
		super();
		this.id = id;
		this.us_id = us_id;
		this.c_id = c_id;
	}

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int us_id, int c_id) {
		super();
		this.us_id = us_id;
		this.c_id = c_id;
	}

	@Override
	public String toString() {
		return "Cart [c_id=" + c_id + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUs_id() {
		return us_id;
	}

	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}	
}