package com.ktdsuniversity.edu.oop.memberservice;

public class Service implements MemberService{

	@Override
	public void join() {
		System.out.println("일반회원 가입 되었습니다");
		
	}

	@Override
	public void login() {
		System.out.println("일반회원 로그인 되었습니다");
		
	}

	@Override
	public void deleteMe() {
		System.out.println("일반회원 탈퇴되었습니다");
		
	}

	@Override
	public void logout() {
		System.out.println("로그아웃되었습니다");
		
	}

}
