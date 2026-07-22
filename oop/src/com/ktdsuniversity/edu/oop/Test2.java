package com.ktdsuniversity.edu.oop;

import com.ktdsuniversity.edu.oop.exam.Car;
import com.ktdsuniversity.edu.oop.exam.Student;

import java.util.Scanner;
public class Test2 {
	
	public static void main(String[] args) {
		Car testcar = new Car(10);
		Scanner scanner = new Scanner(System.in);
		Student student= new Student(100,29,78,89);
		System.out.println(testcar.zero100Seconds);
	}

}
