<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
   <jsp:include page="/WEB-INF/views/layout/head.jsp" flush="false"/>
    <style type="text/css">

    </style>
</head>
<body>
<div class="container">
    <header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <a class="nav-item nav-link active" href="#">Home <span class="sr-only">(current)</span></a>
                    <a class="nav-item nav-link" href="#">Features</a>
                    <a class="nav-item nav-link" href="#">Pricing</a>
                    <a class="nav-item nav-link disabled" href="#">Disabled</a>
                </div>

                <form class="form-inline">
                    <div class="form-group">
                        <%--<label class="col-form-label col-form-label-sm" for="user_id">아이디</label>--%>
                        <input type="text" class="form-control mx-sm-1 form-control-sm" id="user_id" name="user_id" placeholder="아이디">
                        <input type="text" class="form-control mx-sm-1 form-control-sm" id="user_pw" name="user_pw" placeholder="비밀번호">
                    </div>
                    <button type="submit" class="btn btn-sm btn-primary mx-sm-1">sign in</button>
                    <button type="submit" class="btn btn-sm btn-success ml-sm-1">sign up</button>
                </form>
            </div>

        </nav>
    </header>
</div>
</body>
</html>
