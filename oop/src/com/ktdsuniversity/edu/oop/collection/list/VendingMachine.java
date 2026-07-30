package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.vendingmachine.Item;

public class VendingMachine {
	
	ItemHolder holder;
	
	public VendingMachine(ItemHolder holder) {
		this.holder = holder;
		
	}
	
	/*패키지 이름을 짓는 규칙 
	 * a 회사 - 홈페이지 =>https://exam.com
	 * app 내부의 패키지 => 도메인의 역순 (com.exam)
	 * 
	 * 
	 * app 이름 : "고객사 관리"
	 * -> partner management 
	 * -> 패키지 전체 이름 : 도메인역순 + 업무의 이름
	 * -> 전부 소문자로 작성.
	 * -> . 을 제외한 특수기호 x
	 * -> 숫자x
	 */
	
	//자판기에 새로운 라면을 추가한다.
	public void addNewItem(Item newItem) {
		
		this.holder.items.add(newItem);
		
	}
	
	public static void main(String[] args) {
		
		
		List<Item> 라면들 = new ArrayList<>();
		라면들.add(new Item("1", "너구리",3500, 3));
		라면들.add(new Item("2", "진라면",2000, 5));
		라면들.add(new Item("3", "신라면",3000, 7));
		
		
		ItemHolder 라면홀더 = new ItemHolder(라면들);
		
		System.out.println();
	
		VendingMachine 한강라면 = new VendingMachine(라면홀더);
		한강라면.addNewItem(new Item("4", "참깨라면", 4500, 2));
		
		라면홀더.items.get(3).getName();
		
		한강라면.holder.items.get(0).getName();
		
		
		
	}
	
	
	

}
