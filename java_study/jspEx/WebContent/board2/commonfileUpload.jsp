<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Commons File Upload</title>
</head>
<body>
	<form method="post" enctype="multipart/form-data" action="commonProcess.jsp">
	<!-- common file upload 방식도 같은 방식으로 사용한다. -->
		<p> 파일 : <input type="file" name="file-name">
		<p> <input type="submit" value="파일 올리기">
	
	</form>
</body>
</html>