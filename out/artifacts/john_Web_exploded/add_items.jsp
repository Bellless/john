<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>添加商品信息</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        #d_top {
            height: 50px;
        }
        body,html,div{
            padding:0; margin:0;background: #cabb5c
        }
    </style>
    <jsp:include page="top.jsp"></jsp:include>
</head>
<body>
<form action="${pageContext.request.contextPath}/addItemsServlet" method="post">
    <div id="d_top"></div>
    <table align="center" width="400" height="200">
        <tr>
            <td>商品名称:</td>
            <td><input type="text" name="name">&nbsp;<font color="red">${nerror }</font></td>
        </tr>
        <tr>
            <td>产地:</td>
            <td><input type="text" name="city">&nbsp;<font color="red">${cerror }</font></td>
        </tr>
        <tr>
            <td>价格:</td>
            <td><input type="text" name="price">&nbsp;<font color="red">${perror }</font></td>
        </tr>
        <tr>
            <td>数量:</td>
            <td><input type="text" name="number">&nbsp;<font color="red">${numerror }</font></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="添加" style="background: #4e86ff;width: 150px;border-color: #4e86ff"></td>
        </tr>
    </table>
    <h2 style="color: crimson" align="center">您添加的商品信息保存在商品栏！</h2>
    <hr>
    <h1 align="center" style="color: #1a7a12">欢迎使用重庆安达科技有限公司产品</h1>
</form>
<jsp:include page="copyright.jsp"></jsp:include>
</body>
</html>
