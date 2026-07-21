package classexam;

public class SellerAndCustamer {
	
	public static void main(String[] args) {
		
		
		
		
		Seller sell = new Seller(2000 , (int)(Math.random()*10));
		Custamer cus = new Custamer(10000, 4);
		
		
		
		System.out.println("재고 : " + sell.itemStock);
		System.out.println("가지고 있는 현금 : "  + cus.cash);
		System.out.println("============");
		System.out.println("구매 할려는 개수와 가격 : " + sell.itemPrice + " , " + cus.buyItems);
		
		
		
		
		
		
		
		
		if(cus.cash > (sell.itemPrice * cus.buyItems)) {
			
			if(cus.buyItems > sell.itemStock) {
				
				cus.bagCount(sell.itemStock);
				sell.sales(sell.itemStock , sell.itemPrice);
				
				
				
				System.out.println("매출액 : " + sell.itemSell);
				System.out.println("남은 재고 : " + sell.itemStock);
				
			}else { 
				
				sell.sales(cus.buyItems,sell.itemPrice);
				
				
				System.out.println("매출액 : " + sell.itemSell);
				System.out.println("남은 재고 : " + sell.itemStock);
			}
			
		}else { 
			System.out.println("현금이 부족합니다. ");
		}
		
		
		
		System.out.println("장바구니의 갯수 : " + cus.bag);
		
		
		System.out.println("남은 현금 : "+ cus.buyer(sell.itemSell) );
		
		
		
		
		
		
	}
}
