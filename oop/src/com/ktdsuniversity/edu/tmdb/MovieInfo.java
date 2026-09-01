
package com.ktdsuniversity.edu.tmdb;
import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVo;
import com.ktdsuniversity.edu.tmdb.bckgrnd.vo.BckgrndVo;
import com.ktdsuniversity.edu.tmdb.common.utills.DBConnector;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVo;
import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVo;
import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVo;
import com.ktdsuniversity.edu.tmdb.kwrd.vo.KwrdVo;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;
import com.ktdsuniversity.edu.tmdb.pstr.vo.PstrVo;
import com.ktdsuniversity.edu.tmdb.vd.vo.VdVo;

public class MovieInfo {

	private DBConnector connector;

	public MovieInfo() {
		this.connector = DBConnector.builder()
								    .setDriverClassName("oracle.jdbc.driver.OracleDriver")
								    .setUrl("jdbc:oracle:thin:@localhost:1521:XE")
								    .setSchemaName("TMDB")
								    .setPassword("TMDB")
								    .connect();
	}

	public MvVo selectMovie(String mvId) {

		StringBuffer query = new StringBuffer();
		query.append("SELECT MV_ID  							   ");
		query.append("	   , TTL								   ");
		query.append("	   , TO_CHAR(RLS_DT,'YYYY-MM-DD') AS RLS_DT");
		query.append("	   , MV_RTNG							   ");
		query.append("	   , RNNG_TM							   ");
		query.append("	   , SMMR								   ");
		query.append("	   , MAIN_PSTR_URL						   ");
		query.append("	   , X_URL 								   ");
		query.append("	   , INSTGRM_URL 						   ");
		query.append("	   , FC_BK_URL							   ");
		query.append("	   , TGLN								   ");
		query.append("	   , ORGNL_TTL							   ");
		query.append("	   , SHWNG								   ");
		query.append("	   , BDGT								   ");
		query.append("	   , BX_OFFC_RVN						   ");
		query.append("	   , LNNG								   ");
		query.append("	   , DEL_YN  							   ");
		query.append("  FROM MV									   ");
		query.append(" WHERE DEL_YN = 'N'            			   ");
		query.append("   AND MV_ID = ?                			   ");

		return connector.selectBuilder(MvVo.class, query)
						.setParams(pstmt -> pstmt.setString(1,mvId))
						.selectOne();
	}
	
	public void setGenres(MvVo movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT G.GNR_ID ");
		query.append("	, G.NM ");
		query.append("  FROM GNR G");
		query.append(" INNER JOIN MV_GNR MG");
		query.append("    ON G.GNR_ID = MG.GNR_ID ");
		query.append(" WHERE MG.MV_ID = ?  ");
		
		List<GnrVo> genres = this.connector.selectBuilder(GnrVo.class, query)
					  						.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
					  						.selectList();
		movie.setGnrVoList(genres);
	}
	
	public void setKeywords(MvVo movie) {
		StringBuffer query = new StringBuffer();
//		query.append("SELECT MK.KWRD_ID                 	  ");
//		query.append("  FROM MV_KWRD mk                 	  ");
//		query.append(" WHERE mk.MV_ID = (SELECT M.MV_ID 	  ");
//		query.append(" 				       FROM MV m          ");
//		query.append(" 				      WHERE M.MV_ID = ?)  ");
		 				
		query.append("SELECT mk.KWRD_ID                              ");
		query.append(" FROM MV m                                     ");
		query.append("INNER JOIN MV_KWRD mk                          ");
		query.append("   ON m.MV_ID = mk.MV_ID                       ");
		query.append("WHERE m.MV_ID = ?							     ");
		                                                               
		List<KwrdVo> kwrds = this.connector.selectBuilder(KwrdVo.class, query)
										   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
										   .selectList();
		movie.setKwrdVoList(kwrds);
	}
	
	public void setVideos(MvVo movie) {
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT v.MV_ID                                                   ");
		query.append("	 , v.VD_URL                                                   ");
		query.append("  FROM VD v                                                      ");
		query.append(" WHERE v.MV_ID  = (SELECT M.MV_ID                                ");
		query.append("			         FROM MV m                                    ");
		query.append("			        WHERE M.MV_ID = ?) ");
	 	
		List<VdVo> vdVo = this.connector.selectBuilder(VdVo.class, query)
									    .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
									    .selectList()
									    ;
		movie.setVdList(vdVo);
	}
	
	public void setBackgrounds(MvVo movie) {
		StringBuffer query = new StringBuffer(); 
		query.append("SELECT b.MV_ID                        ");
		query.append("     , b.BCKGRD_ID                    ");
	    query.append("  FROM BCKGRND b                      ");
	    query.append(" WHERE b.MV_ID  = (SELECT M.MV_ID     ");
	 	query.append("			         FROM MV m          ");
	 	query.append("			        WHERE M.MV_ID = ?)  ");
	 	
	 	List<BckgrndVo> bckgrndvo = this.connector.selectBuilder(BckgrndVo.class, query)
	 									.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
	 									.selectList()
	 									;
	 	movie.setBckgrndList(bckgrndvo);
	}
	
