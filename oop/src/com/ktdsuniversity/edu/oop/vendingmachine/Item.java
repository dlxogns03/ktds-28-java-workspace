package com.ktdsuniversity.edu.oop.vendingmachine;

public class Item {
	
	
	String itemId;
	
	
	String itemName;
	
	
	int itemPrice;
	
	
	int itemStock;
	
	public Item(String itemId, String itemName, int itemPrice, int itemStock) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void getName() {
		System.out.println(this.itemName);
	}

}
