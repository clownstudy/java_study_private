<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@ page import="com.oreilly.servlet.*"%> --%>
<%-- <%@ page import="com.oreilly.servlet.multipart.*"%> --%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 처리</title>
</head>
<body>
<c:redirect url="boardList.sp?currentPage=${pvo.currentPage}&currentPageBlock=${pvo.currentPageBlock}"></c:redirect>

</body>
</html>