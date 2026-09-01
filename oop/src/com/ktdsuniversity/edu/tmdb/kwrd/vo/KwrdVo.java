package com.ktdsuniversity.edu.tmdb.kwrd.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class KwrdVo {
	private String kwrdId;
	private String kwrd;
	
	//하나의 키워드에는 여러개의 영화가 있다 .
	private List<MvVo> mvVoList;
	
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
	
	
	public List<MvVo> getMvVoList() {
		return this.mvVoList;
	}
	public void setMvVoList(List<MvVo> mvVoList) {
		this.mvVoList = mvVoList;
	}
	@Override
	public String toString() {
		return "KwrdVo [kwrdId=" + kwrdId + ", kwrd=" + kwrd + "]";
	}
	
	
}
