<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="main.css">
<script>

</script>
</head>
<body>
	<div id="wrapper">
		<header id="header">
			<jsp:include page="header.jsp" />
		</header>
		<div id="space"></div>
		<div id="container">
		<div id="gnb">
			<%@include file="gnb.jsp" %> 
		</div>
			<div id="test"></div>
		</div>
		<footer>
			<jsp:include page="footer.html" />
		</footer>
	</div>
</body>
</html>