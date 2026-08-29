package com.ktdsuniversity.edu.tmdb.flmmkr.vo;

public class FlmmkrVo {
	private String flmmkrId;
	private String invlvdId;
	private String mvId;
	private String rl;
	private String prt;
	public String getFlmmkrId() {
		return flmmkrId;
	}
	public void setFlmmkrId(String flmmkrId) {
		this.flmmkrId = flmmkrId;
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
	public String getPrt() {
		return prt;
	}
	public void setPrt(String prt) {
		this.prt = prt;
	}
	@Override
	public String toString() {
		return "FlmmkrVo [flmmkrId=" + flmmkrId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + ", prt="
				+ prt + "]";
	}
	
	
}
