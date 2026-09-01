package com.ktdsuniversity.edu.tmdb.invlvd.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVo;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVo;

public class InvlvdVo {
	private String invlvdId;
	private String invlvdPht;
	private String invlvdNm;
	
	//참여자 한명이 여러 개의 영화를 제작했다.
	private List<FlmmkrVo> flmmkrList;
	
	// 참여자 한 명이 여러개의 영화에 출연했다.
	private List<ApprVo> apprVoList;
	
	public String getInvlvdId() {
		return invlvdId;
	}
	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}
	public String getInvlvdPht() {
		return invlvdPht;
	}
	public void setInvlvdPht(String invlvdPht) {
		this.invlvdPht = invlvdPht;
	}
	public String getInvlvdNm() {
		return invlvdNm;
	}
	public void setInvlvdNm(String invlvdNm) {
		this.invlvdNm = invlvdNm;
	}
	
	
	
	public List<FlmmkrVo> getFlmmkrList() {
		return this.flmmkrList;
	}
	public void setFlmmkrList(List<FlmmkrVo> flmmkrList) {
		this.flmmkrList = flmmkrList;
	}
	public List<ApprVo> getApprVoList() {
		return this.apprVoList;
	}
	public void setApprVoList(List<ApprVo> apprVoList) {
		this.apprVoList = apprVoList;
	}
	@Override
	public String toString() {
		return "ApprVo [invlvdId=" + invlvdId + ", invlvdPht=" + invlvdPht + ", invlvdNm=" + invlvdNm + "]";
	}
	
	
}
