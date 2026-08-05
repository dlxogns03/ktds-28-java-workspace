package com.ktdsuniversity.edu.fp.anonymous;

import com.ktdsuniversity.edu.fp.anonymous.inf.Compare;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class Main {
	
	public static void main(String[] args) {
		DishSummay summary =new DishSummay();
		
		Compare<DishType> dishCompare = new Compare<>() {
			@Override
			public boolean compareType(Dish dish, DishType type) {
				return dish.getDishType() == type;
			}};
		
		//DIshType의 MEAT만 출력해라.
		summary.printAllDishesBy(dishCompare, DishType.MEAT);
		
		//FoodType의 meat만 출력해라.
		Compare<FoodType> foodCompare = new Compare<>() {

			@Override
			public boolean compareType(Dish dish, FoodType type) {
				return dish.getFoodType() == type;
			}};
			
			
		summary.printAllDishesBy(foodCompare, FoodType.VEGETABLES);
		
		
		Compare<Void> voidCompare = new Compare<>() {

			@Override
			public boolean compareType(Dish dish, Void type) {
				return true;
			}};
			
		System.out.println("=".repeat(10));
		//모든메뉴를 출력해라.
		summary.printAllDishesBy(voidCompare, null);
		
		
		Compare<DishType> dishcal = new Compare<>() {

			@Override
			public boolean compareType(Dish dish, DishType type) {
				return dish.getDishType() == type;
			}};
			
		summary.printTotalCaloriesBy(dishcal, DishType.MEAT);
	}
	

}
