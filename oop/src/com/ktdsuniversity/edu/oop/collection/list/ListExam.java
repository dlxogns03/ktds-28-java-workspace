package com.ktdsuniversity.edu.oop.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.exceptions.Goods;

public class ListExam {
	
	public static void main(String[] args) {
		
		//정수를 관리하는 리스트 생성.
		
		//java.utill.List
		//java.utill.arrylist
		//Ctrl + shift + o
		List<Integer> decimalList = new ArrayList<>();
		
		
		//리스트에 정수가 몇개가 있나
		int size = decimalList.size();
		System.out.println(size);
		
		
		//리스트에 맞는 타입의 값 추가 
		decimalList.add(1134); //0번 인덱스
		decimalList.add(3400); //1번 인덱스 
		
		
		
		//리스트에 정수가 몇개가 있나
		size = decimalList.size();
		System.out.println(size);
		
		int value0 = decimalList.get(0);
		System.out.println(value0);
		
		int value1 = decimalList.get(1);
		System.out.println(value1);
		
		//리스트의 2번 인덱스의 값을 가져온다.
		
		if(decimalList.size() > 2) {
			int value2 = decimalList.get(2);
			System.out.println(value2);
		}
		
		//리스트의 0번 인덱스를 삭제한다.
		//리스트의 0번 인덱스를 삭제하고 , 해당 인덱스에 있던 값을 반환시킨다.
		
		int removedValue = decimalList.remove(0);
		System.out.println(removedValue + "삭제됨");
		
		
		//삭제한 이후 리스트 사이즈 
		size = decimalList.size();
		System.out.println(size);
		
		// 리스트의 1번 인덱스를 가져온다.
		value1 = decimalList.get(0);
		System.out.println(value1);
		
		
		//리스트에 10개의 랜덤값으 추가한다.
		for(int i = 0; i < 10; i ++) {
			decimalList.add((int) (Math.random() * 1000));
			
		}
		
		System.out.println(decimalList.size()+ "개의 정수가 있음");
		
		
		//리스트에 있는 모든 데이터를 지워
		decimalList.clear();
		
		//삭제한 이후 리스트 사이즈 
		size = decimalList.size();
		System.out.println(size);
		
		//리스트에 100,200,300,400,500,600 숫자를 순서대로 할당한다
		
		decimalList.add(100);
		decimalList.add(200);
		decimalList.add(300);
		decimalList.add(400);
		decimalList.add(500);
		decimalList.add(600);
		
		//리스트에 100이 존재하는가 
		if(decimalList.contains(100)) {
			System.out.println("100이 존재합니다");
		}
		
		//리스트에 200이 존재하는가
		if (decimalList.contains(200)) {
			System.out.println(decimalList.contains(200));
		}
		//리스트에 305가 존재하는가 
		if(decimalList.contains(305)) {
			System.out.println("305가 존재합니다");
		}
		
		//리스트에 들어있는 모든 항목을 출력하낟.
		System.out.println(decimalList);
		
		for(int i = 0 ; i < decimalList.size() ; i ++) {
			System.out.println(decimalList.get(i) + "이(가) 있습니다");
		}
		
		Goods newGoods = new Goods("상품1", 500);
		Goods otherGoods = new Goods("상품1", 500);
		
		Goods clone = otherGoods;
		
		System.out.println(clone == newGoods);
		System.out.println(clone == otherGoods);
		
		System.out.println("goods equals : " + newGoods.equals(otherGoods));
		
		List<Goods> goodsList = new ArrayList<>();
		
		
		
		//goodsList에 Goods 인스턴스를 추가한다.
		//goodsList에 Goods 인스턴스를 추가한다.
		//goodsList에 Goods 인스턴스를 추가한다.
		goodsList.add(new Goods ("에스프레소", 1000 ));
		goodsList.add(new Goods ("상품1", 500 ));
		goodsList.add(new Goods ("카페라떼", 3000 ));
		
		//goodsList의 n번째 인덱스에 있는 goods 인스턴스를 가져와 출력한다
		System.out.println(goodsList.get(0).getName() + " " + goodsList.get(0).getPrice());
		System.out.println(goodsList.get(1).getName() + " " + goodsList.get(0).getPrice());
		System.out.println(goodsList.get(2).getName() + " " + goodsList.get(0).getPrice());
		
		//goodsList의 모든 Goods인스턴스를 출력한다
		for(int i = 0 ; i < goodsList.size(); i++) {
			System.out.println("이름 : " + goodsList.get(i).getName());
			System.out.println("가격 : " + goodsList.get(i).getPrice());
		}
		
		
		//goodsListdptj 상품의 이름이 "상품1"이고 가격이 500인 상품이 존재하는가?
		
		boolean haveGoods = goodsList.contains(new Goods("상품1",500));
		System.out.println(haveGoods);
		
		
		//goodsListdptj 상품의 이름이 "상품11"이고 가격이 5000인 상품이 존재하는가?
		
		haveGoods = goodsList.contains(new Goods("상품11",5000));
		System.out.println(haveGoods);
	}

}
