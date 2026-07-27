package com.ktdsuniversity.edu.oop.inheritence.car;

public class EV extends Vehicle{
	private int battery;
	
	
	public EV(String name, int battery) {
		super(name);
		this.battery = battery;
	}
	
	
	public int getBattery() {
		System.out.println(this.battery);
		return this.battery;
	}
}
