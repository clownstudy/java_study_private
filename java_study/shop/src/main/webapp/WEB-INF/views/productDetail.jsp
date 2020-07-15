<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세보기</title>
</head>
<body>
<c:choose>
	<c:when test="${idKey==null}">
		<c:redirect url="/login"></c:redirect>
	</c:when>
	<c:when test="${idKey!=null}">
	<div class="tb_wrap">
	<div class="tb_box">
	<c:import url="Top.jsp" />
<table class="tb">
	<tr>
		<td>
		<table class="tb2">
			<tr>
			<th class="tbodystyle"> 상품이름: ${pdto.name}</th>
			<th class="tbodystyle"> 가	 격: ${pdto.price}</th>
			<th class="tbodystyle"> 구매수량: <input type="text" name="quantity" value="5"></th>
			</tr>
			<tr>
			<td><input type="submit" value="장바구니 담기"><input type="hidden" name="no" value="${pdto.no}"/>
			</td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td>test1</td>
		<td>test2</td>
	</tr>
</table>
</div>
</div>
</c:when>
</c:choose>
</body>
</html>