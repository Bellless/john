<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>主页</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		body,html,div{ padding:0; margin:0;background: #cabb5c}
		table{
			border-collapse:collapse;
			text-align: center;
		}
		div{
			text-align: center;

		}
	</style>
  <jsp:include page="top.jsp"></jsp:include>
  </head>
  <body>
  <br>
  		<table align="center" width="600" border="1">
  		<tr>
  			<th>商品编号</th>
			<th>商品名称</th>
			<th>产地</th>
			<th>价格</th>
			<th>数量</th>
			<th>图片</th>
			<th align="center" colspan="2">操作</th>
			</tr>
  		<!-- 结合jstl标签库、el表达式迭代输出商品信息 -->
    	<c:forEach items="${list}" var="it" varStatus="currentStatus">
    			<tr>
    				<td>
						<c:out value="${it.id}">

					</c:out></td>
    				<td><c:out value="${it.name}"></c:out></td>
    				<td><c:out value="${it.city}"></c:out></td>
    				<td><c:out value="${it.price}"></c:out></td>
    				<td><c:out value="${it.number}"></c:out></td>
    				<td><img src="images/${it.picture }" width="100" height="66"></td>
    				<td>
    					<form action="${pageContext.request.contextPath}updateItemsServlet" method="post" onsubmit="return check(this);">
    						<input type="hidden" name="id" value="${it.id}">
    						<input type="text" name="number" size="3">
    						<input type="submit" value="修改">
    					</form>
    				</td>
    				<td><a href="deleteItemsServlet?id=${it.id}">删除</a></td>
    			</tr>
    	</c:forEach>
    	</table>
		<p align="center">${bar}</p>
  <!-- jsp包含文件命令 -->
  <jsp:include page="copyright.jsp"></jsp:include>
  </body>
</html>
