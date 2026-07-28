package com.ktdsuniversity.edu.oop.memberservice;

public interface VipMemberService extends MemberService{
	
	/**회원에게 포인트지급 */
	void addPoint(int point);

}
