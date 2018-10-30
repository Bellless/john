<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>版权</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		#copyright{
			font-family:微软雅黑;
			text-align:center;
			color:#4a50ed;
			width:1600px;
            height:60px;
			padding-top:5px;
			background-color: #261608;
		}
	</style>
  </head>
  <body>
    <div id="copyright">
    	Copyright © 2018-2020  粤ICP备16039874号 All Rights Reserved<br><hr style="border-color: #3f4bbf">
    	版权所有:重庆安达科技有限公司ByZGL
    </div>
  </body>
</html>
