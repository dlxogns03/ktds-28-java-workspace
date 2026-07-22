package com.ktdsuniversity.edu.oop.mart;

public class Buyer {
	
	//멤버 변수 : 현금, 장바구니 
	
	//현금
	int cash;
	/*장바구니*/
	int shoppingCart;
	
	
	public Buyer(int cash, int shoppingCart) {
		this.cash = cash;
		this.shoppingCart = shoppingCart;
	}
	
	//기능 : 구매 
	/*
	 * 구매자가 판매자로부터 상품을 구매한다.
	 * oerderQuantity 구매개수 
	 * seller 판매자 
	 * @return 최종 구매개수
	 */
	public int buy(int orderQuantity,Seller seller) {
		
		//총 구매 금액이 얼마인가 .
		int orderAmount = orderQuantity * seller.unitprice;
		if(this.cash < orderAmount) {
			return 0;
		}
		if(orderQuantity > seller.stock) {
			orderQuantity = seller.stock;
		}
		this.cash -= orderQuantity * seller.unitprice;
		this.shoppingCart += orderQuantity;
		
		seller.sell(orderQuantity);
		return orderQuantity;
		
	}
	
	public void printStatus() {
		System.out.println("구매자의 정보");
		System.out.println("보유 현금 : "+ this.cash);
		System.out.println("구매 상품 수 : " + this.shoppingCart);
	}

}
