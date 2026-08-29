package com.ktdsuniversity.edu.fp.stream;

import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

/**
 * 스트림의 데이터를 변경시키는 Map실습
 * 
 */

public class Mapping {
	
	public static void compareString() {
		String a = "이름";
		String b = "이름";
		System.out.println(a == b);
		
		Scanner key = new Scanner(System.in);
		String c = key.nextLine();
		String d = key.nextLine();
		System.out.println(c.equals(a));
	}
	
	public static void printDishesFoodType() {
		//Dishlist에 있는 FoodType을 중복없이 출력한다.
		List<Dish> dishes = DishList.makeDishList();
		
		dishes.stream()
			  
			  
			  .map(dish -> dish.getFoodType())
			  .distinct()
			  .forEach(System.out::println);
	}
	
	public static void printFishDishesName() {
		List<Dish> dishes = DishList.makeDishList();
		
		dishes.stream()
			  .filter(dish -> dish.getDishType() == DishType.FISH)
			  .map(dish -> dish.getName())
			  .forEach(System.out::println);
	}
	
	public static void printMultipleThreeNumbers() {
		List<String> strings = List.of("1", "2","A","3","99","abc","100","이태훈",
				"-999", "1341234145351645614561","11","12","54","66");
		// 숫자 형태의 문자들을 숫자로 변경하고 3의 배수만 골라서 출력한다.
		strings.stream()
			   .filter(Mapping::isIntFormat)
			   .map(str -> Integer.parseInt(str))
			   .filter(num -> num % 3 == 0)
			   .forEach(System.out::println);
	}
	
	public static void printStringToNumber2() {
		List<String> strings = List.of("1", "2","A","3","99","abc","100","이태훈",
										"-999", "1341234145351645614561","11");
		
		strings.stream()
//			   .filter(str -> str.matches("^-{0,1}[0-9]+$"))
			   .filter(Mapping::isIntFormat)
			   .map(str -> Integer.parseInt(str))
			   .forEach(System.out::println);
			   ;
	}
	
	public static boolean isIntFormat(String string) {
		try {
			Integer.parseInt(string);
			return true;
		}catch(NumberFormatException nfe){
			return false;
			
		}
	}
	
	public static void printStringToNumber() {
		//모든 문자열들을 숫자로 변경해서 출력한다.
		List<String> strings = List.of("1234","134514","123415","12349", "1234");
		strings.stream() //stream<String>
			   .map((str) -> Integer.parseInt(str)) //Stream<Integer>
			   .forEach(System.out::println);
		;
	}

	public static void printOddToEven() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//모든 숫자들에게 2를 곱해서 짝수로 만들어 출력한다.
		
		numbers.stream()     //stream<Integer>
			   .map((n)->n *2 )      //Stream<Integer>
			   .forEach(System.out::println);
			   ;
	}

	public static void main(String[] args) {

		printOddToEven();
		System.out.println("=".repeat(10));
		printStringToNumber();
		System.out.println("=".repeat(10));
		printStringToNumber2();
		
		System.out.println("=".repeat(10));
		printMultipleThreeNumbers();
		
		System.out.println("=".repeat(10));
		printDishesFoodType();
		System.out.println("=".repeat(10));
		printFishDishesName();
		System.out.println("=".repeat(10));
		printDishesFoodType();
		
		compareString();
	}

}
