import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
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
		   }catch(SQLException e){
			  System.out.println("DB연결 실패<br>");
			  System.out.println(e.getMessage());
	}
}
}