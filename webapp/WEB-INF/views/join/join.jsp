<%--
  Created by IntelliJ IDEA.
  User: knh51
  Date: 2018-10-11
  Time: 오후 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <style>
        #wrap{
            width:530px;
            margin-left:auto;
            margin-right:auto;
            text-align:center;
        }

        table{
            margin-left:auto;
            margin-right:auto;
            border:3px solid skyblue
        }

        td{
            border:1px solid skyblue
        }

        #title{
            background-color:skyblue
        }
    </style>
</head>
<body>
<div id="wrap">
    <br><br>
    <b>회원가입</b>
    <br><br>
    <form method="post" action="/join">
        <table>
            <tr>
                <td id="id">아이디</td>
                <td>
                    <input type="text" name="id" maxlength="20">
                    <input type="button" value="중복확인" >
                </td>
            </tr>

            <tr>
                <td id="password">비밀번호</td>
                <td>
                    <input type="password" name="password" maxlength="15">
                </td>
            </tr>

            <tr>
                <td id="password-warning">비밀번호 확인</td>
                <td>
                    <input type="password" name="passwordcheck" maxlength="15">
                </td>
            </tr>

            <tr>
                <td id="name">이름</td>
                <td>
                    <input type="text" name="name" maxlength="40">
                </td>
            </tr>

            <tr>
                <td id="email1">이메일</td>
                <td>
                    <input type="text" name="email_1" maxlength="30">@
                    <select name="email_2">
                        <option>naver.com</option>
                        <option>daum.net</option>
                        <option>gmail.com</option>
                        <option>nate.com</option>
                    </select>
                </td>
            </tr>


        </table>
        <br>
        <input type="submit" value="가입"/>  <input type="button" value="취소">
    </form>
</div>
</body>
</html>
