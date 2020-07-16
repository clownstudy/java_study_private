<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Simple Shopping Mall </title>
<link href="../resources/css/main.css" rel="stylesheet" type="text/css">
<script  type="text/javascript" src="../resources/js/mainScript.js" charset="utf-8"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>

<body >
<c:choose>
	<c:when test="${idKey==null}">
	<c:redirect url="/login"></c:redirect>	
	</c:when>
	<c:when test="${idKey!=null}">
	<div class="tb_wrap">
	<div class="tb_box">
	  <c:import url="Top.jsp"/>
	<table class="tb">
		<tr>
		<td class="tb2">
		<table>
		<thead>
		<tr>
		<th class="theadstyle">1</th>
		<th class="theadstyle">2</th>
		<th class="theadstyle">3</th>
		<th class="theadstyle">4</th>
		<th class="theadstyle">5</th>
		</tr>
		</thead>
		</table>
		</td>
		</tr>
	</table>
	</div>
	</div>
	</c:when>
 </c:choose>
  <c:import url="Bottom.jsp"/>
</body>
</html>  