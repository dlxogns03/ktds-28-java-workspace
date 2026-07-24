package restrant;

public class Restrant {
	
	public static void main(String[] args) {
		Foods 육고기 = new Foods(25,0);
		Foods 채소와과일 = new Foods(13, -5);
		Foods 생선 = new Foods (7,0);
		
		Foods 소주 = new Foods(-7, 15);
		Foods 맥주 = new Foods(8, 6);
		Foods 위스키와꼬냑 = new Foods(-7, 40);
		
		
		Custumer cus1 = new Custumer(18, false);
		
		System.out.println("손님 1");
		
		cus1.eat(육고기.getFull(), 육고기.getalcohol());
		cus1.eat(육고기.getFull(), 육고기.getalcohol());
		cus1.eat(육고기.getFull(), 육고기.getalcohol());
		cus1.eat(육고기.getFull(), 육고기.getalcohol());
		cus1.eat(육고기.getFull(), 육고기.getalcohol());
		cus1.eat(소주.getFull(), 소주.getalcohol());
		
		Custumer cus2 = new Custumer(20, false);
		
		
		System.out.println("======");
		
		System.out.println("손님 2");
		cus2.eat(채소와과일.getFull(), 채소와과일.getalcohol());
		
		cus2.eat(맥주.getFull(), 맥주.getalcohol());
		cus2.eat(맥주.getFull(), 맥주.getalcohol());
		cus2.eat(위스키와꼬냑.getFull(), 위스키와꼬냑.getalcohol());
		cus2.eat(위스키와꼬냑.getFull(), 위스키와꼬냑.getalcohol());
	}
	
	

}
