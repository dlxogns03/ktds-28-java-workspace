package com.ktdsuniversity.edu.fp.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
	
	public static void main(String[] args) {
		
		//문자를 숫자로 변경해본다.
		//"1234" => 1234
		
		String numberFormatString = "1234";
		
		//Lambda
		Function<String, Integer> toNumber = (str)->Integer.parseInt(str);
		int number = toNumber.apply(numberFormatString);
		System.out.println(number);
		
		//MethodReference 클래스or인스턴스 :: 메소드
		Function<String, Integer> toNumberRef = Integer::parseInt;
		int num2 = toNumberRef.apply(numberFormatString);
		System.out.println(num2);
		
		//문자를 문자의 길이로 변경해본다
		// "abc" => 3 , "aaaaa" => 5
		
		//Lambda
		Function<String, Integer> toLength = (str)-> str.length();
		int len = toLength.apply("Asf");
		System.out.println(len);
		len = toLength.apply("aaaaa");
		System.out.println(len);
		
		//MethodReference
		
		Function<String, Integer> toLengthRef = String::length;
		int len2 = toLengthRef.apply("abc");
		System.out.println(len2);
		len2 = toLengthRef.apply("aaaaa");
		System.out.println(len2);
		
		
		List<String> toStr = new ArrayList<>();
		
		toStr.add(numberFormatString);
		toStr.add(numberFormatString);
		toStr.add(numberFormatString);
		toStr.add("asdf");
		
		Function<String, Integer> indexOfRef = toStr::indexOf;
		
		int num3 = indexOfRef.apply("asdf");
		System.out.println(num3);
		
		
		
		Consumer<String> printer = (str) -> System.out.println(str);
		printer.accept("asdfasf");
		Consumer<String> printRef = System.out::println;
		printRef.accept("augugadoga");
		/**
		 * 메소드 레퍼런스의 규칙
		 * 1. 함수의 파라미터와 반환타입이 메소드의 파라미터와 반환 타입이 같다.
		 * 2. 함수의 파라미터 타입의 인스턴스이 같고 함수의 반환타입이 메소드의 반환타입과 같다.
		 * 
		 * Function<String, Integer> toLengthRef = String::lndexOf;
		 * 일경우 static 이 붙어있지 않으면 제네릭 String이 소비되어 indexOf에서 받아올 파라미터가
		 * 없어지게 된다
		 */
	}

}
