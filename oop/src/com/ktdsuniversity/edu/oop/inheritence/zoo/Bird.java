package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Bird extends Animal{
	
	private String wings;
	private String beak;
	private String plumage;
	
	
	public Bird(String name, int age, String sex, float weight, float tall, 
					String type, String foodHabit,String habitat, String wings,
					String beak, String plumage) {
		super(name, age,sex,weight,tall,type,foodHabit, habitat);
		
		this.wings = wings;
		this.beak = beak;
		this.plumage = plumage;
		
	}
	
	
	public void birdPrintDisplay() {
		System.out.println(this.wings);
		System.out.println(this.beak);
		System.out.println(this.plumage);
	}
	
}
