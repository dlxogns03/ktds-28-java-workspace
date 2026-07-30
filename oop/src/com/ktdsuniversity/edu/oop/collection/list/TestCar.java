package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.inheritence.car.BatMobile;
import com.ktdsuniversity.edu.oop.inheritence.car.EV;
import com.ktdsuniversity.edu.oop.inheritence.car.SportsCar;
import com.ktdsuniversity.edu.oop.inheritence.car.Vehicle;

public class TestCar {
	
	
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
		
		List<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(new Vehicle("aa"));
		vehicles.add(new SportsCar("fe"));
		vehicles.add(new EV("fa", 81));
		vehicles.add(new BatMobile("ccc"));
		
		System.out.println(vehicles.get(0).getName());
		for(int i = 0; i < vehicles.size() ; i++) {
			checkBattery(vehicles.get(i));
			startTurboEngine(vehicles.get(i));
			ejectPod(vehicles.get(i));
		}
	}

}
