package com.ktdsuniversity.edu.oop.inheritence.contact;

public class Main {
	
	public static void printNameAndPhone(Contact contact) {
		System.out.println(contact.getName());
		System.out.println(contact.getPhone());
		
	}
	
	
	
	public static void main(String[] args) {
		Contact contact = new Contact("친구1", "010-1234-5678");
		
		printNameAndPhone(contact);
		
		contact.printContact();
		
		
		
		EmailContact contact2 = new EmailContact("친구2", "010-4334-5678", "exam@exam.com");
		
		String Email = contact2.getEmail();
		
		printNameAndPhone(contact2);
		
		contact2.printContact();
		
		System.out.println(Email);
	}

}
