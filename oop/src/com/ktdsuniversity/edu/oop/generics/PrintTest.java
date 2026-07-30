package com.ktdsuniversity.edu.oop.generics;

import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class PrintTest {
	
	public static void main(String[] args) {
		
		Print<Integer> intPrint = new Print<>(0);
		Print<Double> doublePrint = new Print<>(0d /*0.0*/);
		Print<Long> longPrint = new Print<>(0L);
		Print<Boolean> booleanPrint = new Print<>(false);
		
		Print<Goods> goodsPrint = new Print<>(new Goods("aa",1000));
		Goods goods = goodsPrint.getPrintData();
		goodsPrint.print();
		System.out.println(goods);
		
		intPrint.print();
		doublePrint.print();
		longPrint.print();
		booleanPrint.print();
	}
	
}
