package com.ktdsuniversity.edu.oop.exam;

public class CraneGameMachine {
	
	
	public boolean isInsertCoin;
	int dolls;
	
	
	
	public void insertCoin() {
		/*	
		if(isInsertCoin) {
			if(dolls > 0 ) {
				System.out.println("게임을 시작합니다.");;
				
			}
			
		}else {
			
			System.out.println("코인을 넣어주세요 ");
		}
		
		불필요한 비교식
		*/
		isInsertCoin = dolls > 0;
		
	}
	
	
	public int doGame() {
		
		if(isInsertCoin) {
			int crane = (int)(Math.random() * 2);
			if(crane > 0) {
				System.out.println("인형을 " + crane + "개 뽑았습니다");
				dolls -= crane;
				isInsertCoin = false;
				return crane; 
			}
			
			
		}
		System.out.println("뽑지 못했습니다. ");
		
		return 0;
	}

}
