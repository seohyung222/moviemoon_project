<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!-- css -->
<link rel="stylesheet" href="${path}/resources/css/style.css">
<link rel="stylesheet" type="text/css" href="${path}/resources/slick/slick.css" />
<link rel="stylesheet" type="text/css" href="${path}/resources/slick/slick-theme.css" />

<script>
	if ('${msg}' != '')
		alert('${msg}');
</script> 