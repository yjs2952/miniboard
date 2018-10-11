<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/views/layout/head.jsp" flush="false"/>
</head>
<body>
<div class="container">
    <jsp:include page="/WEB-INF/views/layout/header.jsp" flush="false"/>
    <div class="content my-3">
        <div class="mb-3" id="searchChamp">
            <div class="input-group input-group-sm ml-auto" style="width: 200px;">
                <input type="text" id="inputChamp" class="form-control" placeholder="챔피언 검색...">
                <div class="input-group-append">
                    <button class="btn btn-primary" type="button">
                        <i class="fa fa-search"></i>
                    </button>
                </div>
            </div>
        </div>
        <div class="mb-3" id="selectChamp">
            <div id="ganada">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb justify-content-center">
                        <li class="breadcrumb-item"><a href="#">All</a></li>
                        <li class="breadcrumb-item"><a href="#">ㄱ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㄴ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㄷ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㄹ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅂ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅅ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅇ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅈ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅊ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅋ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅌ</a></li>
                        <li class="breadcrumb-item"><a href="#">ㅍ</a></li>
                        <li class="breadcrumb-item active" aria-current="page">ㅎ</li>
                    </ol>
                </nav>
            </div>
            <div class="" id="champList">
                <div class="list" style="margin: 8px 0 0 4px; overflow: hidden;">
                    <c:forEach items="${champList}" var="item">
                        <a href="/champBoard?cid=${item.cid}" class="float-left text-center">
                            <img src="https://unsplash.it/600.jpg?image=251" class="img-thumbnail" style="width: 48px; height: 48px; margin: 2px; border: 0;">
                            <div>${item.cname}</div>
                        </a>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
