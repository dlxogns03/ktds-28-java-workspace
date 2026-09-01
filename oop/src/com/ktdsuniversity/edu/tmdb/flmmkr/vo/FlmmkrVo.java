package com.ktdsuniversity.edu.tmdb.flmmkr.vo;

import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVo;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class FlmmkrVo {
	private String flmmkrId;
	private String invlvdId;
	private String mvId;
	private String rl;
	private String prt;
	
	// 한명의 참여자가 하나의 영화를 제작했다.
	private MvVo mvVo;
	
	// 제작자 한 명에 대한 참여자 정보
	private InvlvdVo invlvdVo;
	
	public String getFlmmkrId() {
		return flmmkrId;
	}
	public void setFlmmkrId(String flmmkrId) {
		this.flmmkrId = flmmkrId;
	}
	public String getInvlvdId() {
		return invlvdId;
	}
	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getRl() {
		return rl;
	}
	public void setRl(String rl) {
		this.rl = rl;
	}
	public String getPrt() {
		return prt;
	}
	public void setPrt(String prt) {
		this.prt = prt;
	}
	
	
	public MvVo getMvVo() {
		return this.mvVo;
	}
	public void setMvVo(MvVo mvVo) {
		this.mvVo = mvVo;
	}
	public InvlvdVo getInvlvdVo() {
		return this.invlvdVo;
	}
	public void setInvlvdVo(InvlvdVo invlvdVo) {
		this.invlvdVo = invlvdVo;
	}
	
	@Override
	public String toString() {
		return "FlmmkrVo [flmmkrId=" + flmmkrId + ", invlvdId=" + invlvdId + ", mvId=" + mvId + ", rl=" + rl + ", prt="
				+ prt + "]";
	}
	
	
}
