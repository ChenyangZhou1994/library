<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>图书馆管理系统</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/css/bootstrap/js/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/sort.js"></script>
    <script src="${pageContext.request.contextPath}/js/holder.js"></script>
</head>
<body>
<div id="main" class="container">
    <div id="header">
        <%@ include file="header.jsp" %>
        <!-- 旋转图 -->
        <div class="header-bottom">
            <div class="sort">
                <div class="sort-channel">
                    <ul class="sort-channel-list list-group">
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=经济">经济</a></li>
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=计算机">计算机</a></li>
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=艺术">艺术</a></li>
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=语言">语言</a></li>
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=学习用品">天文学</a></li>
                        <li class="list-group-item"><a href="${pageContext.request.contextPath}/category?cate=生物科学">生物科学</a>
                        </li>
                    </ul>
                </div>
            </div>
            <div id="mycarousel" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="${pageContext.request.contextPath}/image/4.jpg" alt="">
                    </div>

                    <div class="item">
                        <img src="${pageContext.request.contextPath}/image/3.jpg" alt="">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/image/5.jpg" alt="">
                    </div>
                    <div class="item">
                        <img src="${pageContext.request.contextPath}/image/6.jpg" alt="">
                    </div>
                </div>

                <ol class="carousel-indicators">
                    <li data-target="#mycarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#mycarousel" data-slide-to="1"></li>
                    <li data-target="#mycarousel" data-slide-to="2"></li>
                    <li data-target="#mycarousel" data-slide-to="3"></li>
                </ol>

                <a class="left carousel-control" href="#mycarousel" role="button"
                   data-slide="prev" style="display: none;"> <span
                        class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a> <a class="right carousel-control" href="#mycarousel" role="button"
                        data-slide="next" style="display: none;"> <span
                    class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </a>
            </div>
            <div class="clear-float"></div>
        </div>
    </div>
    <div class="content">

        <c:if test="${!empty digGoods}">
            <div class="module">
                <div class="hd">
                    <h2>计算机</h2>
                    <hr>
                </div>

                <div class="bd">
                    <div class="data">
                        <ul>
                            <c:forEach items="${digGoods}" var="goods">
                                <li class="data-item-li">
                                    <div class="to-big">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${goods.goodsid}"><img src="/shopimage/${goods.imagePaths[0].path}" alt=""
                                                        width="200" height="200"/>
                                        </a>
                                    </div>
                                    <p class="text-right">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${goods.goodsid}">${goods.goodsname}</a>
                                    </p>
                                    <div class="text-right">
                                        <b>￥${goods.price}</b>
                                    </div>
                                    <div>
                                        <c:if test="${goods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart btn btn-default"
                                                    data-id="${goods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <c:if test="${!goods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart-empty btn btn-default"
                                                    data-id="${goods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <!-- <button class="like-button1 glyphicon glyphicon-heart-empty btn btn-default "></button> -->
                                    </div>
                                </li>
                            </c:forEach>


                            <div class="clear-float" style="clear: both;"></div>
                        </ul>
                    </div>
                </div>
            </div>
        </c:if>

        <c:if test="${!empty houseGoods}">
            <div class="module">
                <div class="hd">
                    <h2>天文学</h2>
                    <hr>
                </div>

                <div class="bd">
                    <div class="data">
                        <ul>
                            <c:forEach items="${houseGoods}" var="housegoods">
                                <li class="data-item-li">
                                    <div class="to-big">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${housegoods.goodsid}"> <img
                                                src="/shopimage/${housegoods.imagePaths[0].path}" alt=""
                                                width="200" height="200">
                                        </a>
                                    </div>
                                    <p class="text-right">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${housegoods.goodsid}">${housegoods.goodsname}</a>
                                    </p>
                                    <div class="text-right">
                                        <b>￥${housegoods.price}</b>
                                    </div>
                                    <div>
                                        <c:if test="${housegoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart btn btn-default"
                                                    data-id="${housegoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <c:if test="${!housegoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart-empty btn btn-default"
                                                    data-id="${housegoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <!-- <button class="like-button1 glyphicon glyphicon-heart-empty btn btn-default "></button> -->
                                    </div>
                                </li>
                            </c:forEach>

                            <div class="clear-float" style="clear: both;"></div>
                        </ul>

                    </div>
                </div>
            </div>
        </c:if>

        <c:if test="${!empty colGoods}">
            <div class="module">
                <div class="hd">
                    <h2>艺术</h2>
                    <hr>
                </div>

                <div class="bd">
                    <div class="data">
                        <ul>
                            <c:forEach items="${colGoods}" var="colgoods">
                                <li class="data-item-li">
                                    <div class="to-big">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${colgoods.goodsid}"> <img
                                                src="/shopimage/${colgoods.imagePaths[0].path}" alt=""
                                                width="200" height="200">
                                        </a>
                                    </div>
                                    <p class="text-right">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${colgoods.goodsid}">${colgoods.goodsname}</a>
                                    </p>
                                    <div class="text-right">
                                        <b>￥${colgoods.price}</b>
                                    </div>
                                    <div>
                                        <c:if test="${colgoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart btn btn-default"
                                                    data-id="${colgoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <c:if test="${!colgoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart-empty btn btn-default"
                                                    data-id="${colgoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <!-- <button class="like-button1 glyphicon glyphicon-heart-empty btn btn-default "></button> -->
                                    </div>
                                </li>
                            </c:forEach>

                            <div class="clear-float" style="clear: both;"></div>
                        </ul>
                    </div>
                </div>
            </div>
        </c:if>

        <c:if test="${!empty bookGoods}">
            <div class="module">
                <div class="hd">
                    <h2>语言</h2>
                    <hr>
                </div>

                <div class="bd">
                    <div class="data">
                        <ul>
                            <c:forEach items="${bookGoods}" var="bookgoods">
                                <li class="data-item-li">
                                    <div class="to-big">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${bookgoods.goodsid}"> <img
                                                src="/shopimage/${bookgoods.imagePaths[0].path}" alt=""
                                                width="200" height="200">
                                        </a>
                                    </div>
                                    <p class="text-right">
                                        <a href="${pageContext.request.contextPath}/detail?goodsid=${bookgoods.goodsid}">${bookgoods.goodsname}</a>
                                    </p>
                                    <div class="text-right">
                                        <b>￥${bookgoods.price}</b>
                                    </div>
                                    <div>
                                        <c:if test="${bookgoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart btn btn-default"
                                                    data-id="${bookgoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <c:if test="${!bookgoods.fav}">
                                            <button
                                                    class="like-button glyphicon glyphicon-heart-empty btn btn-default"
                                                    data-id="${bookgoods.goodsid}"
                                                    style="display: none;"></button>
                                        </c:if>
                                        <!-- <button class="like-button1 glyphicon glyphicon-heart-empty btn btn-default "></button> -->
                                    </div>
                                </li>
                            </c:forEach>

                            <div class="clear-float" style="clear: both;"></div>
                        </ul>
                    </div>
                </div>
            </div>
        </c:if>
    </div>
</div>
</body>
</html>


