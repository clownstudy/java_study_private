<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	<form action="memberPro.jsp" method="get" name="memForm">
		<h3>회원 가입</h3>
		<table >
			<tr>
				<th align="right">아이디: </th>
				<th align="left"><input type="text" name="id" size="20"/> </th>
			</tr>
			<tr>
				<th align="right">이름: </th>
				<th align="left"><input type="text" name="name" size="20" /> </th>
			</tr>
			<tr><td colspan="2" align="center">
				<input type="submit" value="가입">
			</td>
			</tr>
		</table>
	</form>
</body>
</html>