package com.ktdsuniversity.edu.fp.stream;

import java.util.IntSummaryStatistics;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;

public class PrimitiveStream {
	
	public static void printSummaryStatisticsOfDishes() {
		//모든 dish의 Calory를 가진 IntStream으로 변환해서 
		//summaryStatistics()를 호출한 결과를 출력해본다
		List<Dish> dishes = DishList.makeDishList();
		
		IntSummaryStatistics cal = dishes.stream() // Stream<Dish>
										  .mapToInt(dish -> dish.getCalories()) // IntStream
										  .summaryStatistics()//IntSummaryStatistics
		;
		System.out.println(cal);
		int min = cal.getMin();
		System.out.println(min);
		
		double avg = cal.getAverage();
		System.out.println(avg);
		long sum = cal.getSum();
		System.out.println(sum);
	}
	
	public static void printDishesVaerageCalory() {
		//모든 dish의 평균 Calory를 구해서 출력한다.
		List<Dish> dishes = DishList.makeDishList();
		double avg = dishes.stream()
						    .mapToInt(dish -> dish.getCalories())
						    .average()
						    .orElse(-1)
						    ;
		System.out.println(avg);
	}
	
	public static void printMinNumber() {
		List<String> numbers = List.of("123","65","56","872","4","7","1","347");
		int min = numbers.stream()
						 .mapToInt(num -> Integer.parseInt(num))
						 .min()
						 .orElse(-1)
						 ;
		System.out.println(min);
	}
	
	public static void printMaxNumber() {
		List<Integer> numbers = List.of(123,65,56,872,4,7,1,347);
		
		int max = numbers.stream()
						 .mapToInt(num -> num)
						 .max() //optionalInt
						 .orElse(-1)
						 ;
		System.out.println(max);
	}
	
	public static void printSumNumbers() {
		List<Integer> numbers = List.of(123,65,56,872,4,7,1,347);
		
		int sum = numbers.stream() //Stream<Integer>
						 .mapToInt(num -> num) //IntStream
						 .sum() //int
						 ;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printSumNumbers();
		printMaxNumber();
		printMinNumber();
		printDishesVaerageCalory();
		printSummaryStatisticsOfDishes();
	}

}
