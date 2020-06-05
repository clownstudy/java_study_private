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
						rs.getString("memno").length()!=0)
					x = 1;
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// try 밖에서 close();
		return x;
	}
	
}
