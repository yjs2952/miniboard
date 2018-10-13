<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <jsp:include page="/WEB-INF/views/layout/head.jsp" flush="false"/>
    <script type="text/javascript">
        $(function(){
            $(".click-table").click(function(){
                var href = $(this).attr("href");
                window.location = href;
            })
        })
    </script>
</head>
<body>
<div class="container">
    <jsp:include page="/WEB-INF/views/layout/header.jsp" flush="false"/>
    <div class="content">
        <div class="mb-3">
            <nav class="m-3 ">
                <div class="nav nav-tabs" id="nav-tab" role="tablist">
                    <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab"
                       aria-controls="nav-home" aria-selected="true">챔피언 정보</a>
                    <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab"
                       aria-controls="nav-profile" aria-selected="false">능력치</a>
                    <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab"
                       aria-controls="nav-contact" aria-selected="false">스킬</a>
                </div>
            </nav>
            <div class="tab-content mx-4" id="nav-tabContent">
                <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                    <table class="table table-striped table-bordered col-8">
                        <colgroup>
                            <col width="60%">
                            <col width="40%">
                        </colgroup>
                        <tbody>
                        <tr>
                            <td>볼리베어</td>
                            <td rowspan="3" class="text-center" style="vertical-align: middle">이미지 넣고싶은데....</td>
                        </tr>
                        <tr>
                            <td>크아앙....</td>
                        </tr>
                        <tr>
                            <td>탱커</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                    <table class="table table-bordered table-sm col-8">
                        <colgroup>
                            <col width="30%">
                            <col width="40%">
                            <col width="30%">
                        </colgroup>
                        <thead class="thead-light">
                        <tr class="text-center">
                            <th>구분</th>
                            <th>1레벨 (레벨당 성장 수치)</th>
                            <th>18레벨 최종 수치</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>체력</td>
                            <td>111</td>
                            <td>111</td>
                        </tr>
                        <tr>
                            <td>마나</td>
                            <td>111</td>
                            <td>111</td>
                        </tr>
                        <tr>
                            <td>공격력</td>
                            <td>111</td>
                            <td>111</td>
                        </tr>
                        <tr>
                            <td>방어력</td>
                            <td>111</td>
                            <td>111</td>
                        </tr>
                        <tr>
                            <td>사정거리</td>
                            <td>111</td>
                            <td>111</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
                <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                    <ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="pills-passive-tab" data-toggle="pill" href="#passive"
                               role="tab"
                               aria-controls="passive" aria-selected="true">패시브</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="pills-q-tab" data-toggle="pill" href="#skillq" role="tab"
                               aria-controls="skillq" aria-selected="false">Q</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="pills-w-tab" data-toggle="pill" href="#skillw" role="tab"
                               aria-controls="skillw" aria-selected="false">W</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="pills-e-tab" data-toggle="pill" href="#skille" role="tab"
                               aria-controls="skille" aria-selected="false">E</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="pills-r-tab" data-toggle="pill" href="#skillr" role="tab"
                               aria-controls="skillr" aria-selected="false">R</a>
                        </li>
                    </ul>
                    <div class="tab-content mx-3" id="pills-tabContent">
                        <div class="tab-pane fade show active" id="passive" role="tabpanel" aria-labelledby="skill">
                            <div class="jumbotron col-8">
                                <p class="lead">폭풍이 택한 자 (Chosen of the Storm)</p>
                                <hr class="my-4">
                                <p>체력이 30% 이하가 되면 최대 체력의 30%를 6초에 걸쳐 회복합니다. 재사용 대기시간은 120초입니다.</p>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="skillq" role="tabpanel" aria-labelledby="skillq">
                            <div class="jumbotron col-8">
                                <p class="lead">천둥 몰아치기 (Rolling Thunder)</p>
                                <hr class="my-4">
                                <p>볼리베어가 네 발로 뛰어다니며 적을 사냥하며 이동 속도가 4초간 15/17.5/20/22.5/25% 상승합니다. 적 챔피언에게 다가갈 때는 이동 속도가
                                    30/37.5/45/52.5/60%까지 상승합니다. 이 때 볼리베어의 다음 공격은 추가로 30/60/90/120/150의 물리 피해를 가하며 대상을 등
                                    뒤로
                                    넘겨 버립니다.</p>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="skillw" role="tabpanel" aria-labelledby="skillw">
                            <div class="jumbotron col-8">
                                <p class="lead">광란 (Frenzy)</p>
                                <hr class="my-4">
                                <p>
                                    기본 지속 효과: 볼리베어가 공격을 할 때마다 공격 속도가 4/8/12/16/20% 상승합니다. 최대 3번까지 중첩됩니다.
                                    <br/><br/>
                                    사용시: 볼리베어의 광란 효과가 세 번 중첩되면 적을 물어뜯어 60/110/160/210/260(+추가 체력의 15%)의 물리 피해를 줍니다.
                                    물어뜯기의
                                    피해량은 적이 체력을 1% 잃을 때마다 1% 증가합니다. 볼리베어가 미니언 또는 몬스터를 물어뜯으면 광란 스킬 재사용 대기시간이 50% 줄어듭니다.
                                </p>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="skille" role="tabpanel" aria-labelledby="skille">
                            <div class="jumbotron col-8">
                                <p class="lead">우렁찬 포효 (Majestic Roar)</p>
                                <hr class="my-4">
                                <p>
                                    볼리베어가 주위 적에게 60/105/150/195/240 (+0.6AP)의 마법 피해를 주고, 적을 살짝 밀어내며 3초 동안
                                    30/35/40/45/50%의
                                    둔화 효과를 겁니다. 공중에 떴거나 돌진하는 적은 40/60/80/100/120(+0.3AP)의 마법 피해를 추가로 받습니다.
                                    <br/><br/>
                                    미니언과 몬스터는 추가로 공포에 걸립니다. (범위: 425)
                                </p>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="skillr" role="tabpanel" aria-labelledby="skillr">
                            <div class="jumbotron col-8">
                                <p class="lead">천둥 발톱 (Thunder Claws)</p>
                                <hr class="my-4">
                                <p>
                                    볼리베어가 폭풍의 힘을 빌어 12초 동안 매 기본 공격 시 75/115/155 (+0.3AP)의 마법 피해를 주며 근처 8명의 적에게 연쇄 피해를
                                    입힙니다.
                                    <br/><br/>
                                    스킬을 시전하면 즉시 번개가 1회 뻗어나와 적에게 피해를 입힙니다.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div>
            <table class="table table-striped table-hover mx-4">
                <colgroup>
                    <col width="20%">
                    <col width="40%">
                    <col width="20%">
                    <col width="20%">
                </colgroup>
                    <thead>
                        <tr>
                            <th>챔피언</th>
                            <th>제목</th>
                            <th>작성자</th>
                            <th>날짜</th>
                        </tr>
                    </thead>
                <tbody>
                    <tr class="click-table" style="cursor: pointer" href="#">
                        <td>볼리베어</td>
                        <td>[M2] 자박곰 탑볼리베어[7]</td>
                        <td>곰탱이</td>
                        <td>2018-10-10</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>

