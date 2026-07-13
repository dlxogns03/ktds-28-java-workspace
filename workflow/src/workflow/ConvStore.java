package workflow;

public class ConvStore {
	
	public static void main(String[] args) {
		
		// A 편의점은 한 종류의 음료수만 판매합니다 
		// 음료수 하나의 가격은 3000원 입니다.
		
		// 5000원을 가지고 있는 손님이 음료수를 3개 구매하려 합니다.
		// 구매할 수 있다면 음료수 가격 X 구매개수를 출력하고
		// 구매할수 없다면 "금액이 부족합니다."를 출력한다 
		
		final int price = 3000;
		int con = 5000;
		
		if (con >= price) {
			
			System.out.println(price +"x" + (con / price));
		}
		else if (con < price) {
			
			System.out.println("금액이 부족합니다");
		}
		
		
		final int PRICEA = 4500;
		int stock = 5;
		
		int convA = 30000;
		int n = 3 ;
		
		
		if (n <= stock && PRICEA * n <= convA) {
			System.out.println(PRICEA * n);
			
		}
		else if (n <= stock && PRICEA * n >= convA) {
			System.out.println("금액이 부족합니다 ");
		}
		else if (n >= stock) {
			System.out.println("재고수가 충분하지 않습니다");
		}
		
		////
		
		int amount = PRICEA * n;
		
		if (n > stock) {
			System.out.println(amount);
		}
		else if (convA > amount) {
			System.out.println(amount);
		}
		else {
			System.out.println("금액이 충분하지 않습니다 ");
		}
		
	}

}
