package com.ktdsuniversity.edu.oop.generics;

public class UserTest {
	
	
	public static void main(String[] args) {
		User<Integer, String> user01 = new User<>(134, "12asdf");
		
		int id  = user01.getId();
		
		String name = user01.getName();
		
		
		User<Integer,Long> user02 = new User<>(1234,134516L);
		
		int id2 = user02.getId();
		Long name2 = user02.getName();
		System.out.println(id +  " " + name);
		
		System.out.println(id2 + " " + name2);
	}

}
