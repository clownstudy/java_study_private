<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.or.sol.board.dto.*, java.util.*" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <% request.setCharacterEncoding("utf-8"); %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용 </title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="/resources/board2/js/boardScript.js"></script>
<script type="text/javascript" src="/resources/board2/js/boardjquery.js"></script>
<script type="text/javascript" src="/resources/board2/js/jquery_board.js"></script>
<link href="/resources/board2/css/board.css" rel="stylesheet" />

</head>
<body>
   <table border=1>
         <thead>
            <tr>
               <th colspan=2>
                  <h3>글쓰기</h3>
               </th>
            </tr>
         </thead>
         <tbody>
            <tr>
               <th>제목 : </th>
               <td><c:out value="${bdto.subject}"/></td>
            </tr>
            <tr>
               <th>내용 : </th>
               <td><textarea cols="80" rows="20" readonly="readonly"><c:out value="${bdto.content}"/></textarea></td>
            </tr>
            <tr>
               <th>첨부파일 :</th>
               <td><c:out value="${bdto.attachnm}"/><button onclick="</td>
            </tr>
            <tr>
               <th>작 성 자 :</th>
               <td><a href = 'mailto:<c:out value="${bdto.email}"/>'><c:out value="${bdto.writer}"/></a></td>
            </tr>
            <tr>
               <th>이 메 일 :</th>
               <td><c:out value="${bdto.email}"/></td>
            </tr>
            <tr>
               <td colspan="2" align = "center">
               <input type="button" id="up_btn" value="글 수정" onclick="pwCheck('u');"/>
               <input type="button" id="del_btn" value="글 삭제" onclick="pwCheck('d');"/>
               <input type="button" id="reply" value="답글" />
               <input type="button" id="list1" value="글 목록으로" />
               </td>
            </tr>
         </tbody>
      </table>
      <form action="" name = "parentForm" method="post">
     	 <input type="text" id="currentPage" name="currentPage" value='<c:out value="${pdto.currentPage}" />'/>   
		 <input type="text" id="currentPageBlock" name="currentPageBlock" value='<c:out value="${pdto.currentPageBlock}" />'/>   
         <input type="text" name="passwd" value = "${bdto.passwd}" />
         <input type="text" name="cpass" value = "" />
         <input type="text" name="num" value = "${bdto.num}" />
         <input type="text" name="ref" value = "${bdto.ref}" />
         <input type="text" name="re_step" value = "${bdto.re_step}" />
         <input type="text" name="re_level" value = "${bdto.re_level}" />
<%--          <input type="text" name="writer" value="${bdto.writer}" /> --%>
      </form>

</body>
</html>