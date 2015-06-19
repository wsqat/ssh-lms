<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>连锁专卖店管理信息系统</title>
</head>
<% 
	/* 通过判断用户名实现页面跳转 */
	/* String name=(String)session.getAttribute("username"); 
    if(name.compareTo("admin")==0)
		response.sendRedirect("admin/admin_index.jsp"); */
%>
<%
 response.setHeader("refresh","2;url=lookLsshb.action?page=1");//定时跳转
 session.invalidate();//注销
%>

<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/lefter.jsp" />


<body>
	<div class="admin">
		<blockquote class="border-main">
	  		<strong>查询送货表失败</strong>
	  		<h3>你好,你所查询送货表不存在,2秒后跳会</h3>
			<h3>如没有跳转,请按<a href="lookLsshb.action?page=1"><b>这里</b></a>
		  <!-- <p>门店信息</p> -->
		</blockquote>
	</div>
</body>
</html>
