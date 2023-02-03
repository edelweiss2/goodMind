<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head> 
	<%@ include file="../common/heading.jsp" %>
    <style>
        th, td { text-align: center; }
        .disabled-link { pointer-events: none; }
    </style>
	<title>좋아요 보기 리스트</title>
</head>
<body style="height: 2000px">
    <%@ include file="../common/top.jsp" %>

    <div class="container" style="margin-top: 80px;">
        <div class="row">
            <%@ include file="../common/aside.jsp" %>
            
            <!-- =================== main =================== -->
            <!-- 북마크 -->
			<c:set var="fill" value=""/>
			<c:set var="url" value="bookmark/${uid}"/>
			<c:forEach var="m" items="${mlist }">
				<c:if test="${m eq uid }">
					<c:set var="fill" value="fill"/>
					<c:set var="url" value="bookmark/del/${uid}"/>
				</c:if>
			</c:forEach>
             <!-- =================== main =================== -->
            
        </div>
    </div>

    <%@ include file="../common/bottom.jsp" %>
</body>
</html>