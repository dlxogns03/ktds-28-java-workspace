package com.ktdsuniversity.edu.tmdb.bckgrnd.vo;

public class BckgrndVo {
	private String bckgrdId;
	private String mvId;
	private String bckgrd;
	
	
	public String getBckgrdId() {
		return bckgrdId;
	}
	public void setBckgrdId(String bckgrdId) {
		this.bckgrdId = bckgrdId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getBckgrd() {
		return bckgrd;
	}
	public void setBckgrd(String bckgrd) {
		this.bckgrd = bckgrd;
	}
	@Override
	public String toString() {
		return "BckgrndVo [bckgrdId=" + bckgrdId + ", mvId=" + mvId + ", bckgrd=" + bckgrd + "]";
	}
	
	

}
