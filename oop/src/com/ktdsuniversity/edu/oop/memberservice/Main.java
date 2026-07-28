package com.ktdsuniversity.edu.oop.memberservice;

public class Main {
	
	
	public static void main(String[] args) {
		//MemberService, VipMemberService의 인스턴스 생성.
		//VipMemberService is a MemberService
		
		//Service is a MemberService
		MemberService mem = new Service();
		
		//VipService is a VipMemberService
		VipMemberService vip = new VipService();
		
		//VipService is a MemberSErvice
		MemberService sys1 = new VipService();
		
		
		mem.login();
		mem.join();
		mem.deleteMe();
		mem.logout();
		
		
		
		vip.login();
		vip.addPoint(100);
		vip.join();
		vip.deleteMe();
		vip.logout();
		
		
		
		sys1.login();
		sys1.deleteMe();
		sys1.join();
		sys1.logout();
		if(sys1 instanceof VipMemberService vip1) {
			vip1.addPoint(50);
		}
		
	}
}

