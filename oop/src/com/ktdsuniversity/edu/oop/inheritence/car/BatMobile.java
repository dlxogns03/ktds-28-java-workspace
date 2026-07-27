package com.ktdsuniversity.edu.oop.inheritence.car;

public class BatMobile extends SportsCar{
	
	public BatMobile(String name) {
		super(name);
	}
	
	
	public void batPod() {
		System.out.println("배트포트 분리");
	}
}
