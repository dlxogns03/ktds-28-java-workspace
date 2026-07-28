package com.ktdsuniversity.edu.oop.memberservice;

public class VipService implements VipMemberService{
	
	
	
	
	@Override
	public void join() {
		System.out.println("Vip 회원가입되었습니다");
		
	}

	@Override
	public void login() {
		System.out.println("Vip 로그인 되었습니다.");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("Vip 회원 탈퇴 되었습니다.");
		
	}

	@Override
	public void logout() {
		System.out.println("(vip) 로그아웃 되었습니다. ");
		
	}

	@Override
	public void addPoint(int point) {

		System.out.println(point + "점 포인트 지급");
		
	}
	
	

}
