package com.ktdsuniversity.edu.tmdb.pstr.vo;

public class PstrVo {
	private String pstrId;
	private String mvId;
	private String pstrUrl;
	
	public String getPstrId() {
		return pstrId;
	}
	public void setPstrId(String pstrId) {
		this.pstrId = pstrId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getPstrUrl() {
		return pstrUrl;
	}
	public void setPstrUrl(String pstrUrl) {
		this.pstrUrl = pstrUrl;
	}
	@Override
	public String toString() {
		return "PstrVo [pstrId=" + pstrId + ", mvId=" + mvId + ", pstrUrl=" + pstrUrl + "]";
	}
	
	
}
