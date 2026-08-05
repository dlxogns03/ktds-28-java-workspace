package com.ktdsuniversity.edu.fp.lambda;



public class LambdaExam {
	
	public static void main(String[] args) {
		
		//람다 함수를 사용하려면...
		//조건 1. 반드시 인터페이스로서 필요하다.
		//조건 2. 추상 메소드가 반드시 1개만 있어야 한다.
		
		Computable addComputer = new Computable() {

			@Override
			public int compute(int number1, int number2) {
				return (number1 + number2);
			}};
		int addresult = addComputer.compute(10, 40);
		System.out.println(addresult);
		
		//추상 메소드가 1개만 있는 computable 인터페이스를 이용해 함수를 만들기.
		
		Computable multiplicateComputer = (int number1, int number2) ->{
			return number1 * number2;
		};
		System.out.println(addComputer);
		System.out.println(multiplicateComputer);
		
		int mulResult = multiplicateComputer.compute(3, 8);
		System.out.println(mulResult);
		
		//Computable 인터페이스를 이용해 두 개의 숫자를 뺄셈한 결과를 반환 시키는함수 
		// 함수를 만들때 파라미터의 타입을 명시하지않아도 인터페이스에 명시되어 있는 타입을 따라가기때문에 오류가 나지 않는다 
		// 특정 값을 반환시킬땐 return과 {}를 생략해도 된다. {}와 return은 한쌍으로 사용
		// 인터페이스에서 void(즉 반환값이 없을때) {}를 사용해야한다.{}안에는 여러줄이 들어갈수있다
		Computable subComputer = (number1, number2) -> number1 - number2;
		
		
		int subResult = subComputer.compute(10, 2);
		System.out.println(subResult);
		
		//Computable 인터페이스를 이용해 두 개의 숫자를 나눗값의 결과를 반환 시키는함수 
		Computable divComputer = (int number1, int number2)-> 	number1 / number2;
		int divResult = divComputer.compute(50, 5);
		
		System.out.println(divResult);
		
		//Computable 인터페이스를 이용해 두 개의 숫자를 나눈 나머지의 결과를 반환 시키는함수 
		
		Computable modComputer = (int number1, int number2) ->number1 % number2;
	
		int modresult = modComputer.compute(4, 3);
		System.out.println(modresult);
		
		
	}
}
