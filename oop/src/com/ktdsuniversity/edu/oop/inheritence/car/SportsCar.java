package com.ktdsuniversity.edu.oop.inheritence.car;

public class SportsCar extends Vehicle{
	
	public SportsCar (String name) {
		super(name);
		
	}
	
	public void turboOn() {
		System.out.println(super.getName() + "터보 모드 실행");
	}
}
