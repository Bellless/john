<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <base href="<%=basePath%>">
	  <link rel="stylesheet" href="css/style.css">
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		body,html,div{
			padding:0; margin:0;background: #cabb5c
		}
	</style>
	<jsp:include page="top.jsp"></jsp:include>
  </head>

  <body>
  <br>
  <div style=margin-left:550px>
	  <div class="loader">
		  <div class="face">
			  <div class="circle"></div>
		  </div>
		  <div class="face">
			  <div class="circle"></div>
		  </div>
	  </div>
  </div>
  <h2 align="center">商品管理系统</h2>
  	<div>
		<form action="${pageContext.request.contextPath}/loginServlet" method="post">
				<table align="center" width="350" height="200">
					<tr>
						<td>用户名:</td>
						<td><input type="text" name="username">&nbsp;<font color="red">
						${requestScop.namemsg}${requestScope.nameError}</font></td>
					</tr>
					<tr>
						<td>密码:</td>
						<td><input type="password" name="password">&nbsp;<font color="red">
						${requestScope.pwdError}${requestScope.pwdmsg}</font></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="登录"
								   style="width:60px;background: #3f4bbf;border-color: #3f4bbf">
						&nbsp;<input type="reset" value="取消"
									 style="width:60px;background: #44822a;border-color: #44822a"></td>
					</tr>
				</table>
		</form>
	</div>
  <hr>
  <p align="center" style="color: #ed080a" >账号密码由数据库提供！详情请登录数据库查看</p>
	<jsp:include page="copyright.jsp"></jsp:include>
  </body>
</html>
