<%@ page import="com.jnshu.model.Vocation_msg" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>无标题文档</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
    <script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="../css/t11.css" rel="stylesheet" type="text/css">
    <link href="../css/base.css" rel="stylesheet" type="text/css">
</head>
<body>
<header>
    <div class="top container">
        <p class="hidden-xs">客服热线：010-594-78634</p>
        <img src="../imges/12321.gif">
    </div>

    <div role="navigation" class="nav1 navbar navbar-default">
        <div class="container">
            <div class="header-logo">
                <div class="logo-middle"><img src="../imges/logo.png"></div>
            </div>
            <div class="navbar-header marginTop">
                <button data-target="#example-navbar-collapse" data-toggle="collapse" class="navbar-toggle"
                        type="button">
                    <span class="sr-only">切换导航</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
    <%--<nav class="navbar navbar-default">--%>
        <%--<div class="container">--%>
            <%--<div class="navbar-header">--%>
                <%--<a href="#" class="navbar-brand">--%>
                    <%--<img src="imges/logo.png" alt="Brand" class="img-responsive">--%>
                <%--</a>--%>

            <div id="example-navbar-collapse" class=" collapse navbar-collapse">
                <ul class="nav navbar-nav">


                    <a href="/Task01/getvocation?id=4">
                        <li>首 页</li>
                    </a>
                    <a href="/Task01/u/getvocation?id=0">
                        <li>职 业</li>
                    </a>
                    <a href="">
                        <li>推 荐</li>
                    </a>
                    <a href="">
                        <li>关 于</li>
                    </a>
                </ul>
            </div>
        </div>

    </div>

</header>

<div class="container padding-bottom">
    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <span class="">方向：</span>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <c:forEach items="${list}" var="vocation_msg">
            <a class="nav-bar-a" href="">${vocation_msg.h1}</a>
        </c:forEach>
    </div>
    <c:forEach items="${list}" var="vocation_msg">
        <h2 hidden>haha</h2>
        <div class="caption">
            <h4>${vocation_msg.h2}</h4>
        </div>
        <div class="row">
            <c:forEach begin="1" step="1" end="3">
                <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                    <div class="warp-border">
                        <div class="clearfix">
                            <div class="icon-people"><img src="imges/687.png"></div>
                            <div class="text">
                                <h4 class="">${vocation_msg.vocation}</h4>
                                <p class="text-present">${vocation_msg.vocation_itrduc}</p>
                            </div>
                        </div>
                        <div class="warp-class2">
                            <div class="warp-class2-text">
                                <div class="iconfont text-padding">门槛<c:forEach begin="1" step="1"
                                                                                end="${vocation_msg.sill}"><img
                                        src="imges/xx.png"></c:forEach></div>
                            </div>
                            <div class="warp-class2-text">
                                <div class="iconfont text-padding text-border-left">难易程度 <c:forEach begin="1"
                                                                     step="1" end="${vocation_msg.sill_liv}"><img
                                        src="imges/xx.png"></c:forEach></div>
                            </div>
                        </div>
                        <div class="warp-class2">
                            <div class="warp-class2-text">
                                <div class="iconfont text-padding">成长周期 <span
                                        class="iconfont-color">${vocation_msg.grow_cyc}</span>年
                                </div>
                            </div>
                            <div class="warp-class2-text">
                                <div class="iconfont text-padding text-border-left">稀缺程度 <span
                                        class="iconfont-color">${vocation_msg.rare_liv}</span>家公司需要
                                </div>
                            </div>
                        </div>
                        <div class="warp-class2">
                            <div class="leftWarp">
                                薪资待遇
                            </div>
                            <div class="rightWarp">
                                <div class="rightWarp-class">
                                    <div class="rightWarp-year">${vocation_msg.t1}年</div>
                                    <div class="rightWarp-wages">${vocation_msg.k1}/月</div>
                                </div>
                                <div class="rightWarp-class">
                                    <div class="rightWarp-year">${vocation_msg.t2}年</div>
                                    <div class="rightWarp-wages">${vocation_msg.k2}/月</div>
                                </div>
                                <div class="rightWarp-class border-bottom">
                                    <div class="rightWarp-year">${vocation_msg.t3}年</div>
                                    <div class="rightWarp-wages">${vocation_msg.k3}/月</div>
                                </div>
                            </div>
                        </div>
                        <div class="warp-class2">
                            <b class="text-b">有${vocation_msg.study_num}人正在学</b>
                        </div>
                        <div class="warp-class2">
                            <p class="text-p">${vocation_msg.hint_msg}</p>
                        </div>

                        <div class="flip-container">
                            <p class="flip-title">${vocation_msg.vocation}</p>
                            <p class="flip-text">${vocation_msg.vocation_itrduc}</p>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </c:forEach>
</div>
<!--footer-->
<footer class="footer">
    <div class="container height">
        <div class="row">
            <div class="text-left col-sm-4">
                <span>技能树 &mdash; 改变你我</span>
                <p class="bottom">关于我们 | 联系我们 | 合作企业</p>
            </div>
            <div class="text-center col-sm-4">
                <p>旗下网站</p>
                <span>草船云孵化器     最强IT特训营</span>
                <span>葡萄藤轻游戏     桌游精灵</span>
            </div>
            <div class="text-right col-sm-4">
                <p>微信公众号</p>
                <img src="imges/2524.jpg">
            </div>
        </div>

    </div>
    <div class="footer-bottom">
        Copyright &copy; 2015技能树 www.jnshu.com All Rights Reserved | 京ICP
    </div>
</footer>

</body>
<script>

</script>
</html>