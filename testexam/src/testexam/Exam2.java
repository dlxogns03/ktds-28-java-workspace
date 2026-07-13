package testexam;

public class Exam2 {
	public static void main(String[] args) {
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 19;
		
	
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		// 3인 가족이 100만원으로 비행기를 타고 편도 여행을 가려합니다.
		// 부모님의 나이는 각각 40, 36세입니다.
		// 딸의 나이는 11세입니다.
		// 성인의 비행요금은 30만원
		// 아동의 비행요금은 12만원입니다. 성인 판단 기준은 19세 이상입니다.
		// 3인 가족은 여행을 떠날 수 있을까요?
		// 여행을 떠날 수 있다면 "여행가자!"
		// 여행을 떠날 수 없다면 "다음에가자"
		// 를 출력해보세요.
		int price = 0;
		
		if (daughter >= 19) {
			
			price = adultOneWayFlightFare * 3;
			
			if ( money >= price) {
				System.out.println("여행가자");
			}
			else {
				System.out.println("담에가자");
			}
			
		}
		
		
		else {
			
			price = adultOneWayFlightFare * 2 + kidOneWayFlightFare;
			
			if(money >= price) {
				System.out.println("여행가자");
			}
			else {
				System.out.println("담에가자");
			}
		}
		
		
		
		
		
		
		
		/*
		if (father >= 19 && mother >= 19 && daughter >= 19) {
			if ( money >= adultOneWayFlightFare * 3) {
				System.out.println("여행가자 ");
			}
			else {
				System.out.println("다음에 가자");
			}
		}
		else if (father >= 19 && mother >= 19 && daughter <= 19) {
			
			if(money >= adultOneWayFlightFare * 2 + kidOneWayFlightFare) {
				System.out.println("여행가자");
				
			}
			else {
				System.out.println("다음에 가자");
			}
		}
		
		*/
		
		
		
		
		
		
		
		////////////////////////
		/*
		else if (father >= 19 && mother <= 19 && daughter <= 19) {
			
			if(money >= adultOneWayFlightFare + kidOneWayFlightFare * 2) {
				System.out.println("여행가자");
				
			}
			else {
				System.out.println("다음에 가자");
			}
		}
		else if (father <= 19 && mother <= 19 && daughter <= 19) {
			
			if(money >=  kidOneWayFlightFare * 3) {
				System.out.println("여행가자");
				
			}
			else {
				System.out.println("다음에 가자");
			}
		}
		*/

	}
}
