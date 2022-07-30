<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html>

<head>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-migrate/3.1.0/jquery-migrate.min.js"></script>
</head>

<body>
  <jsp:include page="../MN_header.jsp" flush="false" />
  <div class="notice-area">
    <div class="notice-top">
      <h2 class="tit">공지사항</h2>
      <p class="sub-tit">MOVIE MOON의 주요한 이슈 및 여러가지 소직들 확인할 수 있습니다.</p>
    </div>
    <form role="form" method="post">
      <input type='hidden' name='bno' value="${boardVO.bno}">
    </form>
    <div class="board_view_area">
      <ul class="top-title-faq">
        <li class="title"><strong>${boardVO.title}</strong></li>
        <li class="stit-area">
          <span>
            <strong>등록일 : </strong>
            <em class="regist_day">${boardVO.regdate}</em>
          </span>
        </li>
      </ul>
      <div class="view-area">
        <p>
          ${boardVO.content}
        </p>
      </div>
    </div>
    <div class="notice-button-wrap">
      <button id="list" type="submit" class="board-btn board-btn_submit">목록</button>
      <button id="modify" type="submit" class="board-btn board-btn_submit">수정</button>
      <button id="delete" type="submit" class="board-btn">삭제</button>
    </div>
  </div>
  <script>
    $(document).ready(function () {
      var formObj = $("form[role='form']");
      console.log(formObj);
      $('#modify').on("click", function () {
        formObj.attr("action", "${path}/board/modify");
        formObj.attr("method", "get");
        formObj.submit();
      });
      $('#delete').on("click", function () {
        formObj.attr("action", "${path}/board/remove");
        formObj.submit();
      });
      $('#list').on("click", function () {
        self.location = "${path}/board/listAll";
      });
    });
  </script>
</body>


</html>