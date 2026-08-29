package com.ktdsuniversity.edu.fp.anonymous;

import java.util.List;

import com.ktdsuniversity.edu.fp.anonymous.inf.Compare;
import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class DishSummay {
	private List<Dish> dishes ;
	
	public DishSummay() {
		this.dishes = DishList.makeDishList();
	}
	
	
	
	
	
	public <T> void printAllDishesBy (Compare<T> compare, T type) {
		for (int i =0; i < this.dishes.size(); i++) {
			if ( compare.compareType(this.dishes.get(i), type)) {
				System.out.println(this.dishes.get(i));
			}
		}
	}
	
	
	public <T> void printTotalCaloriesBy(Compare<T> compare, T type) {
		
		int totalCalories = 0;
		
		for(int i = 0; i < this.dishes.size(); i++) {
			if(compare.compareType(this.dishes.get(i), type)) {
				totalCalories += this.dishes.get(i).getCalories();
			}
			
		}
		System.out.println(totalCalories);
	}
	
	
	
	
	
	public <T> void printAverageCaloriesBy(Compare<T> compare, T type) {
		
		int totalCalories = 0;
		int size = 0;
		for(int i = 0; i < this.dishes.size(); i++) {
			if(compare.compareType(this.dishes.get(i), type)) {
				size++;
				totalCalories += this.dishes.get(i).getCalories();
			}
			
		}
		System.out.println(totalCalories/(double) size);
	}
}
