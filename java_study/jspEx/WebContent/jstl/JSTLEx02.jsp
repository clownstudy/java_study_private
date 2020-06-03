<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--  uri에 해당하는 라이브러리를 쓰려면 태그 앞에 "c"라는 prefix를 붙여라. -->
<html>
<head>
<meta charset="UTF-8">
<title>JSTL core 예제 - if, choose, when, otherwise</title>
</head>
<body>
	<c:set var="country" value="${'Korea'}" />
	<c:if test="${country !=null}">
		국가명: <c:out value="${country}" />
	</c:if>
	<p>
	<c:choose>
		<c:when test="${country='Korea' }">
	 		<c:out value="${country}"/>의 겨울은 춥습니다.
	 	</c:when>
		<c:when test="${country='Canada' }">
	 		<c:out value="${country}"/>의 겨울은 너무춥네?
	 	</c:when>
	 	<c:otherwise>
	 		그 외의 나라는 몰라
	 	</c:otherwise>
	</c:choose>
</body>
</html>