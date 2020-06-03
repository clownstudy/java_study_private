package javaEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEx01 {
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
		      StringBuffer sb = new StringBuffer("select empno, ename from emp");
		      sb.append("where empno = ?");
		      prepareStatement pstmt = conn.prepareStatement(sb.toString());
		      ResultSet rs = pstmt.executeQuery(sb.toString());
		      while(rs.next()) {
		    	  System.out.print("부서번호: "+rs.getInt("deptno")+"\t");
		    	  System.out.println("부서명: "+rs.getString("dname"));
		      }
		   }catch(SQLException e){
			  System.out.println("DB연결 실패<br>");
			  System.out.println(e.getMessage());
	}
}
}