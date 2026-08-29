package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class Collecting {
	
	public static void printCaloryGroups() {
		//칼로리 별로 그룹을 나누어 출력
		//400이하 =>"diet"
		//700이하 => "nomal"
		//700초과 =>"fat"
		List<Dish> dishes = DishList.makeDishList();
		Map<String,List<Dish>> groupMap = dishes.stream()
			  .collect(Collectors.groupingBy(dish ->{ 
				  int calory = dish.getCalories();
				  
				  if(calory <= 400) {
					  return "Diet";
					  
				  }else if(calory <= 700) {
					  return "nomal";
					  
				  }
				  
				  return"fat";
			  }))//Map<String, List<dish>>
			  ;
		groupMap.forEach((key,value)->{
			System.out.println(key + "=".repeat(50));
			value.forEach(System.out::println);
		});
	}
	
	public static void printFoodTypeGroups() {
		List<Dish> dishes = DishList.makeDishList();
		Map<FoodType,List<Dish>> groupMap = dishes.stream()
				.collect(Collectors.groupingBy(dish -> dish.getFoodType()))
				;
		groupMap.forEach((key,value)->{
			System.out.println(key + "=".repeat(50));
			value.forEach(System.out::println);
		});
	}
	
	public static void printDishTypeGroups() {
		List<Dish> dishes = DishList.makeDishList();
		
		Map<DishType,List<Dish>>groupMap =  dishes.stream()
			.collect(Collectors.groupingBy( dish -> dish.getDishType() )) // Map<DishType, List<Dish>>
		;
		System.out.println(groupMap);
		System.out.println("OTHER =>" + groupMap.get(DishType.OTHER));
		System.out.println("FISH =>" + groupMap.get(DishType.FISH));
		System.out.println("MEAT =>" + groupMap.get(DishType.MEAT));
		
		//map 반복하기
		groupMap.forEach((key,value) -> {
			System.out.println(key + "=".repeat(50));
			value.forEach(System.out::println);
		});
	}
	public static void printDishNames3() {
		List<Dish> dishes = DishList.makeDishList();
		//메뉴의 이름들을 칼로리 순으로 내림차순하여 칼로리을 "->"구문해서 출력
		String dish = dishes.stream()
							.sorted((dish1, dish2)-> dish2.getCalories() - dish1.getCalories())
							.map(dish3 -> dish3.getCalories()+"")
							.collect(Collectors.joining("->"))
							;
		System.out.println(dish);
	}
	
	public static void printDishNames2() {
		List<Dish> dishes = DishList.makeDishList();
		//메뉴의 이름들을 칼로리 순으로 오름차순하여 이름들을 "->"구문해서 출력
		String dish = dishes.stream()
							.sorted((c1,c2) -> c1.getCalories() - c2.getCalories())
							.map(name -> name.getName())
							.collect(Collectors.joining("->"))
							;
		System.out.println(dish);
		
	}
	
	public static void printDishNames() {
		List<Dish> dishes = DishList.makeDishList();
		//메뉴의 이름들을 ", "로 구분해서 출력한다.
		String dish1 = dishes.stream()
							 .map(dish -> dish.getName())
							 .collect(Collectors.joining(","))
							 ;
		System.out.println(dish1);
	}
	
	
	public static String concatStrings(List<String> strings, String seperator) {
		return strings.stream()
			   .collect(Collectors.joining(seperator))
			   ;
		
		
	}
	
	public static Dish getMinCaloryDish() {
		List<Dish> dishes = DishList.makeDishList();
		return dishes.stream()
					  .collect(Collectors.minBy((d1,d2)-> d1.getCalories() - d2.getCalories()))
					  .orElse(null)
					  ;
	}
	
	
	public static Dish getMaxCaloryDish() {
		List<Dish> dishes = DishList.makeDishList();
		return dishes.stream()
					  .collect(
							  Collectors.maxBy((d1,d2) -> d1.getCalories() - d2.getCalories()))//Optional<Dish>
					  .orElse(null)
					  ;
		
	}
	
	public static List<Integer> getDescendingOrderdList(List<Integer> intList){
		
		return intList.stream() //Stream<Integer>
					  .sorted((n1,n2) -> n2- n1) //Stream<Integer>
					  .collect(Collectors.toList());
	}
	
	public static List<Integer> getOrderedList(List<Integer> intList){
		
		return intList.stream() //Stream<Integer>
					   .sorted() //Stream<Integer>
					   .collect(Collectors.toList()); //List<Integer>
	}
	
	
	public static List<Integer> getEvenNumberList(List<Integer> intList) {
		
		
		
		return intList.stream()//Stream<Integer>
					.filter(num -> num % 2 == 0)//Stream<Integer>
					.collect(Collectors.toList())//List<Integer>
					  
					;
	}
	
	public static void main(String[] args) {
		System.out.println("=".repeat(10));
		List<Integer> evenList = getEvenNumberList(List.of(1,2,3,4,5,6,7,8,9,10,11,12));
		
		evenList.forEach(System.out::print);
		
		System.out.println();
		System.out.println("=".repeat(10));
		
		//오름차순 정렬된 리스트를 반환
		List<Integer> orderList = getOrderedList(List.of(1,3,9,10,12,6,7,8,2,11));
		
		orderList.forEach(System.out::print);
		
		System.out.println();
		System.out.println("=".repeat(10));
		
		//내림차순 정렬된 리스트를 반환
		List<Integer> descList = getDescendingOrderdList(List.of(1,3,9,10,12,6,7,8,2,11));
		
		descList.forEach(System.out::print);
		
		System.out.println();
		System.out.println("=".repeat(10));
		
		Dish dish = getMaxCaloryDish();
		System.out.println(dish);
		System.out.println("=".repeat(10));
		
		
		Dish minDish = getMinCaloryDish();
		System.out.println(minDish);
		System.out.println("=".repeat(10));
		
		
		String result = concatStrings(List.of("A","B","C","D","E","G","F"),", ");
		System.out.println(result);//A,B,C,D,E,F
		
		System.out.println("=".repeat(10));
		
		result = concatStrings(List.of("A","B","C","D","E","G","F"),"");
		System.out.println(result);//ABCDEF
		
		printDishNames();
		printDishNames2();
		printDishNames3();
		
		printDishTypeGroups();
		System.out.println("foodType" + "=".repeat(40));
		printFoodTypeGroups();
		System.out.println("=".repeat(50));
		printCaloryGroups();
	}
	

}
