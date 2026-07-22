package com.ktdsuniversity.edu.oop.mart;

public class Mart {
	public static void main(String[] args) {
		Seller auction = new Seller(10,1000,0,0);
		Seller naverSmartStore = new Seller(10,1500,3*1500,3);
		
		Buyer me = new Buyer(7000, 0);
		//내가 auction에서 3개를 구매한다 .
		me.buy(3,auction);
		auction.sell(3);
		
		me.printStatus();
		auction.printStatus();
		
		//내가 naverSmarStore에서2개를 구매한다.
		me.buy(2, naverSmartStore);
		naverSmartStore.sell(2);
		
		me.printStatus();
		naverSmartStore.printStatus();
		
		
		System.out.println("==========");
		//내가 auction에서 2개를 구매한다.
		int boughtCount = me.buy(2, auction);
		auction.sell(2);
		
		me.printStatus();
		naverSmartStore.printStatus();
		
		
		System.out.println("======================");
		//내가 auction에서 9개를 더 구매하겠다.
		me.buy(9, auction);
		auction.sell(boughtCount);
		
		me.printStatus();
		auction.printStatus();
	}

}
