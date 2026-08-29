package com.ktdsuniversity.edu.tmdb.mvgnr.vo;

public class MvGnrVo {
	private String mvGnrId;
	private String mvId;
	private String gnrId2;
	public String getMvGnrId() {
		return mvGnrId;
	}
	public void setMvGnrId(String mvGnrId) {
		this.mvGnrId = mvGnrId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getGnrId2() {
		return gnrId2;
	}
	public void setGnrId2(String gnrId2) {
		this.gnrId2 = gnrId2;
	}
	@Override
	public String toString() {
		return "MvGnrVo [mvGnrId=" + mvGnrId + ", mvId=" + mvId + ", gnrId2=" + gnrId2 + "]";
	}
	
	
}
