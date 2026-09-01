package com.ktdsunivrsity.edu.tmdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVo;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVo;

public class ConnectionTest {

	public static MvVo selectMovie(String mvId) {

		// jdbc:oracle:thin:@//localhost:1521/XE

		// java --> oracle로 연결하기위한 URL
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		// Oracle에 접속하기 위한 인증 정보
		String userName = "TMDB";
		String password = "TMDB";
		Connection dbConnection = null;

		// Oracle로 접속
		try {
			dbConnection = DriverManager.getConnection(url, userName, password);
			// 연결한 스키마 이름을 출력
			System.out.println(dbConnection.getSchema());

		} catch (SQLException sqle) {
			throw new RuntimeException("데이터베이스에 연결할수 없습니다.", sqle);
		}

		StringBuffer query = new StringBuffer();
		query.append("SELECT MV_ID  ");
		query.append("	   , TTL");
		query.append("	   , TO_CHAR(RLS_DT,'YYYY-MM-DD') AS RLS_DT");
		query.append("	   , MV_RTNG");
		query.append("	   , RNNG_TM");
		query.append("	   , SMMR");
		query.append("	   , MAIN_PSTR_URL");
		query.append("	   , X_URL ");
		query.append("	   , INSTGRM_URL ");
		query.append("	   , FC_BK_URL");
		query.append("	   , TGLN");
		query.append("	   , ORGNL_TTL");
		query.append("	   , SHWNG");
		query.append("	   , BDGT");
		query.append("	   , BX_OFFC_RVN");
		query.append("	   , LNNG");
		query.append("	   , DEL_YN");
		query.append("  FROM MV");
		query.append(" WHERE DEL_YN = ? ");
		query.append("   AND MV_ID = ?                 ");
		// 위에 준비된 쿼리를 oracle에 전송하고 실행한다.

//	    List<MvVo> movieList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = dbConnection.prepareStatement(query.toString());
			// ?에 들어갈 값을 할당한다.
			pstmt.setString(1, "N");
			pstmt.setString(2, mvId);

			rs = pstmt.executeQuery();

			MvVo mvVo = null;
			while (rs.next()) {
				// 현재 반복중인 row에서 각 컬럼들의 값을 추출한다.
				mvVo = new MvVo();
				mvVo.setMvId(rs.getString("MV_ID"));
				mvVo.setTtl(rs.getString("TTL"));
				mvVo.setRlsDt(rs.getString("RLS_DT"));
				mvVo.setMvRating(rs.getString("MV_RTNG"));
				mvVo.setRnngTm(rs.getInt("RNNG_TM"));
				mvVo.setSmmr(rs.getString("SMMR"));
				mvVo.setMainPstrUrl(rs.getString("MAIN_PSTR_URL"));
				mvVo.setXUrl(rs.getString("X_URL"));
				mvVo.setInstgrmUrl(rs.getString("INSTGRM_URL"));
				mvVo.setFcBkUrl(rs.getString("FC_BK_URL"));
				mvVo.setTgln(rs.getString("TGLN"));
				mvVo.setOrgnlTtl(rs.getString("ORGNL_TTL"));
				mvVo.setShwng(rs.getString("SHWNG"));
				mvVo.setBdgt(rs.getLong("BDGT"));
				mvVo.setBxOffcRvn(rs.getLong("BX_OFFC_RVN"));
				mvVo.setLnng(rs.getString("LNNG"));

				// 추출된 값을 mvVo에게 할당 해준다.
//	    		movieList.add(mvVo);
			}

			return mvVo;
		} catch (SQLException sqle) {
			throw new RuntimeException("열의 이름이 부정확합니다,", sqle);
		} finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// connection close
			if (dbConnection != null) {
				try {
					dbConnection.close();
				} catch (SQLException e) {
				}
			}
		}

//	    movieList.forEach(System.out::println);

	}

	public static List<GnrVo> selectGenre(String mvId) {

		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		String userName = "TMDB";
		String password = "TMDB";
		Connection dbconnection = null;
		try {
			dbconnection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		StringBuffer query = new StringBuffer();
		query.append("SELECT G.GNR_ID ");
		query.append("	, G.NM ");
		query.append("  FROM GNR G");
		query.append(" INNER JOIN MV_GNR MG");
		query.append("    ON G.GNR_ID = MG.GNR_ID ");
		query.append(" WHERE MG.MV_ID = ?  ");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<GnrVo> gnrVo = new ArrayList<>();
		try {
			pstmt = dbconnection.prepareStatement(query.toString());
			pstmt.setString(1,"1-spider-man-brand-new-day");
			
			rs = pstmt.executeQuery();
			GnrVo gnrVo2 = null;
			while(rs.next()) {
				gnrVo2 = new GnrVo();
				
				gnrVo2.setGnrId(rs.getString("GNR_ID"));
				gnrVo2.setNm(rs.getString("NM"));
				
				gnrVo.add(gnrVo2);
				}
			return gnrVo;
		}catch(SQLException sqle){
			throw new RuntimeException("열의 이름이 부정확 합니다.", sqle);
		}finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {}
			}
			// connection close
			if (dbconnection != null) {
				try {
					dbconnection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	
	public static List<MvVo> seletMovieOf(String gnrId){
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String userName = "TMDB";
		String password = "TMDB";
		Connection dbconnection = null;
		try {
			dbconnection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		StringBuffer query = new StringBuffer();
		query.append("SELECT M.MV_ID            ");
		query.append("FROM MV m                 ");
		query.append("INNER JOIN MV_GNR mg       ");
		query.append("  ON m.MV_ID = mg.MV_ID   ");
		query.append("WHERE MG.GNR_ID = ?  ");
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		List<MvVo> mvVo = new ArrayList<>();
		
		try {
			pstmt = dbconnection.prepareStatement(query.toString());
			pstmt.setString(1, gnrId);
			rs = pstmt.executeQuery();
			MvVo mvgnr = null;
			while(rs.next()) {
				mvgnr = new MvVo();
				mvgnr.setMvId(rs.getString("MV_ID"));
				mvVo.add(mvgnr);
			}
			return mvVo;
		}catch(SQLException sqle){
			throw new RuntimeException("열의 이름이 부정확 합니다.", sqle);
		}finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {}
			}
			// connection close
			if (dbconnection != null) {
				try {
					dbconnection.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public static void main(String[] args) {
		

//		MvVo movie = selectMovie("1-spider-man-brand-new-day");
//		System.out.println(movie);
		
		List<GnrVo> gnrvo = selectGenre("1-spider-man-brand-new-day");
		System.out.println(gnrvo);
		
		List<MvVo> mvVo = seletMovieOf("2-action");
		mvVo.stream()
			.map(str -> str.getMvId())
			.forEach(System.out::println);
	}

}
