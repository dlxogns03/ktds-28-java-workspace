package com.ktdsuniversity.edu.fp.anonymous.inf;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class CompareTest {
	
	public static void main(String[] args) {
		Dish dish1 = new Dish("메뉴1", FoodType.MEAT, 500, DishType.MEAT);
		Dish dish2 = new Dish("메뉴2", FoodType.VEGETABLES, 200, DishType.OTHER);
		Dish dish3 = new Dish("메뉴3", FoodType.MEAT, 700, DishType.FISH);
		
		Compare<DishType> dishCompare = new Compare<>() {

			@Override
			public boolean compareType(Dish dish, DishType type) {
				return dish.getDishType().equals(type) ;
			}};
			
		
		//dish1메뉴가 DishType의 OTHER인가?
		
		boolean isOther = dishCompare.compareType(dish1, DishType.OTHER);
		
		System.out.println("디쉬타입 : " + isOther);
		
		//dish1 메뉴가 Dishtype의 meat인가?
		boolean isMeat = dishCompare.compareType(dish1, DishType.MEAT);
		System.out.println("디쉬타입 : " + isMeat);
		
		
		
		Compare<FoodType> FoodCompare = new Compare<>() {

			@Override
			public boolean compareType(Dish dish, FoodType type) {
				return dish.getFoodType().equals(type) ;
			}};
		//dish1 메뉴가 Foodtype의 MEAT인가?
		isMeat = FoodCompare.compareType(dish1, FoodType.MEAT);
		System.out.println("푸드타입 : " + isMeat);
		
		//dish1 메뉴가 FoodType의 VEGETABLES인가?
		boolean isVegetables = FoodCompare.compareType(dish1, FoodType.VEGETABLES);
		System.out.println("푸드타입 : " + isVegetables);
		
	}
	

}
