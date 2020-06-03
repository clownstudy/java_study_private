<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>만들어진 자바빈즈 사용</title>
</head>
<body>
	<jsp:useBean id="person" class="jspEx.ch04.Person" scope="request"/> <%-- page가 디폴트 --%>
	<p>아이디: <%=person.getId() %></p>
	<p>이름: <%=person.getName() %></p>
	<%
		person.setId("20200625");
		person.setName("홍길동");
	%>
	<jsp:include page="personUse.jsp"/>
</body>
</html>