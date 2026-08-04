package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.List;

public class Talk {
	
	public static void main(String[] args) {
		Friends talk = new Friends();
		
		talk.addFriend(new Friend("친구1", LocalDate.parse("2000-07-29")));
		talk.addFriend(new Friend("친구2", LocalDate.parse("2000-08-02")));
		talk.addFriend(new Friend("친구3", LocalDate.parse("2000-08-03")));
		talk.addFriend(new Friend("친구4", LocalDate.parse("2000-08-04")));
		talk.addFriend(new Friend("친구5", LocalDate.parse("2000-08-05")));
		talk.addFriend(new Friend("친구6", LocalDate.parse("2000-08-06")));
		talk.addFriend(new Friend("친구7", LocalDate.parse("2000-08-07")));
		talk.addFriend(new Friend("친구7", LocalDate.parse("2000-08-08")));
		talk.addFriend(new Friend("친구7", LocalDate.parse("2000-08-09")));
		talk.addFriend(new Friend("친구7", LocalDate.parse("2000-08-10")));
		talk.addFriend(new Friend("친구7", LocalDate.parse("2000-08-11")));
		
		
		
		
		
		//오늘로부터 3일 전후로 생일을 맞이하는 생일 친구목록
		//2026-08-04기준 2026-08-01부터 2026-08-07까지
		
		List<Friend> SpecialFriends =talk.findFriendsBy(3);
		
		for(int i = 0 ; i <SpecialFriends.size(); i++) {
			System.out.println(SpecialFriends.get(i));
			
		}
	}

}
