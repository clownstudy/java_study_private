<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--  uri에 해당하는 라이브러리를 쓰려면 태그 앞에 "c"라는 prefix를 붙여라. -->
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 예제 - set, out, remove</title>
</head>
<body>

browser 변수값 설정
<c:set var = "browser" value="${header['User-Agent']}" /> <br>
<c:out value="${browser}"/> <p><!--  ${browser} = el표기법.  -->

browser 변수값 제거 후
<c:remove var="browser"/>
<c:out value="${browser}"/>
</body>
</html>