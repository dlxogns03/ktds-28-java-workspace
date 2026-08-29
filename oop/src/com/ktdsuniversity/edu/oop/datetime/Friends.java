package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Friends  {
	
//	private String name;
//	private LocalDate birthday;
//	
//	
//	public void addFriends(String name, LocalDate birthday) {
//		this.name = name;
//		this.birthday = birthday;
//	}
	
	private List<Friend> friends;
	
	public Friends() {
		this.friends = new ArrayList<>();
		
	}
	
	
	public void addFriend(Friend firend) {
		this.friends.add(firend);
		
	}
	
	public List<Friend> findFriendsBy(int days){
		List<Friend> foundFriends = new ArrayList<>();
		
		//오늘 날짜에서 3일 이전의 날짜를 구한다 
		
		LocalDate now = LocalDate.now();
		LocalDate past = now.plusDays(-days);
		
		//오늘 날짜에서 3일 이후의 날짜를 구한다.
		
		LocalDate future = now.plusDays(days);
		
		
		//친구들의 생일날짜에서 연도만 현재로 바꾼다.
		for(int i = 0; i< this.friends.size(); i++)	{
			
			LocalDate bir = this.friends.get(i).getBirthday().withYear(now.getYear());
			
			if(bir.isAfter(past) && bir.isBefore(future)) {
				foundFriends.add(this.friends.get(i));
			}
			else if(bir.isEqual(past)||bir.isEqual(future)) {
				foundFriends.add(this.friends.get(i));
			}
			
			
		}
		
		
		//친구들의 생일이 오늘의 3일 이전날짜보다 이후이면서 오늘보다 이전이면 FoundFriends에 추가.
		//친구들의 생일이 오늘의 3일 이후날짜보다 이후이면서 오늘보다 이전이면 FoundFriends에 추가.
		//오늘과 같으면 추가 
		return foundFriends;
	}


	@Override
	public String toString() {
		return "Friends [friends=" + friends + "]";
	}


	

}
