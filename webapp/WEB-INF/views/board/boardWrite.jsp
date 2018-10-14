<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/views/layout/head.jsp" flush="false"/>
    <script type="text/javascript">

    </script>
</head>
<body>
<div class="container">
    <jsp:include page="/WEB-INF/views/layout/header.jsp" flush="false"/>
    <div class="content my-3">

        <form id="imgBoardForm" class="m-lg-5" role="form" method="post">
            <div class="form-group row">
                <label class="col-lg 2">제목</label>
                <div class="col-lg-10">
                    <input type="text" class="form-control" id="subject" name="subject" required>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-lg-2">내용</label>
                <div class="col-lg-10">
                    <textarea id="summernote" class="form-control" rows="10" name="content" required>
                    </textarea>
                </div>
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-primary btn-sm">확인</button>
                <button type="reset" class="btn btn-warning btn-sm" style="color: #fff">취소</button>
            </div>
        </form>
    </div>
</div>
</body>
</html>
