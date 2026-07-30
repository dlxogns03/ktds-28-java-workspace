package com.ktdsuniversity.edu.oop.collection.list;

import cafe.ComicsBook;

public class ComicsTest {
	public static void main(String[] args) {
		
		ComicsBookCafe cafe = new ComicsBookCafe();
		cafe.addBook(new ComicsBook("만화책1권", false, 500));
		cafe.addBook(new ComicsBook("만화책2권", false, 500));
		cafe.addBook(new ComicsBook("만화책3권", false, 500));
		cafe.addBook(new ComicsBook("만화책4권", false, 500));
		cafe.addBook(new ComicsBook("만화책5권", false, 500));
		cafe.addBook(new ComicsBook("만화책6권", false, 500));
		
		cafe.addBook(new ComicsBook("만화책7권", false, 500));
		cafe.addBook(new ComicsBook("만화책8권", false, 500));
		
	}
}
