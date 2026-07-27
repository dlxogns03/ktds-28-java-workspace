package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Fish extends Animal{
	
	private String fin;
	private String scales;
	private boolean gill;
	
	public Fish(String name, int age, String sex, float weight, float tall, 
					String type, String foodHabit,String habitat, String fin,
					String scales, boolean gill) {
		super(name, age,sex,weight,tall,type,foodHabit, habitat);
		this.fin = fin;
		this.scales = scales;
		this.gill = gill;
		
	}
	
	public void fishPrintDisplay() {
		System.out.println(this.fin);
		System.out.println(this.scales);
		System.out.println(this.gill);
	}
}
