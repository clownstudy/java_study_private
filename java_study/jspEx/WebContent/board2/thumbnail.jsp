<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Thumbnail 이미지 예제</title>
<meta http-equiv="Conten-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form name="fileForm" method="post" enctype="multipart/form-data" action="thumbnailPro.jsp">
원본 이미지:
<input type="file" name="image" /><br>
<input type="submit" value="썸네일 이미지 만들기" /><br>
</form>	
</body>
</html>