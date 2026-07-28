package com.ktdsuniversity.edu.oop.interfaces;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		//ArticleSystem is a ArticleService
		Articleservice articleservice = new ArticleSystem();
		
		articleservice.write();
		articleservice.view();
		articleservice.delete();
		
		
		//ArticleSystem is a ReplyService
		ReplyService replyservice = new ArticleSystem();
		
		replyservice.addReply();
		replyservice.deleteReply();
		replyservice.recommendReply();
		
		
		//SomeInterfacedml 인스턴스를생성해보기
		//Interface는 인스턴스로 생성할 수 없다.
		
		//=> java의 인스턴스는 모든 메소드가 구현이 되어있어야한다.
		//=> 인터페이스 사용을 사이드이팩트를 줄일수 있다 .
		//인터페이스를 사용하여 클래스간의 의존도를 낮춘다. 약한결합 
		SomeInterface inf = new SomeClass();
		inf.doSomething1();
		inf.doSomething2();
		inf.doSomething3();
		int some = inf.getSomething();
		System.out.println(some);

		String str = inf.getString();
		System.out.println(str);
		
		
	}
}
