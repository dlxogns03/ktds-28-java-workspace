package com.ktdsuniversity.edu.tmdb.vd.vo;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class VdVo {
	private String vdId;
	private String mvId;
	private String vdUrl;
	
	//하나의 영상은 하나의 영화를 위한것이다.
	private MvVo mvVo;
	
	
	public String getVdId() {
		return vdId;
	}
	public void setVdId(String vdId) {
		this.vdId = vdId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getVdUrl() {
		return vdUrl;
	}
	public void setVdUrl(String vdUrl) {
		this.vdUrl = vdUrl;
	}
	
	
	
	
	public MvVo getMvVo() {
		return this.mvVo;
	}
	public void setMvVo(MvVo mvVo) {
		this.mvVo = mvVo;
	}
	@Override
	public String toString() {
		return "VdVo [vdId=" + vdId + ", mvId=" + mvId + ", vdUrl=" + vdUrl + "]";
	}
	
	
	
	
}
