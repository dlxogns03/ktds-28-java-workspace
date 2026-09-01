package com.ktdsuniversity.edu.tmdb.pstr.vo;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class PstrVo {
	private String pstrId;
	private String mvId;
	private String pstrUrl;
	
	
	//하나의 포스터는 하나의 영화를 위한것이다.
	private MvVo mvVo;
	
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
