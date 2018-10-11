<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <style rel="stylesheet" type="text/css">
        .table td {
            padding-bottom: 0
        }
        form > div label {
            font-weight: 700;
        }
    </style>
    <jsp:include page="/WEB-INF/views/layout/head.jsp" flush="false"/>
</head>
<body>
<div class="container">
    <jsp:include page="/WEB-INF/views/layout/header.jsp" flush="false"/>
    <div class="content my-3">
        <div class="mx-5">
            <form method="post">
                <div class="form-group row">
                    <label for="champName" class="col-sm-2 col-form-label">챔피언 명</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="champName" name="champName">
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2">역할</label>
                    <div class="col-sm-10">
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role1" name="role">
                            <div class="form-check-label" for="role1">
                                전사
                            </div>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role2" name="role">
                            <div class="form-check-label" for="role2">
                                탱커
                            </div>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role3" name="role">
                            <div class="form-check-label" for="role3">
                                암살자
                            </div>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role4" name="role">
                            <div class="form-check-label" for="role4">
                                마법사
                            </div>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role5" name="role">
                            <div class="form-check-label" for="role5">
                                원거리
                            </div>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="role6" name="role">
                            <div class="form-check-label" for="role6">
                                서포터
                            </div>
                        </div>
                    </div>
                </div>
                <br/>
                <div class="form-group row">
                    <label for="champName" class="col-sm-2 col-form-label">능력치</label>
                    <div class="col-sm-10">
                        <div class="form-group row">
                            <div class="col-lg-2 text-center">구분</div>
                            <div class="col-lg-5 text-center">1레벨 (레벨당 성장 수치)</div>
                            <div class="col-lg-5 text-center">18레벨 최종수치</div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">체력</div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="hp1" name="hp1" placeholder="1레벨">
                            </div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="hp18" name="hp18" placeholder="18레벨">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">마나</div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="mp1" name="mp1" placeholder="1레벨">
                            </div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="mp18" name="mp18" placeholder="18레벨">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">공격력</div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="atk1" name="atk1" placeholder="1레벨">
                            </div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="atk18" name="atk18" placeholder="18레벨">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">방어력</div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="df1" name="df1" placeholder="1레벨">
                            </div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="df18" name="df18" placeholder="18레벨">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">사정거리</div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="ar1" name="ar1" placeholder="1레벨">
                            </div>
                            <div class="col-lg-5">
                                <input type="text" class="form-control form-control-sm" id="ar18" name="ar18" placeholder="18레벨">
                            </div>
                        </div>
                    </div>
                </div>
                <br/>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">패시브</label>
                    <div class="col-sm-10">
                        <div class="form-group row">
                            <div class="col-lg-2">패시브 명</div>
                            <div class="col-lg-10">
                                <input type="text" class="form-control form-control-sm" id="passive" name="passive">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">패시브 설명</div>
                            <div class="col-lg-10">
                                <textarea type="text" class="form-control form-control-sm" id="passiveComment" name="passiveComment"></textarea>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="form-group row">
                    <label class="col-sm-2 col-form-label">스킬</label>
                    <div class="col-sm-10">
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 명(Q)</div>
                            <div class="col-lg-10">
                                <input type="text" class="form-control form-control-sm" id="skillQ" name="skillQ">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 설명(Q)</div>
                            <div class="col-lg-10">
                                <textarea type="text" class="form-control form-control-sm" id="skillQComment" name="skillQComment"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 명(W)</div>
                            <div class="col-lg-10">
                                <input type="text" class="form-control form-control-sm" id="skillW" name="skillW">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 설명(W)</div>
                            <div class="col-lg-10">
                                <textarea type="text" class="form-control form-control-sm" id="skillWComment" name="skillWComment"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 명(E)</div>
                            <div class="col-lg-10">
                                <input type="text" class="form-control form-control-sm" id="skillE" name="skillE">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 설명(E)</div>
                            <div class="col-lg-10">
                                <textarea type="text" class="form-control form-control-sm" id="skillEComment" name="skillEComment"></textarea>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 명(R)</div>
                            <div class="col-lg-10">
                                <input type="text" class="form-control form-control-sm" id="skillR" name="skillR">
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-lg-2">스킬 설명(R)</div>
                            <div class="col-lg-10">
                                <textarea type="text" class="form-control form-control-sm" id="skillRComment" name="skillRComment"></textarea>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="form-group row">
                    <div class="col-sm-12 text-center">
                        <button type="submit" class="btn btn-primary">확인</button>
                        <button type="reset" class="btn btn-danger">취소</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
