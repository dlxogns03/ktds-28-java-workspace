package com.ktdsuniversity.edu.oop.mart;

public class Seller {
	
	// 멤버 번슈 : 단일 상품의 재고 , 상품의 단가, 매출액 , 판매개수 
	/*
	 * 재고 
	 */
	int stock;
	/*
	 * 단가
	 */
	int unitprice;
	/*
	 * 매출액
	 */
	int amount;
	/*
	 * 총 판매개수
	 */
	
	int saleCount;
	
	
	
	
	public Seller(int stock, int unitPrice, int amount, int saleCount) {
		this.amount = amount;
		this.saleCount = saleCount;
		this.unitprice = unitPrice;
		this.stock = stock;
		
	}
	
	//기능 : 판매
	
	/*
	 * 판매 
	 * @param orderQuantity 판매개수 
	 */
	
	public void sell(int orderQuantity) {
		this.amount += this.unitprice * orderQuantity;
		this.stock -= orderQuantity;
		this.saleCount += orderQuantity;
	}
	
	
	/*
	 * 판매자의 정보 출력
	 */
	
	public void printStatus() {
		System.out.println("판매자의 정보");
		System.out.println("현재 재고 : "+ this.stock);
		System.out.println("판매 상품 단가 : " + this.unitprice);
		System.out.println("총 매출액 : " +this.amount);
		System.out.println("총 판매수 : " + this.saleCount);
	}
	
	
	
	
	

}
