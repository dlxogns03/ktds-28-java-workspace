package com.ktdsuniversity.edu.oop.inheritence.car;

public class Main {
	
	
	public static void checkBattery(Vehicle car) {
		if(car instanceof EV ev) {
			ev.getBattery();
			
		}
	}
	
	
	
	
	public static void startTurboEngine(Vehicle car) {
		if(car instanceof SportsCar sportsCar) {
			sportsCar.turboOn();
		}
	}
	
	
	public static void ejectPod(Vehicle car) {
		
		if(car instanceof BatMobile batMobile) {
			batMobile.batPod();
		}
			
	}
	
	
	
	public static void main(String[] args) {
//		Vehicle bat = new BatMobile("11");
//		System.out.println(bat.getName());
//		bat.startEngine();
//		ejectPod(bat);
//		startTurboEngine(bat);
//		System.out.println("======");
//		
//		Vehicle ev = new EV("cona", 60);
//		System.out.println(ev.getName());
//		ev.startEngine();
//		
//		checkBattery(ev);
//		System.out.println("====");
//		
//		Vehicle spCar = new SportsCar("ferarri");
//		System.out.println(spCar.getName());
//		spCar.startEngine();
//		startTurboEngine(spCar);
//		spCar.getName();
//		
//		
		Vehicle[] vehicles = new Vehicle[5];
		vehicles [0] = new Vehicle("클래식카");
		vehicles[1] = new SportsCar("스포츠카1");
		vehicles[2] = new EV("전기차2", 60);
		vehicles[3] = new BatMobile("배트카1");
		
		for(int i = 0; i < vehicles.length ; i++) {
			checkBattery(vehicles[i]);
			startTurboEngine(vehicles[i]);
			ejectPod(vehicles[i]);
		}
	}

}
