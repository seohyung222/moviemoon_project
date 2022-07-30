<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html lang="ko">

<head>

</head>

<body>
  <jsp:include page="../MN_header.jsp" flush="false" />
  <div class="notice-content-write">

    <div class="board-write ">
      <h3 class="notice_title">수정페이지</h3>
      <form method="post" action="${path}/board/modify">
        <div align="center">
          <table>
            <input type='hidden' name='bno' value="${boardVO.bno}" />
            <tr>
              <th>제 목 </th>
              <td>
                <input type="text" size="60" name='title' Maxlength="30" class="board-title-input"
                  value="${boardVO.title}">
              </td>
            </tr>
            <tr>
              <th>본 문</th>
              <td><textarea rows="15" cols="60" name="content" class="board-textarea">${boardVO.content}</textarea></td>
            </tr>
          </table>
          <div class="board-btn-area">
            <!-- <input type="submit" value="등 록" class="board-btn board-btn_submit">
	                    <input type="reset" value="취 소" class="board-btn"> -->
            <button id="modify" type="submit" class="board-btn board-btn_submit">저장하기</button>
            <a href="${path}/board/listAll" class="board-btn board-btn_submit">메인으로</a>
          </div>
        </div>
      </form>
    </div>
  </div>
</body>

</html>
