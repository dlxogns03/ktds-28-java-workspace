package cafe;

public class ComicsMain {
	
	
	
	
	
	public static void main(String[] args) {
		
		ComicsBook[] books = new ComicsBook[10];
		books[0] = new ComicsBook("슬렘덩크 1권", false , 500);
		books[1] = new ComicsBook("슬렘덩크 2권", false, 500);
		books[2] = new ComicsBook("슬렘덩크 3권", false, 500);
		
		
		ComicsBookCafe playtoon = new ComicsBookCafe(books);
		
		
		//플레이툰이 보유중인 만화책 목록을 노출시킨다
		playtoon.displayBooks();
		
		Visitor me = new Visitor(4_000);
		Visitor other = new Visitor(50_000);
		
		
		playtoon.displayBooks();
//		
//		//고객이 플레이툼에서 슬렘덩크 1권을 빌린다.
//		
		me.rent(playtoon, 0);  // visitor.books[0] 만화책정보 할당
//		
//		
//		//고객이 플레이툼에서 슬렘덩크 3권을 빌린다.
		me.rent(playtoon, 2);	// visitor.books[1] 만화책정보 할당
//		
//		
//		//다른 고객이 플레이툰에서 슬램덩크 3권을 빌린다.
		other.rent(playtoon,2); 
//		
//		//me고객이 슬램덩크1권을 플레이툰에게 반납하겠다.
		me.returnBook(0); 
		me.returnBook(0); 
		me.returnBook(0); 
		
//		
//		//me 고객이 대여한 만화책 목록
		me.printBooks();
//		
//		//other고객이 대여한 만화책 목록
		other.printBooks();
	}

}
