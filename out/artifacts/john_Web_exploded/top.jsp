<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

    <title>导航页面</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
	body,html,div{ padding:0; margin:0;}
	  #top{
			width:1550px;
			height:200px;
		}
	  ul{
	    list-style-type:none;
	    margin:0;
	    padding:0;
	    overflow:hidden;
	    background-color:#1a7a12;
	  }

	  li{
	    float:left;
	    border-right: 1px solid #bbb;
	  }
	  .active {
    	background-color: crimson;
		}
	  li a, .dropbtn
	  {
	    display:inline-block;
	    color:cyan;
	    text-align:center;
	    padding:14px 16px;
	    text-decoration:none;
	  }

	  li a:hover, .dropdown:hover, .dropbtn
	  {
	    background-color:#111;
	  }

	  .dropdown
	  {
	    display:inline-block;
	  }

	  .dropdown-content
	  {
	    display:none;
	    position:absolute;
	    background-color:black;
	    min-width:100px;
	    box-shadow:0px 8px 16px 0px rgba(0,0,0,0.2);
	  }

	  .dropdown-content a
	  {
	    color:black;
	    padding:12px 16px;
	    text-decoration:none;
	    display:block;
	  }

	  .dropdown-content a:hover {background-color:black}

	  .dropdown:hover .dropdown-content
	  {
	    display:block;
	  }
</style>
	  <script language="javascript" type="text/javascript">
          function logout(){
       if (confirm("您确定退出？"));
              top.location = "index.jsp";
              return false;
          }
	  </script>
  </head>
  <body>
  	<ul>
  		<li><a class="active" href="first.jsp">主页</a></li>
		<li><a href="items.jsp">商品展示</a></li>
		<li><a href="add_items.jsp">添加商品</a></li>
		<li><a href="classify.jsp">商品分类</a></li>
		<li><a href="owns.jsp">个人中心</a></li>
		<li><a href="detail.jsp">关于我们</a></li>
		<li><a onclick="logout()" href="index.jsp">退出系统</a></li>
	</ul>
  </body>
</html>
