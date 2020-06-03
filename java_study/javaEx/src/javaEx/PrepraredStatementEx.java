package javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepraredStatementEx {
	
		static {
			try {
				String clname = "oracle.jdbc.driver.OracleDriver";
			Class.forName(clname);
			} catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
		public static void main(String[] args) {
			String url="jdbc:oracle:thin:@172.16.1.145:1521:XE";
			String user="user2";
			String pw="soldesk";
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs = null;
			try {
				conn = DriverManager.getConnection(url,user,pw);
				if(conn!=null) {
				// System.out.println("연결성공");
				String sql="create table test(name varchar(20),";
					sql+="tel varchar(15))";
				pstmt = conn.prepareStatement(sql);
				int r = pstmt.executeUpdate();
				if(r>0) System.out.println("테이블 생성 성공");
				else System.out.println("테이블 생성 실패");
					//for문 이용해서 person테이블에 홍길동 1, 홍길동2, ... 
					//20200526 ~ 5명 저장
					sql = "insert into person(id, name) values(?,?)";
					for(int i=1;i<=5;i++) {
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, ""+(20200525+i));
						pstmt.setString(2, "홍길동"+i);
						r = pstmt.executeUpdate();
						if(r>0) System.out.println("삽입 성공");
						}
					r=0;
					sql = "select id, name from person";
					pstmt = conn.prepareStatement(sql);
					
					rs = pstmt.executeQuery();
					System.out.println("========회원명단========");
					while(rs.next()) {
						System.out.print(rs.getString("id")+"\n");
						System.out.print(rs.getString("name"));
					}
					pstmt = conn.prepareStatement("drop table test");
					r = pstmt.executeUpdate();
					System.out.println("\n"+r+"테이블 삭제 성공");
					}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
}
