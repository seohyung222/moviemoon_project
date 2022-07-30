<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ include file="./include/includeFile.jsp" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> --%>

<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<body>
  <div class="visual">
    <ul class="slick-items">
      <li class="visual">
        <a href="" class="img-wrap" style="background-image:url('${path}/resources/img/therounduphome.jpg')">
          <span class="visual-text">
            <strong class="visual-text-title">범죄도시2 <em>The Roundup</em></strong>
            <span class="visual-text-sub">느낌 오지? 이 놈 잡아야 하는 거.</span>
          </span>
        </a>
      </li>
      <li class="visual">
        <a href="#none" class="img-wrap" style="background-image:url('${path}/resources/img/brokerhome.jpg')">
          <span class="visual-text">
            <strong class="visual-text-title">브로커 <em>Broker</em></strong>
            <span class="visual-text-sub">베이비 박스, 이들의 예기치 못한 여정이 시작된다!</span>
          </span>
        </a>
      </li>
      <li class="visual">
        <a href="" class="img-wrap" style="background-image:url('${path}/resources/img/witchhome.JPG')">
          <span class="visual-text">
            <strong class="visual-text-title">마녀 <em>Part2. The Other One</em></strong>
            <span class="visual-text-sub">통제불능의 존재가 세상 밖으로 나왔다!</span>
          </span>
        </a>
      </li>
      <li class="visual">
        <a href="" class="img-wrap" style="background-image:url('${path}/resources/img/topgunhome.JPG')">
          <span class="visual-text">
            <strong class="visual-text-title">탑건-매버릭 <em>Top Gun: Maverick</em></strong>
            <span class="visual-text-sub">하늘 위, 가장 압도적인 비행이 시작된다!</span>
          </span>
        </a>
      </li>
    </ul>
  </div>
  <!--//slick-->
  <div id="container">
    <!-- 영화 탭 콘텐츠 -->
    <div class="movie-wrap">
      <div class="movie-box">
        <ul class="movie-tabmenu">
          <li>
            <a href="javascript:void(0)" class="active"><strong>박스오피스</strong></a>
            <div class="tab-content-wrap on">
              <c:forEach items="${list1}" var="boxMovie" begin="0" end="3">
                <div class="tab-content">
                  <div class="movie-content">
                    <div class="movie_img">
                      <a href="javascript:void(0);">
                        <img src="${path}/savedir/${boxMovie.view_name_key}">
                        <%--  </c:forEach> --%>
                      </a>
                    </div>
                    <div class="movie-info">
                      <h3 class="movie-title">
                        <a href=""><span class="age-ico">${boxMovie.film_rate}</span>${boxMovie.title}</a>
                      </h3>
                      <div class="info-text-area">
                        <span class="info-text">${boxMovie.opening_day}개봉</span>
                        <span class="info-text">관람 평점:${boxMovie.avg_score}</span>
                      </div>
                    </div>
                    <div class="movie-btn-area">
                      <a href="${path}/movie/screening/booking?movie_num=${boxMovie.movie_num}"
                        class="movie-btn">예매하기</a>
                      <a href="${path}/movie_detail?movie_num=${boxMovie.movie_num}" class="movie-btn">상세보기</a>
                    </div>
                  </div>
                </div>
              </c:forEach>
            </div>
          </li>
          <li>
            <a href="javascript:void(0)"><strong>최신개봉작</strong></a>
            <div class="tab-content-wrap">
              <c:forEach items="${list2}" var="newMovie" begin="0" end="3">
                <div class="tab-content">
                  <div class="movie-content">
                    <div class="movie_img">
                      <a href="javascript:void(0);">
                        <img src="${path}/savedir/${newMovie.view_name_key}">
                      </a>
                    </div>
                    <div class="movie-info">
                      <h3 class="movie-title">
                        <a href="">
                          <span class="age-ico">${newMovie.film_rate}</span>${newMovie.title}
                        </a>
                      </h3>
                      <div class="info-text-area">
                        <span class="info-text">${newMovie.opening_day}개봉</span>
                        <span class="info-text">관람 평점:${newMovie.avg_score}</span>
                      </div>
                    </div>
                    <div class="movie-btn-area">
                      <a href="#" class="movie-btn">예매하기</a>
                      <a href="${path}/movie_detail?movie_num=${newMovie.movie_num}" class="movie-btn">상세보기</a>
                    </div>
                  </div>
                </div>
              </c:forEach>
            </div>
          </li>
        </ul>
      </div>
    </div>
    <!--영화관 이미지 -->
    <div class="acorn-cinema" style="background-image:url('${path}/resources/img/movie_moon.jpg')">
      <a href="" class="cinema-content">
        <div><img src="${path}/resources/img/logow.png" alt="" width="80px"></div>
        <p class="cinema-text">영화를 본다는 것, 그 놀라운 경험을 선사하는 무비문에서</p>
      </a>
    </div>
    <!-- 공지사항 -->
    <div class="notice-wrap">
      <div class="layout-content notice-inner">
        <h3 class="notice-title">NOTICE</h3>
        <ul class="notice">
          <!-- 여기서부터 -->
          <c:forEach items="${list3}" var="BoardVO" begin="1" end="6">
            <li>
              <a href="${path}/board/mainread?bno=${BoardVO.bno}">
                <div class="notice-content">
                  <h4 class="notice-content-title">${BoardVO.title}</h4>
                  <p class="notice-text">
                    ${BoardVO.content}
                  </p>
                  <span class="notice-date">
                    <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${BoardVO.regdate}" /></span>
                </div>
              </a>
            </li>
          </c:forEach>
          <!-- 여기서까지-->
        </ul>
      </div>
    </div>
  </div>
  <!-- script -->
  <script type="text/javascript" src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
  <script type="text/javascript" src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
  <script type="text/javascript" src="${path}/resources/slick/slick.min.js"></script>
  <script>
    $(document).ready(function () {
      $('.slick-items').slick({
        autoplay: true,
        dots: true,
        speed: 300 /* 이미지가 슬라이딩시 걸리는 시간 */ ,
        infinite: false,
        autoplaySpeed: 3000 /* 이미지가 다른 이미지로 넘어 갈때의 텀 */ ,
        arrows: false,
        slidesToShow: 1,
        slidesToScroll: 1,
        fade: true,
      });
      //영화 탭메뉴 제이쿼리
      $(".movie-tabmenu>li>a").on("click", function () {
        $(".movie-tabmenu>li>a").removeClass("active");
        $(this).addClass("active");
        $(".tab-content-wrap").removeClass("on");
        $(this).siblings(".tab-content-wrap").addClass("on");
      });
      // hover
      $(".movie_img > a").on("mouseenter focus", function () {
        $(this).parent().siblings(".movie-btn-area").addClass("on");
      });
      $(".movie-btn-area a:last-child").on("focusout", function () {
        $(".movie-btn-area").removeClass("on");
      });
      $(".movie-content").on("mouseleave", function () {
        $(".movie-btn-area").removeClass("on");
      });
    });
  </script>
  <script src="${path}/resources/js/movie_age.js"></script>
</body>

</html>