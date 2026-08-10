package com.ktdsuniversity.edu.fp.stream;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.fp.objects.Dish;
import com.ktdsuniversity.edu.fp.objects.DishList;
import com.ktdsuniversity.edu.fp.objects.enums.DishType;

public class Finding {
	
	public static void printHeavyCaloryDish() {
		//칼로리가 1000이상인 dish를 출력.
		//없으면 null을 반환한다.
		List<Dish> dishes = DishList.makeDishList();
		Dish dishCalory = dishes.stream()
							    .filter(dish -> dish.getCalories() >= 1000)
							    .findFirst()
							    .orElse(null)
							    ;
		
		System.out.println(dishCalory);
	}
	
	
	public static void printFirstFishDish() {
		List<Dish> dishes = DishList.makeDishList();
		Dish dishType = dishes.stream()
							  .filter(dish -> dish.getDishType() == DishType.FISH)
							  .findFirst()
							  .orElse(null)
							  ;
		System.out.println(dishType);
	}
	

	public static void printAnyNumber() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 100_000_000; i++) {
			numbers.add((int) (Math.random() * 100000) + 1);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(numbers.get(i));
		}

		int num = numbers.parallelStream() //Stream<Integer>
						  .findAny() //Optional<Integer> //여러개의 스레드가 찾는도중 아무거나 하나 가져와라
						  .orElse(-1)
						  ;
		System.out.println("Find Any 결과 : ");
		System.out.println(num);
	}

	public static void printFirstRandomNumber() {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			numbers.add((int) (Math.random() * 100000) + 1);
		}

		System.out.println(numbers);

		int random = (int) (Math.random() * 1000000) + 1;
		System.out.println("찾으려는 배수 : " + random);

		int randomNumber = numbers.stream()
								  .filter((num) -> (num % random == 0))
								  .findFirst()
								  .orElse(-1)
								  ;
		System.out.println(randomNumber);

	}

	public static void printFirstMultipleSevenNumber() {

		// 난수 생성 => 1,000,000
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 1_000_000; i++) {
			numbers.add((int) (Math.random() * 100000) + 1);
		}
		int sevnNumber = numbers.stream() // Stream<Integer>
								.filter(num -> num % 7 == 0) // Stream<Integer>
								.findFirst() // Optional<Integer>
								.orElse(-1) // Integer ?? null ? value
		;

		System.out.println(numbers);
		System.out.println(sevnNumber);
	}

	public static void printFirstElement() {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int firstNumber = numbers.stream() // Stream<Integer>
								 .findFirst() // Optional<Integer>
								 .get()// Integer
								 ;
		System.out.println(firstNumber);
	}

	public static void main(String[] args) {

//		printFirstElement();
//		printFirstMultipleSevenNumber();
//		printFirstRandomNumber();
//		System.out.println("=".repeat(5));
//		printAnyNumber();
		
		
		printFirstFishDish();
		printHeavyCaloryDish();
	}

}
