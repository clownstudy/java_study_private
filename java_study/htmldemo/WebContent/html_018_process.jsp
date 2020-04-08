<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>html_018_textarea.jsp</title>
<style type="text/css">
tr, td{
border:1px solid;
}
</style>
</head>
<body>
	<% 
	request.setCharacterEncoding("UTF-8");
	String other=request.getParameter("other");
	String other2=request.getParameter("other2");
	%>
	<table>
		<tr>
		<td><%= other %></td>
		<td><%= other2 %></td>
		</tr>
	</table>
	
</body>
</html>