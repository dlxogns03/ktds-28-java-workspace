package com.ktdsuniversity.edu.fp.stream;

import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

/**
 * 리스트 인스턴스를 스트림 인스턴스로 변환해
 * 필요한 데이터만 추출해내는 실습
 */
public class Filtering {
	
	public static void printLowCaloryFishDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
			  .filter((dish) -> dish.getDishType() == DishType.FISH)
			  .filter((dish) -> dish.getCalories() <= 400)
			  .forEach(System.out::println)
			  ;
	}
	
	public static void printFishDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
			  .filter((dish)->dish.getDishType() == DishType.FISH)
			  .forEach(System.out::println)
			  ;
	}
	
	public static void printHighCaloryDishes() {
		
		//칼로리 800 이상 고칼로리
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
		  .filter((dish) -> dish.getCalories() >= 800)
		  .forEach(System.out::println)
		  ;
		
	}
	
	public static void printLowCaloryDishes() {
		//저칼로리 기준 : Dish의 칼로리가 400이하
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
			  .filter((dish) -> dish.getCalories() <= 400)
			  .forEach(System.out::println)
			  ;
	}
	
	public static void printMeatDishes() {
		List<Dish> dishes = DishList.makeDishList();
		dishes.stream()
			  .filter((dish) -> dish.getFoodType() == FoodType.MEAT)
			  .forEach(System.out::println)
			  ;
		
	}
	
	
	public static void printVegetableDishes() {
		List<Dish> dishes = DishList.makeDishList();
		
		
		
		//중간 연산은 반환타입이 stream이고 최종연산은 반환타입이 stream이다. 중간연산은 복수개를 쓸수 있지만 최종연산은 
		// 반드시 한개만 존재할 수 있다
		// 스트림은 최종연산이 나오면 중간연산의 반복을 시작한다.
		
		dishes.stream()//return Stream<Dish> 
//			  .peek((dish)-> {
//				  System.out.println("필터링 수행전");
//				  System.out.println(dish);
//			  })// stream<Dish>
			  .filter((dish) -> dish.getFoodType()== FoodType.VEGETABLES)//return Stream<Dish>
//			  .peek((dish) -> {
//				  System.out.println("필터링 수행 후");
//				  System.out.println(dish);
//			  })//stream<Dish>
			  .forEach(System.out::println); //void
//			  .forEach((dish) -> System.out.println(dish)); //void
		;
	}
	
	public static void main(String[] args) {
		printVegetableDishes();
		System.out.println("=".repeat(10));
		printMeatDishes();
		System.out.println("=".repeat(10));
		printLowCaloryDishes();
		System.out.println("=".repeat(10));
		printFishDishes();
		System.out.println("=".repeat(10));
		printLowCaloryFishDishes();
	}

}
