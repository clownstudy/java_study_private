package javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx02 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			   Connection conn = null;
		   try{
		      String url = "jdbc:oracle:thin:@localhost:1521:XE";
		      String user = "user2";      
		      String password = "soldesk";
		      conn = 
		         DriverManager.getConnection(url,user,password);
		      System.out.println("DB연결 성공");
		      // sql문을 담아서 가져가는 객체
		      // Statement는 보안에 취약하여 사용하지 않음.
		      Statement stmt = conn.createStatement();
		      ResultSet rs = stmt.executeQuery("Select empno, ename "+"from emp");
		      while(rs.next()) {
		    	  System.out.print("사원번호: "+rs.getInt("empno")+"\t");
		    	  System.out.println("사원명: "+rs.getString("ename"));
		      }
		   }catch(SQLException e){
			  System.out.println("DB연결 실패<br>");
			  System.out.println(e.getMessage());
	}
}
}