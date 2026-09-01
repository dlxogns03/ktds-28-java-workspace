package com.ktdsuniversity.edu.tmdb.appr.vo;

import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVo;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class ApprVo {
	private String apprId;
	private String invlvdId;
	private String mvId;
	private String rl;
	
	//출연자 한명이 하나의 영화에 출연했다.
	private MvVo mvVo;
	
	//출연자의 정보 
	private InvlvdVo invlvdVo;
	
	public String getApprId() {
		return apprId;
	}
	public void setApprId(String apprId) {
		this.apprId = apprId;
	}
	public String getInvlvdId() {
		return invlvdId;
	}
	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getRl() {
		return rl;
	}
	public void setRl(String rl) {
		this.rl = rl;
	}
	
	public MvVo getMvVo() {
		return this.mvVo;
	}
	public void setMvVo(MvVo mvVo) {
		this.mvVo = mvVo;
	}
	public InvlvdVo getInvlvdVo() {
		return this.invlvdVo;
	}
	public void setInvlvdVo(InvlvdVo invlvdVo) {
		this.invlvdVo = invlvdVo;
	}
	@Override
	public String toString() {
		return "ApprVo [apprId=" + apprId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + "]";
	}
	
	
	
	
}
