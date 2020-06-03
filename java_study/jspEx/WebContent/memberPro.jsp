<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*, common.dbutil.*" %>
<%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 확인</title>
<style type="text/css">
table, td{
	border:1px solid
}
table {
	width: 60%;
	height: 100px;
	margin: auto;
	text-align:center;
}
h3 {
	width:60%;
	text-align:center;
}
</style>
</head>
<body>
<jsp:useBean id="person" class="jspEx.ch04.Person" scope="request" />
<jsp:setProperty property="*" name="person"/> 
<h3>회원 가입 확인</h3>
		<table >
			<tr>
				<th align="right">아이디: </th>
				<th align="left"> <jsp:getProperty property="id" name="person"/> </th>
			</tr>
			<tr>
				<th align="right">이름: </th>
				<th align="left"> <jsp:getProperty property="name" name="person"/></th>
			</tr>
		</table>
</body>
</html>

<%
   /* Class.forName("oracle.jdbc.driver.OracleDriver"); */
   Connection conn = null;
   try{
	   conn = DBConnection.getConnection();
	   if(conn!=null) out.println("DB연결 성공");
	   // System.out.println(person.getId());
	   String sql = "insert into person(id,name) values(?,?)";
	   PreparedStatement pstmt = conn.prepareStatement(sql);
	   pstmt.setString(1,person.getId());
	   pstmt.setString(2,person.getName());
	   int r = pstmt.executeUpdate(); // insert delete update 는 executeUpdate로 함
	   out.println(r);
   }catch(SQLException e){
      out.println("DB연결 실패<br>");
      out.println(e.getMessage());
   }
   %>