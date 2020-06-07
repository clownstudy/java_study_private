package logon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

import common.dbutil.DBConnection;

public class LogonDAO {
	
	private static LogonDAO instance = new LogonDAO();
	
	public static LogonDAO getInstance() {
		return instance;
	}
	public int userCheck(String id, String passwd) {
		//데이터베이스 연결 후 받은 id와 password로 회원이 맞는지 확인하는 로직
		int x = 0;
		Connection conn = null; // 아래에서 connection 등을 close하기 위해서 위에서 선언.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBConnection.getConnection();
			String sql = "select memno from member where id = ? and passwd = ?";
	        pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,id.trim());
			pstmt.setString(2,passwd.trim());
			rs = pstmt.executeQuery();
		
			if(rs.next()) {
				if(rs.getString("memno") != null || 
						rs.getString("memno").length()!=0) // 예외적인 상황(null이나, length가 0일)을 배제.
					x = 1;
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// try 밖에서 close();
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	// 각각 발생한 연결을 거꾸로 닫아준다.
		return x;
	}
	
}
