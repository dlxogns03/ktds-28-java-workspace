package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.ktdsuniversity.edu.fp.objects.enums.DishType;
import com.ktdsuniversity.edu.fp.objects.enums.FoodType;

public class NavtiveFuntion {
	
	public static void main(String[] args) {
		//Predicate<T> => T를 받아서 boolean을 반환시킨다.
		Predicate<String> isEmpty = (str) -> str == null || str.isBlank();
		System.out.println(isEmpty.test(null));
		System.out.println(isEmpty.test("   "));
		System.out.println(isEmpty.test("asdf"));
		//Consumer<T> => T를 받아서 void를 반환시킨다.
		//함수형 자바를 쓸때 {}에있는 구문의 반환타입과 Consumer의 반환타입이 같으면 {}를 생략할수 있다.
		Consumer<String> print = (str) ->{
			System.out.println(str);
		};
		print.accept("test test");
		//Function<T,R> => T를 받아서 R을 반환시킨다
		//String을 파라미터로 전달해ㅓ 문자열의 길이를 반환시키는 함수.
		Function<String, Integer> getlength = (str) -> str.length();
		int length = getlength.apply("asdfasdf");
		System.out.println(length);
		
		//String을 파라미터로 전달해서 숫자로 변경해주는 함수.
		Function<String, Integer> returnInteger = (str) -> Integer.parseInt(str);
		int returnint = returnInteger.apply("1234");
		System.out.println(returnint);
		
		//Integer를 파라미터로 전달해서 문자로 변경해주는 함수.
		Function<Integer,String> returnString = (num) -> num+"";
		String name = returnString.apply(1241);
		System.out.println(name);
		//Integer를 파라미터로 전달해서 2의 배수만 true로 반환시켜주는 함수.
		
		Function<Integer,Boolean> qotn = (num) -> (num % 2) == 0;
		
		System.out.println(qotn.apply(7));
		
		
		DishSummay summary = new DishSummay();
		
		summary.printAllDishesBy((dish) -> dish.getDishType() == DishType.MEAT);
		
		summary.printAllDishesBy((dish)-> true);
		summary.printAllDishesBy((dish)-> false);
		
		summary.printAllDishesBy((dish) -> dish.getFoodType() == FoodType.VEGETABLES);
	}

}
