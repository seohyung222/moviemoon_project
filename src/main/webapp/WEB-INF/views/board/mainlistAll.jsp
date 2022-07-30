<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>

<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="${path}/resources/css/style.css">
  <style>

  </style>
  <title>공지사항 목록</title>
</head>

<body>
  <jsp:include page="../header.jsp" flush="false" />
  <div class="notice_cinema">
    <div class="notice-title-main">
      <h3 class="board-notice-title">공지사항</h3>
    </div>
    <table class="notice-table">
      <colgroup>
        <col width="80" />
        <col width="550" />
        <col width="100" />
      </colgroup>
      <thead class="thead-notice">
        <tr>
          <th>no.</th>
          <th>title</th>
          <th>date</th>
        </tr>
      </thead>
      <tbody class="notice-detail">
        <c:forEach items="${list}" var="BoardVO">
          <tr class="trnotice">
            <td class="tdNo">${BoardVO.bno}</td>
            <td class="tdTitle"><a href="${path}/board/mainread?bno=${BoardVO.bno}">${BoardVO.title}</a></td>
            <td class="tdDate">
              <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${BoardVO.regdate}" />
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <div class="notice_bottom">
      <tr class="trnotice">
        <c:if test="${pageMaker.prev}">
          <a href="${path}/board/mainlistAll?page=${pageMaker.startPage-1}&laquo;">
            <</a> </c:if> <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
              <a href="${path}/board/mainlistAll?page=${idx}">${idx}</a>
              </c:forEach>
              <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
                <a href="${path}/board/mainlistAll?page=${pageMaker.endPage+1}">&raquo;</a>
              </c:if>
      </tr>
    </div>
  </div>
  <jsp:include page="../footer.jsp" flush="false" />
</body>

</html>