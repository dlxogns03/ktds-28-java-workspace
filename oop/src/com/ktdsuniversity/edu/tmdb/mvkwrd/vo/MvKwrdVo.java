package com.ktdsuniversity.edu.tmdb.mvkwrd.vo;

public class MvKwrdVo {
	private String mvKwrdId;
	private String mvId;
	private String kwrdId2;
	public String getMvKwrdId() {
		return mvKwrdId;
	}
	public void setMvKwrdId(String mvKwrdId) {
		this.mvKwrdId = mvKwrdId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getKwrdId2() {
		return kwrdId2;
	}
	public void setKwrdId2(String kwrdId2) {
		this.kwrdId2 = kwrdId2;
	}
	@Override
	public String toString() {
		return "MvKwrdVo [mvKwrdId=" + mvKwrdId + ", mvId=" + mvId + ", kwrdId2=" + kwrdId2 + "]";
	}
	
	
}
