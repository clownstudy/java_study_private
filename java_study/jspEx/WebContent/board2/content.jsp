<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.*, java.util.*" %>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <% request.setCharacterEncoding("utf-8"); %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용 </title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript" src="./board2/js/boardScript.js"></script>
<script type="text/javascript" src="./board2/js/boardjquery.js"></script>
<script type="text/javascript" src="./board2/js/jquery_board.js"></script>
<link href="./board2/css/board.css" rel="stylesheet" />

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
               <td><c:out value="${dto.subject}"/></td>
            </tr>
            <tr>
               <th>내용 : </th>
               <td><textarea cols="80" rows="20" readonly="readonly"><c:out value="${dto.content}"/></textarea></td>
            </tr>
            <tr>
               <th>첨부파일 :</th>
               <td><c:out value="${dto.attachnm}"/></td>
            </tr>
            <tr>
               <th>작 성 자 :</th>
               <td><a href = 'mailto:<c:out value="${dto.email}"/>'><c:out value="${dto.writer}"/></a></td>
            </tr>
            <tr>
               <th>이 메 일 :</th>
               <td><c:out value="${dto.email}"/></td>
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
         <input type="text" name="passwd" value = "${dto.passwd}" />
         <input type="hidden" name="cpass" value = "" />
         <input type="hidden" name="num" value = "${dto.num}" />
         <input type="hidden" name="ref" value = "${dto.ref}" />
         <input type="hidden" name="re_step" value = "${dto.re_step}" />
         <input type="hidden" name="re_level" value = "${dto.re_level}" />
      </form>

</body>
</html>