package com.ktdsuniversity.edu.oop.inheritence.contact;

public class EmailContact extends Contact{
	private String email;
	
	
	// this(); <-나의 기본생성자를 호출해라 
	//super(); <- 상속받은 부모의 생성자를 호출
	public EmailContact(String name, String phone, String email) {
		super(name, phone);
		this.email = email;
		
	}
	public String getEmail() {
		return this.email;
	}
}
