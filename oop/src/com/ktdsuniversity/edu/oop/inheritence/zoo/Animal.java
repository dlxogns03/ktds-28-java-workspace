package com.ktdsuniversity.edu.oop.inheritence.zoo;

public class Animal {
	
	private String name;
	private int age;
	private String sex;
	private float weight;
	private float tall;
	
	private String foodHabit;
	
	private String type;
	private String habitat;
	
	
	public Animal(String name, int age, String sex, float weight, float tall, 
					String type, String foodHabit,String habitat) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		this.tall = tall;
		this.type = type;
		this.foodHabit = foodHabit;
		this.habitat = habitat;
	}
	
	
	public void AnimalprintDisplay() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.sex);
		System.out.println(this.weight);
		System.out.println(this.tall);
		System.out.println(this.foodHabit);
		System.out.println(this.type);
		System.out.println(this.habitat);
		
	}
}
