package com.ktdsuniversity.edu.oop.enums;

public enum CalcType {
	ADD("더하기"), SUB("뺄셈"), MUL("곱셈"), DIV("나눗셈");

	private String name;

	// enum에서는 접근제어자를 사용하지 않는다
	CalcType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