	public void setPosters(MvVo movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT p.MV_ID                                                   ");
		query.append(", p.PSTR_URL                                                     ");
		query.append("FROM PSTR p                                                      ");
		query.append("WHERE p.MV_ID  = (SELECT M.MV_ID                                 ");
	 	query.append("			 		FROM MV m                                      ");
	 	query.append("			 		WHERE M.MV_ID = ?)  						   ");
	 	
	 	List<PstrVo> pstrVo = this.connector.selectBuilder(PstrVo.class, query)
	 							.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
	 							.selectList();
	 	movie.setPstrList(pstrVo);
	}
	
	public void setCasts(MvVo movie) {
		//출연진 조회 Mv has a Appr
		final StringBuffer query = new StringBuffer();
		query.append("SELECT a.APPR_ID                            	 ");
		query.append("	, a.INVLVD_ID                                ");
		query.append("	, a.MV_ID                                    ");
		query.append("	, a.RL                                       ");
		query.append("  FROM APPR a                                  ");
		query.append("  WHERE a.MV_ID = ? 							 ");
		List<ApprVo> appears = this.connector.selectBuilder(ApprVo.class, query)
								.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
								.selectList()
								;
		movie.setApprVoList(appears);
		// appr has a invlvd
		query.delete(0, query.length());
		query.append("SELECT i.INVLVD_ID                        ");
		query.append("     , i.INVLVD_NM                        ");
		query.append("     , i.INVLVD_PHT                       ");
		query.append("  FROM INVLVD i                           ");
		query.append(" WHERE i.INVLVD_ID = ?                    ");
		appears.forEach(appr -> {
			//람다 함수 내부에서는 외부의 지역변수를 사용할 수 없다.
			// 람다함수 내부에서 사용할 수 있는 것? => 람내 내부의 지역변수 람다 외부의 상수, 멤버변수 만 사용가능
			// jvm이 병렬로 람다가 돌아갈지 직렬로 돌라갈지 알수 없다 외부에 있는 지역변수가 변경이 될수 있기 때문에 
			// 인스턴스 상수는 메모리 값만 바뀌지 않으면 된다 안에 있는 값은 바꿀 수 있다
			InvlvdVo involved = this.connector.selectBuilder(InvlvdVo.class, query)
								.setParams(pstmt -> pstmt.setString(1, appr.getInvlvdId()))
								.selectOne();
			appr.setInvlvdVo(involved);
		});
	}
	
	public void setFilmmakers(MvVo movie) {
		// 제작진 조회 mv has a flmmkr
		final StringBuffer query = new StringBuffer();
		query.append("SELECT f.FLMMKR_ID                            ");
		query.append(", f.INVLVD_ID                                 ");
		query.append(", f.MV_ID                                     ");
		query.append(", f.PRT                                       ");
		query.append(", f.RL                                        ");
	    query.append("FROM FLMMKR f                                 ");
	    query.append("WHERE f.MV_ID = ?  						    ");
	    
	    List<FlmmkrVo> flmmkrs = this.connector.selectBuilder(FlmmkrVo.class, query)
	    				.setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
	    				.selectList();
	    movie.setFlmmkrList(flmmkrs);
		// flmmkr has a invlvd
	    query.delete(0, query.length());
	    query.append("SELECT i.INVLVD_ID                      ");
		query.append(", i.INVLVD_NM                           ");
		query.append(", i.INVLVD_PHT                          ");
	    query.append("FROM INVLVD i                           ");
	    query.append("WHERE i.INVLVD_ID = ?   ");
	    
	    flmmkrs.forEach(flmkr -> {
	    	InvlvdVo invlvdVo = this.connector.selectBuilder(InvlvdVo.class, query)
	    			  .setParams(pstmt -> pstmt.setString(1,flmkr.getInvlvdId()))
	    			  .selectOne();
	    	flmkr.setInvlvdVo(invlvdVo);
	    });
	}
	
	public static void main(String[] args) {
		
		MovieInfo movieinfo = new MovieInfo();
		
		MvVo movie = movieinfo.selectMovie("1-spider-man-brand-new-day");
		movieinfo.setGenres(movie);
		movieinfo.setKeywords(movie);
		movieinfo.setVideos(movie);
		movieinfo.setBackgrounds(movie);
		movieinfo.setPosters(movie);
		movieinfo.setCasts(movie);
		movieinfo.setFilmmakers(movie);
		
		System.out.println(movie);
		System.out.println("=".repeat(50));
		System.out.println("======장르명=====");
		movie.getGnrVoList().forEach(gnr -> System.out.println(gnr.getNm()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 키워드");
		movie.getKwrdVoList().forEach(kwrd -> System.out.println(kwrd.getKwrdId()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 동영상");
		movie.getVdList().forEach(vd -> System.out.println(vd.getVdUrl()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 배경");
		movie.getBckgrndList().forEach(bc -> System.out.println(bc.getBckgrdId()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 포스터");
		movie.getPstrList().forEach(ps -> System.out.println(ps.getPstrUrl()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 출연자");
		movie.getApprVoList().forEach(ap -> System.out.println(
							ap.getInvlvdVo().getInvlvdNm() + "-" + ap.getRl()));
		
		System.out.println("=".repeat(50));
		System.out.println("영화 제작자");
		movie.getFlmmkrList().forEach(fk -> System.out.println(
							fk.getInvlvdVo().getInvlvdNm() + "-" + fk.getRl()));
		//App 종료 직전 모든 Connection을 닫는다.
		movieinfo.connector.close();
	}
}
