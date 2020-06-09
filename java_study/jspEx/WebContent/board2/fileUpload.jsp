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
	<!--  MultipartRequest => 인코딩 타입이 여러타입이 포함된 데이터를 한번에 보내기 위해 사용한다. -->
		<p> 제목 : <input type="text" name="title">
		<p> 파일 : <input type="file" name="file-name">
		<p> <input type="submit" value="submit">
	</form>
</body>
</html>