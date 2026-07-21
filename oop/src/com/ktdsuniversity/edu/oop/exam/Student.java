package com.ktdsuniversity.edu.oop.exam;

public class Student {
	int java;
	int python ;
	int cpp ;
	int csharp ;
	
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
