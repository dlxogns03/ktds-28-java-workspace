package com.ktdsuniversity.edu.fp.lambda;

//함수형인터페이스

@FunctionalInterface  // <- 함수형인터페이스라고 명시 @FuntionalInterface 를 public interface위에쓴다
					  // 현재 이 인터페이스 추상메소드를 추가할 경우 인터페이스 페이지에서 에러가 난다.
public interface Computable {
	
	
	int compute(int number1, int number2);
	
}
