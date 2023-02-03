<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

    <nav class="navbar navbar-expand-sm  navbar-dark fixed-top" style="background-color:#CCCCFF">
        <div class="container-fluid">
            <ul class="navbar-nav">
                <a class="navbar-brand ms-5 me-5" href="#">
                    <img src="/img/logo.png" alt="Logo" style="height:36px;" class="rounded-3">
                </a>
                <link rel="preconnect" href="https://fonts.googleapis.com">
				<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
				<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;400&display=swap" rel="stylesheet">
                <li class="nav-item">
                    <a class="nav-link" href="/goodM/user/home"><i class="fa-solid fa-house"></i> Home</a>
                </li>
				<li class="nav-item dropdown ms-3"><!-- 수정대상이나 예시로 일단 남겨둠 -->
					<a class="nav-link dropdown-toggle" href="#" data-bs-toggle="dropdown">
						<i class="far fa-list-alt"></i>게시판
					</a>
                <ul class="dropdown-menu">
	                <li>
	                    <a class="dropdown-item" href="/goodM/infoBoard/list?p=1&f=&q="> 마음에 Good!</a>
	                </li>
	                <li>
	                    <a class="dropdown-item" href="/goodM/genBoard/list?p=1&f=&q="> 자유게시판</a>
	                </li>
                </ul>
				<li class="nav-item ms-3">
					<a class="nav-link ${menu eq 'diaBoard' ? "active" : ''}" href="/goodM/diaBoard/list?p=1&f=&q="><i class="fa-solid fa-book"></i> 기분기록 or 마음일기</a>
				</li>
                <li class="nav-item ms-3">
                    <a class="nav-link ${menu eq 'user' ? "active" : ''}" href="/goodM/user/list/1"><i class="fa-solid fa-user"></i> My page</a>
                </li>
<%--                 <li class="nav-item dropdown ms-3"><!-- 수정대상이나 예시로 일단 남겨둠 -->
	                <a class="nav-link dropdown-toggle ${(menu eq 'api') ? "active" : ''}" href="#" data-bs-toggle="dropdown">
	                    <i class="fa-solid fa-cloud-arrow-down"></i> API's(수정대상)
	                </a>
	                <ul class="dropdown-menu">
	                    <li><a class="dropdown-item" href="/api/hotPlaces">Hot Places</a></li>
	                    <li><a class="dropdown-item" href="/api/translate">번역</a></li>
	                    <li><a class="dropdown-item" href="/api/sentiment">감성 분석</a></li>
	                    <li><hr class="dropdown-divider"></hr></li>
	                    <li><a class="dropdown-item" href="/api/detect">객체 검출</a></li>
	                    <li><a class="dropdown-item" href="/api/pose">Pose Estimation</a></li>
	                    <li><a class="dropdown-item" href="/api/speechRecog">음성 인식</a></li>
	                </ul>
	            </li> --%>

                <li class="nav-item ms-3">
                    <a class="nav-link" href="/goodM/user/logout"><i class="fas fa-sign-out-alt"></i> 로그아웃</a>
                </li>
            </ul>
            <style>
            *{font-family: 'Noto Sans KR', sans-serif;}
            </style>
            <span class="navbar-text me-3">${uname}님 환영합니다.</span>
        </div>
    </nav>