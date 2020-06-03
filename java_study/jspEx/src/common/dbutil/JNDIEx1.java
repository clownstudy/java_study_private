package common.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.NamingException;

public class JNDIEx1 {

	public static void main(String[] args) {
		DBConnection db = DBConnection.getInstance();
		
		Connection conn = null;
		try {
			conn = db.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("select sysdate from dual");
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
