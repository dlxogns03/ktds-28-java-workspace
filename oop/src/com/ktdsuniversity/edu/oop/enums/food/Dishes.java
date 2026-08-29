package com.ktdsuniversity.edu.oop.enums.food;

public class Dishes {
	public static void main(String[] args) {
		Food hamberger = new Food("빅맥", 900, FoodType.FASTFOOD);
		Food banana = new Food("바나나", 800, FoodType.FUT);
		System.out.println(hamberger);
		System.out.println(banana);
		
		// 지역변수, 클래스, 인터페이스의 상수는 의미가 오염될 수 있음 
		//enum의 상수를 만들면 의미가 오염이 되지않음 
		
		
	}
}
