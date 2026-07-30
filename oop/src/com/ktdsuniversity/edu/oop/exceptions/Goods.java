package com.ktdsuniversity.edu.oop.exceptions;

public class Goods {
	private String name;
	private int price;
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Goods gd) {
			return this.name.equals(gd.name) && 
					this.price == gd.price;
		}
		return false;
	}
}
