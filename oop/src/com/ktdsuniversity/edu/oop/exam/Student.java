package com.ktdsuniversity.edu.oop.exam;

public class Student {
	private int java;
	private int python ;
	private int cpp ;
	private int csharp ;
	
	public Student() {
//		this.java = 100;
//		this.python = 100;
//		this.cpp = 100;
//		this.csharp = 100;
		
		// 생성자 내부에서는 다른 생성자의 호출이 가능하다.
		//호출장법 : this();
		this(100,100,100,100);
	}
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	
	
	public int getSumAllScore () {
		
		
		return java + python + cpp + csharp;
	
	}
	
	public 	double getAverage (int score) {
		return score / 4d;
	
	}
	
	public double getCanseCredit(double score) {
		if (score < 55) {
			return 0.1;
		}
		
		return (score - 55) / 10;
	}
	
	
	
	public String getABCDF(double score) {
		
		
		if(score > 4.0) {
			
			return "A+";
			
		}else if (score > 3.5) {
			
			return "A";
			
		}else if (score > 3.0) {
			
			return "B+";
			
		}else if(score > 2.5) {
			
			return "B";
			
		}else if(score > 1.5) {
			
			return "C";
			
		}else if(score > 0.5) {
			
			return "D";
			
		}else { 
			
			return "F";
		}
		
		
		
		
	}


}
