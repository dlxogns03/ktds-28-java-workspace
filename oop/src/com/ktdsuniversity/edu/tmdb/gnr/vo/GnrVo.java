package com.ktdsuniversity.edu.tmdb.gnr.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class GnrVo {
	private String gnrId;
	private String nm;
	
	//하나의 장르에는 여러개의 영화가 있다 
	private List<MvVo> mvVoList;
	
	public String getGnrId() {
		return gnrId;
	}
	public void setGnrId(String gnrId) {
		this.gnrId = gnrId;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	
	
	public List<MvVo> getMvVoList() {
		return this.mvVoList;
	}
	public void setMvVoList(List<MvVo> mvVoList) {
		this.mvVoList = mvVoList;
	}
	@Override
	public String toString() {
		return "GnrVo [gnrId=" + gnrId + ", nm=" + nm + "]";
	}
	
	
}
