<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
<title>Simple Shopping Mall </title>
<link href="/resources/css/main.css" rel="stylesheet" type="text/css">
<script  type="text/javascript" src="./resources/js/mainScript.js" charset="utf-8"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body >
	 <c:choose>
	 	<c:when test="${fn:length(hCartList) >0 }">
	 	<c:forEach var="cart" items="${hCartList}">
	 		<tr>
	 			<td class="tbodystyle">${cart.key}</td>
	 			<td class="tbodystyle">${cart.value.product_no}</td>
	 			<td class="tbodystyle">${pdto.date}</td>
	 			<td class="tbodystyle">${pdto.stock}</td>
	 			<td class="tbodystyle"><a href="javascript:shopDetail('')"></td>
		 	</tr>
	 	</c:forEach>
	 	</c:when>
	 	</c:choose>
</body>
</html>  
  