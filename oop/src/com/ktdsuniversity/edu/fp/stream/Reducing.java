package com.ktdsuniversity.edu.fp.stream;

import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class Reducing {
	
	
	
	public static void printLongestNameDish() {
		//이름이 가장긴 디쉬를 출력한다
		List<Dish> dishes = DishList.makeDishList();
		Dish num = dishes.stream()
						 .reduce(dishes.get(0),(longestDish, eachDish) ->{
							 int longestDishNameLength = longestDish.getName().length();
							 int eachDishNameLength = eachDish.getName().length();
							 if(longestDishNameLength > eachDishNameLength) {
								 return longestDish;
							 }else {
								 return eachDish;
							 }
						 })
						 ;
		System.out.println(num);
	}
	
	public static void printMinCaloryOtherDishes() {
		//OTHERDISH중에 가장 낮은 칼로리를 출력
		List<Dish> dishes = DishList.makeDishList();
		int cal = dishes.stream()
						.filter(dish -> dish.getDishType() == DishType.OTHER)
						.map(dish -> dish.getCalories())
						.reduce(Integer.MAX_VALUE, Math::min)
						;
		System.out.println(cal);
	}
	
	public static void printMaxCalory() {
		//가장 높은 칼로리의 음식을 출력한다
		List<Dish> dishes = DishList.makeDishList();
		int dish =  dishes.stream()
						  .map(cal -> cal.getCalories())
			  			  .reduce(Integer.MIN_VALUE,Math::max)
			  			  ;
		
		System.out.println(dish);
		
	}
	
	public static void printMaxNumberWithReferencfe() {
		
		List<Integer>numbers = List.of(1234,12,43,52,56,5678
				   ,87846,4,-345,-123,-2345,-11);
		
		
		int max = numbers.stream()
						 .reduce(Integer.MAX_VALUE, Math::min)
						 ;
		System.out.println(max);
	}
	
	public static void printMaxNumber() {
		List<Integer>numbers = List.of(1234,12,43,52,56,5678
				   ,87846,4,-345,-123,-2345,-11);
		
		
		int max = numbers.stream()
						 .reduce(Integer.MIN_VALUE,(maxNum, eachNumber) -> {
							 if(maxNum < eachNumber) {
								 return eachNumber;
							 }else {
								 return maxNum;
							 }
						 })
						 ;
		System.out.println(max);
	}
	
	public static void printsumNumbers() {
		List<Integer>numbers = List.of(1234,1234,1435,13452,56347,5786,785678,5678
									   ,87846,784679,4678,4);
		
		int sum = numbers.stream()
						 .reduce(0, (total, eachNumber) -> total + eachNumber)
						 ;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printsumNumbers();
		printMaxNumber();
		printMaxNumberWithReferencfe();
		
		System.out.println("=".repeat(5));
		printMaxCalory();
		System.out.println("=".repeat(5));
		printMinCaloryOtherDishes();
		System.out.println("=".repeat(5));
		printLongestNameDish();
		
	}

}
