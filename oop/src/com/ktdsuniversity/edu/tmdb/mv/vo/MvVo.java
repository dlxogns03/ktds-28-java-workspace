package com.ktdsuniversity.edu.tmdb.mv.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVo;
import com.ktdsuniversity.edu.tmdb.bckgrnd.vo.BckgrndVo;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVo;
import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVo;
import com.ktdsuniversity.edu.tmdb.kwrd.vo.KwrdVo;
import com.ktdsuniversity.edu.tmdb.pstr.vo.PstrVo;
import com.ktdsuniversity.edu.tmdb.vd.vo.VdVo;

public class MvVo {
	private String mvId;
	private String ttl;
	private String rlsDt;
	private String mvRating;
	private int rnngTm;
	private String smmr;
	private String mainPstrUrl;
	private String xUrl;
	private String instgrmUrl;
	private String fcBkUrl;
	private String tgln;
	private String orgnlTtl;
	private String shwng;
	private long bdgt;
	private long bxOffcRvn;
	private String lnng;
	
	//하나의 영화는 여러개의 동영상을 가지고 있다.
	private List<VdVo> vdList;
	
	//하나의 영화는 여러개의 배경을 가지고 있다.
	private List<BckgrndVo> bckgrndList;
	
	//하나의 영화는 여러개의 포스터를 가지고 있다.
	private List<PstrVo> pstrList;
	
	
	//하나의 영화는 여러명이 제작했다.
	private List<FlmmkrVo> flmmkrList;
	
	//하나의 영화에 여러명이 출연했다.
	private List<ApprVo> apprVoList;
	
	//하나의 영화는 여러개의 장르가 있다.
	private List<GnrVo> gnrVoList;
	
	//하나의 영화는 여러개의 키워드가 있다.
	private List<KwrdVo> kwrdVoList;
	
	public String getMvId() {
		return mvId;
	}
	public void setMvId(String mvId) {
		this.mvId = mvId;
	}
	public String getTtl() {
		return ttl;
	}
	public void setTtl(String ttl) {
		this.ttl = ttl;
	}
	public String getRlsDt() {
		return rlsDt;
	}
	public void setRlsDt(String rlsDt) {
		this.rlsDt = rlsDt;
	}
	public String getMvRating() {
		return mvRating;
	}
	public void setMvRating(String mvRating) {
		this.mvRating = mvRating;
	}
	public int getRnngTm() {
		return rnngTm;
	}
	public void setRnngTm(int rnngTm) {
		this.rnngTm = rnngTm;
	}
	public String getSmmr() {
		return smmr;
	}
	public void setSmmr(String smmr) {
		this.smmr = smmr;
	}
	public String getMainPstrUrl() {
		return mainPstrUrl;
	}
	public void setMainPstrUrl(String mainPstrUrl) {
		this.mainPstrUrl = mainPstrUrl;
	}
	public String getxUrl() {
		return xUrl;
	}
	public void setXUrl(String xUrl) {
		this.xUrl = xUrl;
	}
	public String getInstgrmUrl() {
		return instgrmUrl;
	}
	public void setInstgrmUrl(String instgrmUrl) {
		this.instgrmUrl = instgrmUrl;
	}
	public String getFcBkUrl() {
		return fcBkUrl;
	}
	public void setFcBkUrl(String fcBkUrl) {
		this.fcBkUrl = fcBkUrl;
	}
	public String getTgln() {
		return tgln;
	}
	public void setTgln(String tgln) {
		this.tgln = tgln;
	}
	public String getOrgnlTtl() {
		return orgnlTtl;
	}
	public void setOrgnlTtl(String orgnlTtl) {
		this.orgnlTtl = orgnlTtl;
	}
	public String getShwng() {
		return shwng;
	}
	public void setShwng(String shwng) {
		this.shwng = shwng;
	}
	public long getBdgt() {
		return bdgt;
	}
	public void setBdgt(long bdgt) {
		this.bdgt = bdgt;
	}
	public long getBxOffcRvn() {
		return bxOffcRvn;
	}
	public void setBxOffcRvn(long bxOffcRvn) {
		this.bxOffcRvn = bxOffcRvn;
	}
	public String getLnng() {
		return lnng;
	}
	public void setLnng(String lnng) {
		this.lnng = lnng;
	}
	
	
	
	
	public List<VdVo> getVdList() {
		return this.vdList;
	}
	public void setVdList(List<VdVo> vdList) {
		this.vdList = vdList;
	}
	public List<BckgrndVo> getBckgrndList() {
		return this.bckgrndList;
	}
	public void setBckgrndList(List<BckgrndVo> bckgrndList) {
		this.bckgrndList = bckgrndList;
	}
	public List<PstrVo> getPstrList() {
		return this.pstrList;
	}
	public void setPstrList(List<PstrVo> pstrList) {
		this.pstrList = pstrList;
	}
	
	
	public List<FlmmkrVo> getFlmmkrList() {
		return this.flmmkrList;
	}
	public void setFlmmkrList(List<FlmmkrVo> flmmkrList) {
		this.flmmkrList = flmmkrList;
	}
	public List<ApprVo> getApprVoList() {
		return this.apprVoList;
	}
	public void setApprVoList(List<ApprVo> apprVoList) {
		this.apprVoList = apprVoList;
	}
	public List<GnrVo> getGnrVoList() {
		return this.gnrVoList;
	}
	public void setGnrVoList(List<GnrVo> gnrVoList) {
		this.gnrVoList = gnrVoList;
	}
	public List<KwrdVo> getKwrdVoList() {
		return this.kwrdVoList;
	}
	public void setKwrdVoList(List<KwrdVo> kwrdVoList) {
		this.kwrdVoList = kwrdVoList;
	}
	
	
	@Override
	public String toString() {
		return "MvVo [mvId=" + mvId + ", ttl=" + ttl + ", rlsDt=" + rlsDt + ", mvRating=" + mvRating + ", rnngTm="
				+ rnngTm + ", smmr=" + smmr + ", mainPstrUrl=" + mainPstrUrl + ", xUrl=" + xUrl + ", instgrmUrl="
				+ instgrmUrl + ", fcBkUrl=" + fcBkUrl + ", tgln=" + tgln + ", orgnlTtl=" + orgnlTtl + ", shwng=" + shwng
				+ ", bdgt=" + bdgt + ", bxOffcRvn=" + bxOffcRvn + ", lnng=" + lnng + "]";
	}
	
	
}
