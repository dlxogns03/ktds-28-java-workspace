package com.ktdsuniversity.edu.tmdb.invlvd.vo;

public class InvlvdVo {
	private String invlvdId;
	private String invlvdPht;
	private String invlvdNm;
	
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
	@Override
	public String toString() {
		return "ApprVo [invlvdId=" + invlvdId + ", invlvdPht=" + invlvdPht + ", invlvdNm=" + invlvdNm + "]";
	}
	
	
}
