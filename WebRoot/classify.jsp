<%--
  Created by IntelliJ IDEA.
  User: Mr.zhong
  Date: 2018/10/10
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="top.jsp"></jsp:include>
</head>
<body>
    <meta charset="UTF-8">
    <title>商品详细分类</title>
    <meta content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0" name="viewport"/>
    <meta content="yes" name="apple-mobile-web-app-capable"/>
    <meta content="black" name="apple-mobile-web-app-status-bar-style"/>
    <meta content="telephone=no" name="format-detection"/>
    <link href="css/styles.css" rel="stylesheet" type="text/css"/>

<section class="aui-flexView">
    <header class="aui-navBar aui-navBar-fixed">
        <a href="javascript:;" class="aui-navBar-item">
            <i class="icon icon-return"></i>
        </a>
        <div class="aui-center">
            <span class="aui-center-title" style="text-shadow: #220416;color: #220416;size: 50px">商品分类</span>
        </div>
        <a href="javascript:;" class="aui-navBar-item">
            <i class="icon icon-sys"></i>
        </a>
    </header>
    <section class="aui-scrollView">
        <div class="aui-flex">
            <div class="aui-flex-box">鞋子、服饰</div>
            <div class="aui-flex-fri">查看全部</div>
        </div>
        <div class="aui-palace">
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/001.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>voit夏季男鞋</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/002.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>安踏球鞋</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/004.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>Neu情侣装</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/005.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>夏季情侣装</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/014.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>吃货情侣装</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/015.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>legis套装</h2>
                </div>
            </a>
        </div>
        <div class="divHeight"></div>
        <div class="aui-flex">
            <div class="aui-flex-box">笔记本电脑</div>
            <div class="aui-flex-fri">查看全部</div>
        </div>
        <div class="aui-palace aui-palace-two">
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/010.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>ipad</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/009.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>戴尔笔记本</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/011.png" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>联想笔记本</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/008.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>外星人笔记本</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/012.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>惠普电脑</h2>
                </div>
            </a>
            <a href="javascript:;" class="aui-palace-grid">
                <div class="aui-palace-grid-icon">
                    <img src="images/013.jpg" alt="">
                </div>
                <div class="aui-palace-grid-text">
                    <h2>华硕电脑</h2>
                </div>
            </a>
        </div>
        <div class="aui-palace aui-palace-three" style="margin-left: 50px">
            <a href="javascript:;" class="aui-palace-grid">苹果</a>
            <a href="javascript:;" class="aui-palace-grid">戴尔</a>
            <a href="javascript:;" class="aui-palace-grid">外星人</a>
            <a href="javascript:;" class="aui-palace-grid">华硕</a>
            <a href="javascript:;" class="aui-palace-grid">联想</a>
            <a href="javascript:;" class="aui-palace-grid">惠普</a>
        </div>

    </section>
</section>

<jsp:include page="copyright.jsp"></jsp:include>
</body>
</html>
