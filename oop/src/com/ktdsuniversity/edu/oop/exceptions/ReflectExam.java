package com.ktdsuniversity.edu.oop.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectExam {
	
	public static void main(String[] args) {
		// Reflection : 다이나믹 로딩.
		// -> 클래스, 멤버변수, 생성자, 메소드등을 동적으로 로딩한다
		// -> 동적로딩 ==> 클래스의 도움없이 인스턴스를 생성하거나 호출하는 방법.
		
//		GoodsHolder holder = new GoodsHolder(4);
		try {
		Class holderClass = Class.forName("com.ktdsuniversity.edu.oop.exceptions.GoodsHolder");
		Constructor 생성자 = holderClass.getDeclaredConstructor(int.class);
		Object holder = 생성자.newInstance(4);
		System.out.println(holder);
		
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			
		} catch(NoSuchMethodException nsme) {
			nsme.printStackTrace();
		} catch(InstantiationException ie) {
			ie.printStackTrace();
		} catch (IllegalAccessException iae	) {
			iae.printStackTrace();
		} catch(InvocationTargetException ite) {
			ite.printStackTrace();
		}
		/**
		 * RunTimeException 자식은 -> try - catch 필요 없음 // 복구 불가 예외처리
		 * Exception 자식은 -> try-catch-finally 필요 //복구 가능 예외처리
		 * 
		 * try-catch는 복구를 할수있게 해준다 
		 */
	}

}
