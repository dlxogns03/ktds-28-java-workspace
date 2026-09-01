package com.ktdsuniversity.edu.tmdb.bckgrnd.vo;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class BckgrndVo {
	private String bckgrdId;
	private String mvId;
	private String bckgrd;
	
	//하나의 배경은 하나의 영화를 위한것이다
	private MvVo mvVo;
	
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
	
	
	
	public MvVo getMvVo() {
		return this.mvVo;
	}
	public void setMvVo(MvVo mvVo) {
		this.mvVo = mvVo;
	}
	
	@Override
	public String toString() {
		return "BckgrndVo [bckgrdId=" + bckgrdId + ", mvId=" + mvId + ", bckgrd=" + bckgrd + "]";
	}
	
	

}
