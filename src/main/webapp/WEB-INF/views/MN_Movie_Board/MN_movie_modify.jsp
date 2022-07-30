<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
<%@ include file="../include/includeFile.jsp" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>영화 수정 페이지</title>
</head>

<body>
  <jsp:include page="../MN_header.jsp" flush="false" />
  <p value="${mnMovieRead.movie_num}" name="movie_num" hidden></p>
  <div class="mn-movie-modify">
    <form class="mn-movie-modify-form" method="POST" enctype="multipart/form-data">
      <div class="mn-movie-modify-wrap">
        <table class="mn-movie-modify-table">
          <caption class="mn-movie-modify-board-title"> 영화 수정</caption>
          <tbody>
            <tr>
              <th><label for="modify-title">제 목 : </label></th>
              <td><input type="text" value="${mnMovieRead.title}" name="title" required /></td>
            </tr>
            <tr>
              <th><label for="modify-director">감 독 : </label></th>
              <td><input type="text" value="${mnMovieRead.director}" title="modify-director" id="modify-director"
                  name="director" required /></td>
            </tr>
            <tr>
              <th><label for="modify-actor">출연배우 : </label></th>
              <td><input type="text" value="${mnMovieRead.actor}" title="modify-actor" id="modify-actor" name="actor"
                  required /></td>
            </tr>
            <tr>
              <th><label for="modify-film-grade">등 급 : </label></th>
              <td>
                <select class="modify-search-grade" name="film_rate" required>
                  <option value="">글 분류</option>
                  <option value="전체 관람가" <c:out value="${mnMovieRead.film_rate eq '전체 관람가' ? 'selected':''}" />>전체 관람가
                  </option>
                  <option value="12세 이상 관람가" <c:out value="${mnMovieRead.film_rate eq '12세 이상 관람가' ? 'selected':''}" />
                  >12세 이상 관람가</option>
                  <option value="15세 이상 관람가" <c:out value="${mnMovieRead.film_rate eq '15세 이상 관람가' ? 'selected':''}" />
                  >15세 이상 관람가</option>
                  <option value="청소년 관람불가" <c:out value="${mnMovieRead.film_rate eq '청소년 관람불가' ? 'selected':''}" />>청소년
                  관람불가</option>
                </select>
            </tr>
            <tr>
              <th><label for="modify-movie_genre">장 르 : </label></th>
              <td><input type="text" value="${mnMovieRead.movie_genre}" title="장  르" id="modify-movie_genre"
                  name="movie_genre" required /></td>
            </tr>
            <tr>
              <th><label for="modify-running-time">상영시간 : </label></th>
              <td>
                <input type="text" value="${mnMovieRead.running_time}" title="상영시간" id="modify-running-time"
                  name="running_time" required /></td>
              </td>
            </tr>
            <tr>
              <th><label for="modify-opening-day">개봉일자 : </label></th>
              <td class="modify-screening-date">
                <input type="date" value="${mnMovieRead.opening_day}" id="modify-opening-date" name="opening_day"
                  required />
                <label for="modify-closing-day">종영일자 : </label>
                <input type="date" value="${mnMovieRead.closing_day}" id="modify-closing-date" name="closing_day"
                  required />
              </td>
            </tr>
            <tr>
              <th><label for="modify-file">첨부파일 : </label></th>
              <%--     <td><input type="text" value ="${mnMovieRead.view_name}" required/></td> --%>
              <td><input type="file" title="첨부파일" id="modify-file" name="files" class="file-hidden" required multiple />
              </td>
            </tr>
            <tr>
              <th><label for="modify-description">줄거리</label></th>
              <td> <textarea class="modify-movietext" name="story" required> ${mnMovieRead.story} </textarea></td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="modify-submit-wapper">
        <input type="submit" value="완료" class="modify-submit-btn" />
        <input type="reset" value="취소" class="modify-back-btn" onclick="backButton('${mnMovieRead.movie_num}')" />
      </div>
    </form>
  </div>
  <script>
    function backButton(movie_num) {
      location.href = "${path}/MN_Movie_Board/MN_movie_detail?movie_num=" + movie_num;
    }
    /* 
   		 $("#back_Btn").click(function(){
    	  //history.back();
    	  location.href = "${path}/MN_Movie_Board/MN_movie_detail?movie_num="+${mnMovieRead.movie_num};
    	location.href = "/admin/goods/view?n=" + ${goods.gdsNum};
    	 }); */
  </script>

  </script>
</body>

</html>