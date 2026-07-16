package workflow;



public class CU {
	public static int BagCounting(int items,int BAG_PRICE, int SPILT_COUNT) {
		int needBag = (int)(Math.random() * 2);
		if (needBag == 0) {
			int Bagcount = items / SPILT_COUNT;
			if(items % SPILT_COUNT > 0) {
				Bagcount++;
			}
			return BAG_PRICE*Bagcount;
		}
		return 0;
	}
	
	
	public static int DCCounting(int[] items, float[] dc) {
		int amount = 0;
		for(int i = 0; i < items.length; i++) {
			amount += (int) (items[i] * (1 - dc[i]));
		}
		
		return amount;
	}
	
	public static int cashPay(int cash, int amount) {
		System.out.println("현금 결제");
		if(cash >= amount ) {
			cash -= amount;
			System.out.println("잔액 " + cash);
			//break 
			amount = 0 ;
			return amount;
		}else {
		
			System.out.println("현금이 부족합니다.");
			return amount;
		}
	}
	public static int cardSlash(int cardPaidMoney,int CARD_LIMIT, int amount) {
		System.out.println("신용카드 결제");
		if(amount >= 50000) {
			System.out.println("할부 / 일시불 ?");
			int choice = (int) (Math.random()*2);
			
			if (choice ==  1) {
				System.out.println("일시불 입니다.");
			}else {
				int month = (int)(Math.random()*12);
				System.out.println(month + "개월 할부 입니다.");
				System.out.println("월 결제 금액 : " + (cardPaidMoney + amount)/ month );
			}
			
			if (cardPaidMoney + amount <= CARD_LIMIT) {
				
				cardPaidMoney += amount ;
				System.out.println("결제 완료 입니다");
				//break;
				return amount = 0;
			}else {
				System.out.println("한도 초과 입니다");
				
				return amount;
			}
		}else {
			if (cardPaidMoney + amount <= CARD_LIMIT) {
				
				cardPaidMoney += amount ;
				System.out.println("결제 완료 입니다");
				//break;
				return amount = 0;
				
			}else {
				System.out.println("한도 초과 입니다");
				return amount;
			}
		}
	}
	
	
	
	
	public static int creaditCard(int remainAccount, int amount) {
		
		System.out.println("체크카드 결제");
		if(remainAccount >= amount) {
			remainAccount -= amount;
			System.out.println(amount +"원 결제 완료");
			//break;
			return amount =0;
		}else {
			System.out.println("잔액이 부족합니다");
			return amount;
		}
		
	}
	
	
	
	public static int pointPay(int point, int amount) {
		
		System.out.println("포인트 선 결제");
		if(point >= amount) {
			point -= amount;
			//break;
			return amount = 0;
		}else {
			amount -= point ;
			return amount;
		}
		
	}
	public static void main(String[] args) {
		
		//편의점.drawio 파일을 토대로 작성한 코드.
		
		//시작 
		//손님이 바구니에 담아온 상품의 가격 정보.
		
		int[] items = new int[5];
		items[0] = 5000;
		items[1] = 18000;
		items[2] = 3200;
		items[3] = 30000;
		items[4] = 1300;
		
		//손님이 바구니에 담아온 상품의 할인 정보 
		float[] dc = new float[5]; 
		
		dc[0] = 0;
		dc[1] = 0.1f; //1800원 상품을 10% 할인.
		dc[2] = 0.2f; // 3200원 상품 20% ``
		dc[3] = 1;    // 30000원 상품 100% ''
		dc[4] = 0;    // 0% 할인
		
		//봉투 가격
		final int BAG_PRICE = 100;
		
		//한 봉투에 넣을 수 있는 상품의 수 
		final int SPILT_COUNT = 2;
		
		
		//고객의 자금 상황
		//카드 한도
		final int CARD_LIMIT = 1_000_000;
		
		//현재까지 사용한 금액 
		int cardPaidMoney = 150_000;
		
		//체크 카드 계좌 잔액 
		int remainAccount = 4000;
		
		//가지고 있는 현금 
		int cash = 30_000;
		
		//보유한 포인트
		int point = 1750;
		
		
		//최종 결제 금액 
		int amount = 0;
		
		
		//봉투 필요여부 0 == 필요 1 == 불필요 
		
		amount += BagCounting(items.length, BAG_PRICE,SPILT_COUNT);
		
		//tudo손님이 가져온 상품 목록의 결제 금액 계산해서 amount에 할당.
		//할인율 계산 필요 
		
		amount += DCCounting(items, dc);
		
		//System.out.println(amount);
		
		//포인트 적립 0==> 적립, 1 ==> 적립안함
		int addPoint = (int) (Math.random() * 2);
		
		//적립을 할 경우 (addPoint ==0)이라면 총 결제 금액에서 10% 적립.
		if(addPoint == 0) {
			point +=(int) (amount * 0.1f);
			System.out.println("적립된 포인트 : " + point);
		}
		
		
		
		System.out.println("결제할 금액 : " + amount);
		
		
		
		
		
		while (amount > 0) {
			//결제 수산 선택 (0 == 현금, 1 == 신용카드 , 2 == 체크카드 , 3 == 포인트 선결제, 4 == 포기)
			int payment = (int) (Math.random()*5);
			
			//결제 수단 선택 
			if (payment == 0) {
				//현금 
				amount = cashPay(cash, amount);
				
			}else if (payment == 1) {
				//tudo 신용카드 & 결제 금액 5만원 이상일 경우 일시불 or 할부 선택
				//tudo 신용카드로 결제했을 때 카드 결제금액을 최종 결제 금액만큼 증가
				amount = cardSlash(cardPaidMoney, CARD_LIMIT, amount);
				
			}else if(payment == 2) {
				//체크카드 결제 
				amount = creaditCard(remainAccount, amount);
				
			}else if (payment == 3) {
				
				//tudo 포인트 선결제 했을 때 포인트를 최종결제 금액만큼 차감 
				int leftAmount = pointPay (point, amount);
				
				int usePoint = amount - leftAmount;
				
				amount = leftAmount;
				point -= usePoint;
				System.out.println("남은금액 : " + amount);
				
			}else if (payment == 4) {
				
				System.out.println("결제 취소 ");
				break;
			}
			
		
		}
		
		
		
	}

//프리미티브 타입은 값만 메서드에 전달 
//레퍼런스 타입은 메모리 주소를 전달 ==> 메인 메서드에서 변경됨


}
