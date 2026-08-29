package com.ktdsuniversity.edu.tmdb.appr.vo;

public class ApprVo {
	private String apprId;
	private String invlvdId;
	private String mvId;
	private String rl;
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
	@Override
	public String toString() {
		return "ApprVo [apprId=" + apprId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + "]";
	}
	
	
	
	
}
