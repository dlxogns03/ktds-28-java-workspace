package com.ktdsuniversity.edu.tmdb.kwrd.vo;

public class KwrdVo {
	private String kwrdId;
	private String kwrd;
	public String getKwrdId() {
		return kwrdId;
	}
	public void setKwrdId(String kwrdId) {
		this.kwrdId = kwrdId;
	}
	public String getKwrd() {
		return kwrd;
	}
	public void setKwrd(String kwrd) {
		this.kwrd = kwrd;
	}
	@Override
	public String toString() {
		return "KwrdVo [kwrdId=" + kwrdId + ", kwrd=" + kwrd + "]";
	}
	
	
}
