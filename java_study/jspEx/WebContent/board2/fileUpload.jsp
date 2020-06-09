<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="process.jsp">
		<p> 제목 : <input type="text" name="title">
		<p> 파일 : <input type="file" name="file-name">
		<p> <input type="submit" value="submit">
	</form>
</body>
</html>