<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="my.example.miniboard.vo.User"%>
<html>
<head>
    <title>회원가입 처리</title>
    <link href="/css/join_style.css" rel="stylesheet">



</head>
<body>
    <%
        request.setCharacterEncoding("euc-kr");  //한글깨짐 방지
     %>
    <jsp:useBean id="User" class="my.example.miniboard.vo.User" />
    <jsp:setProperty name="User" property="id" />
    <jsp:setProperty name="User" property="password" />
    <jsp:setProperty name="User" property="name" />
    <jsp:setProperty name="User" property="email1" />
    <jsp:setProperty name="User" property="email2" />


    <div id="wrap">
        <br><br>
        <b>회원가입 정보를 확인하세요.</b>
        <br><br>
        <%=User.getName()%>님 가입을 축하드립니다.
        <br><br>

        <table>

            <tr>
                <td class="title">아이디</td>
                <td>${requestScope.id}</td>
            </tr>
            <tr>
                <td class="title">비밀번호</td>
                <td>${requestScope.password}</td>
            </tr>
            <tr>
                <td class="title">이름</td>
                <td>${requestScope.name}</td>
            </tr>
            <tr>
                <td class="title">이메일</td>
                <td>
                    <%=User.getEmail1()%>@<%=User.getEmail2()%>
                </td>
            </tr>
        </table>

            <br>
            <input type="button" value="확인" onclick="location.href='index.jsp'">
        </div>


</body>
</html>
