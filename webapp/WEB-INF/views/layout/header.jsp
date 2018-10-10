<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<header>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <a class="navbar-brand" href="/index.jsp">Inven</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup"
                        aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div class="navbar-nav mr-auto">
                                <a class="nav-item nav-link active" href="/index.jsp">Home <span class="sr-only">(current)</span></a>
                                <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                                챔피언
                                        </a>
                                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                                <a class="dropdown-item" href="/champList">챔피언 정보</a>
                                                <a class="dropdown-item" href="/addChamp">챔피언 추가</a>
                                        </div>
                                </li>
                                <a class="nav-item nav-link" href="#">Pricing</a>
                        </div>

                        <form class="form-row">
                                <div class="form-inline">
                                        <div class="form-group">
                                                <input type="text" class="form-control mx-sm-1 form-control-sm" id="user_id" name="user_id" placeholder="아이디">
                                                <input type="text" class="form-control mx-sm-1 form-control-sm" id="user_pw" name="user_pw" placeholder="비밀번호">
                                        </div>
                                        <div class="form-group">
                                                <button type="submit" class="btn btn-sm btn-primary mx-sm-1">sign in</button>
                                                <button type="submit" class="btn btn-sm btn-success ml-sm-1">sign up</button>
                                        </div>
                                </div>
                        </form>
                </div>
        </nav>
</header>