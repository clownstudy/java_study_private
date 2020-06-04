package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import common.dbutil.DBConnection;

public class BoardDAO {
	//DAO : Database Access Object
	// DB접근해서 처리하는 작업을 모두 처리하는 객체
	/*
	 DB처리해야할 일이 있으면 DAO
	 인스턴스를 받아서 각각 insert, delete 등 모든 작업을
	 모듈화 해놓으면 다른 객체에서 호출해서 사용
	 */

	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	
	public int boardWrite(BoardDTO dto) throws NamingException, SQLException {
		Connection conn = null;

		conn = DBConnection.getConnection();
		// boardnum_seq
		int cnt = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 글 번호를 위한 변수
		int num= dto.getNum();
		int number=0;
		int ref= dto.getRef();
		int re_step= dto.getRe_step();
		int re_level= dto.getRe_level();
		
		if(conn!=null) {
			String sql ="";
			// 시퀀스를 받아서 저장해두고 insert 시
				//sql = "select boardnum_seq.nextval num from dual";
				sql = "select max(num)+1 num from board";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					number = rs.getInt("num");
				}
				if(num==0) {
					num=number;
					ref=num;
					re_step=1;
					re_level=1;
				} else if(num!=0) {
					num=number;
					re_step+=1;
					re_level+=1;
				}
			// 시퀀스 받은 값을 사용한다.
			sql = "insert into board(NUM,WRITER,SUBJECT,EMAIL,CONTENT,";
			sql+= "PASSWD,REG_DATE,READCNT,REF,RE_STEP,RE_LEVEL,ATTACHNM)";
			sql+=" values(?,?,";
			sql+="?,?,?,?,sysdate,0,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2,  dto.getWriter());
			pstmt.setString(3,  dto.getSubject());
			pstmt.setString(4,  dto.getEmail());
			pstmt.setString(5,  dto.getContent());
			pstmt.setString(6,  dto.getPasswd());
			pstmt.setInt(7,  ref); // 그룹
			pstmt.setInt(8,  re_step); // 답글의 단계
			pstmt.setInt(9,  re_level); // 답글의 깊이
			pstmt.setString(10, dto.getAttachnm());
			
			cnt = pstmt.executeUpdate();
		
		}
		if(rs!=null) rs.close();
        if(pstmt!=null)pstmt.close();
	    if(conn!=null)conn.close();
		return cnt;
	}
	
	public List<BoardDTO> getArticles(int sRow, int pageSize) throws NamingException, SQLException{
		String sql = "select A.* from (";
			sql+="select rownum rr, rboard.* from ";
			sql+="(select num, writer, subject, email, content, passwd, reg_date, readcnt, ref, re_step, re_level, attachnm from ";
			sql+="board order by ref desc, re_step asc) rboard) A ";
			sql+="-- where A.rr between 1 and 20"; 
		


		
//		String sql="select NUM";
//				sql+=",WRITER"; 
//				sql+=",SUBJECT";
//				sql+=",EMAIL";
//				sql+=",CONTENT";
//				sql+=",PASSWD"; 
//				sql+=",REG_DATE"; 
//				sql+=",READCNT";
//				sql+=",REF"; 
//				sql+=",RE_STEP";
//				sql+=",RE_LEVEL"; 
//				sql+=",ATTACHNM"; 
//				sql+=" from board";
//				sql+=" where rownum between 1 and 20";
//				sql+=" order by ref desc"; 
		Connection conn = DBConnection.getConnection();
		List<BoardDTO> articles = new ArrayList<BoardDTO>(20);
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			// 하나의 정보를 저장하는 작업
			BoardDTO dto = new BoardDTO();
			dto.setRr(rs.getInt("rr"));
			dto.setNum(rs.getInt("NUM"));
			dto.setReadcnt(rs.getInt("READCNT"));
			dto.setRef(rs.getInt("REF"));
			dto.setRe_step(rs.getInt("RE_STEP"));
			dto.setRe_level(rs.getInt("RE_LEVEL"));
			dto.setWriter(rs.getString("WRITER"));
			dto.setSubject(rs.getString("SUBJECT"));
			dto.setEmail(rs.getString("EMAIL"));
			dto.setContent(rs.getString("CONTENT"));
			dto.setPasswd(rs.getString("PASSWD"));
			dto.setReg_date(rs.getString("REG_DATE"));
			dto.setAttachnm(rs.getString("ATTACHNM"));
			
			articles.add(dto);
		}
        if(rs!=null) rs.close();
        if(pstmt!=null)pstmt.close();
        if(conn!=null)conn.close();

		return articles;
	
	}
	   
	   public BoardDTO getArticle(int num) throws NamingException/* , SQLException */{
	      //조회수 수정하는 작업
	      PreparedStatement pstmt = null;
	      BoardDTO dto = new BoardDTO();
	      ResultSet rs = null;
	      
	      
	      try {
	    	  Connection conn = DBConnection.getConnection();
	      pstmt =conn.prepareStatement("Update board set Readcnt = Readcnt+1 where num=?") ;
	      pstmt.setInt(1, num);
	      
	      int i= pstmt.executeUpdate();
	        
	      if(i>0) {
	      //오라클..sql
	      String sql="select NUM,WRITER,SUBJECT,EMAIL,CONTENT,PASSWD"
	               + ",REG_DATE,READCNT,REF,RE_STEP,RE_LEVEL, ATTACHNM"
	               + " from board where num = ?";
	        
	      //connection 가져오기
	         
	         //받은 num에 해당되는 데이터 갖고오는 작업
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         
	         if(rs.next()){
	            //하나의 정보를 저장하는 작업
	        	dto.setNum(rs.getInt("NUM"));
	 			dto.setReadcnt(rs.getInt("READCNT"));
	 			dto.setRef(rs.getInt("REF"));
	 			dto.setRe_step(rs.getInt("RE_STEP"));
	 			dto.setRe_level(rs.getInt("RE_LEVEL"));
	 			dto.setWriter(rs.getString("WRITER"));
	 			dto.setSubject(rs.getString("SUBJECT"));
	 			dto.setEmail(rs.getString("EMAIL"));
	 			dto.setContent(rs.getString("CONTENT"));
	 			dto.setPasswd(rs.getString("PASSWD"));
	 			dto.setReg_date(rs.getString("REG_DATE"));
	 			dto.setAttachnm(rs.getString("ATTACHNM"));
	         }
	      }
	      if(rs!=null) rs.close();
	      if(pstmt!=null)pstmt.close();
	      if (conn!=null)conn.close();
	      }catch(SQLException e) {
	         e.printStackTrace();
	      
	      }
	      
	      
	      //connection 닫기 
	         return dto;
	      
	   }
	   
	   public int boardUpdate(BoardDTO dto) throws NamingException, SQLException{
			int r=0;
		   //dbconnection
			//preparedstatement
			PreparedStatement pstmt = null;
			Connection conn = null;
			conn = DBConnection.getConnection();

			try {
				String sql ="update board set ";
				sql+="subject = ?,";
				sql+="email = ?,";
				sql+="content = ?,";
				sql+="passwd = ?,";
				sql+="attachnm = ? ";
				sql+="where num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getSubject());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getPasswd());
			pstmt.setString(5, dto.getAttachnm());
			pstmt.setInt(6, dto.getNum());
			r = pstmt.executeUpdate();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				   if (pstmt!=null)pstmt.close();
				   if (conn!=null)conn.close();
			   } catch(SQLException e) {
				   e.printStackTrace();
			}
			return r;
}
	   
	   public int deleteArticle(int num) throws NamingException, SQLException {
		   int r=0;
		   PreparedStatement pstmt = null;
		   Connection conn = null;
		   //db연결
		   try {
		   conn = DBConnection.getConnection();
		   //쿼리만들기
		   String sql = "delete from board where num = ?";
		   //pstmt만들기
		   pstmt = conn.prepareStatement(sql);
		   //실행하고 r=pstmt.executeUpdate();
		   pstmt.setInt(1, num);
		   r =pstmt.executeUpdate();
		   //return
		   } catch (NamingException e) {
			   e.printStackTrace();
		   } catch (SQLException e ) {
			   e.printStackTrace();
		   }
		   // close
		   try {
			   if (pstmt!=null)pstmt.close();
			   if (conn!=null)conn.close();
		   } catch(SQLException e) {
			   e.printStackTrace();
		   }
		   return r;
	   }
//	   public int boardDelete(BoardDTO dto) throws NamingException, SQLException{
//			int r=0;
//		   //dbconnection
//			
//			//preparedstatement
//			PreparedStatement pstmt = null;
//			try {
//				String sql ="delete from board where num = ?";
//			Connection conn = null;
//			conn = DBConnection.getConnection();
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, dto.getNum());
//			r = pstmt.executeUpdate();
//			
//		    if (pstmt!=null)pstmt.close();
//		    if (conn!=null)conn.close();
//			} catch (NamingException e){
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//
//			return r;
//}
}