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
        <div class="mx-5">
            <form>
                <div class="form-row">
                    <div class="col-md-4 mb-3">
                        <label for="validationDefault01">First name</label>
                        <input type="text" class="form-control" id="validationDefault01" placeholder="First name" value="Mark" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationDefault02">Last name</label>
                        <input type="text" class="form-control" id="validationDefault02" placeholder="Last name" value="Otto" required>
                    </div>
                    <div class="col-md-4 mb-3">
                        <label for="validationDefaultUsername">Username</label>
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text" id="inputGroupPrepend2">@</span>
                            </div>
                            <input type="text" class="form-control" id="validationDefaultUsername" placeholder="Username" aria-describedby="inputGroupPrepend2" required>
                        </div>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault03">City</label>
                        <input type="text" class="form-control" id="validationDefault03" placeholder="City" required>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationDefault04">State</label>
                        <input type="text" class="form-control" id="validationDefault04" placeholder="State" required>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationDefault05">Zip</label>
                        <input type="text" class="form-control" id="validationDefault05" placeholder="Zip" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
                        <label class="form-check-label" for="invalidCheck2">
                            Agree to terms and conditions
                        </label>
                    </div>
                </div>
                <button class="btn btn-primary" type="submit">Submit form</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
