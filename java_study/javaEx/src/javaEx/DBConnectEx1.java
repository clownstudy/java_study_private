package javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectEx1 {
	public static void main(String[] args) {
		/*
		 connection 객체를 받아야함
		 JDBC 드라이버 필요
		 JDBC 드라이버 로딩
		 DriverManager를 통해서 데이터베이스 접속
		 데이터베이스를 접속한 후, 종료 시 반드시 연결 종료해야함.
		 */
		String driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="oracle";
		Connection conn =null;
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection(url,user,pass);
			System.out.println("오라클 연결 성공");
		} catch(ClassNotFoundException e) {
			System.out.println("jdbc driver 없음");
		} catch(SQLException e) {
			System.out.println("오라클 연결 실패");
		} finally {
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
	}
}
