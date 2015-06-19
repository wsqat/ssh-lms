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
	String name=(String)session.getAttribute("username"); 
    if(name.compareTo("admin")==0)
		response.sendRedirect("admin/admin_index.jsp");
%>

<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/lefter.jsp" />
<body>
	<div class="admin">
		<div class="line-big">
			<div class="xm3">
				<div class="panel border-back">
					<div class="panel-body text-center">
						<img src="assets/images/face.jpg" width="120"
							class="radius-circle" /><br />
					</div>
					<div class="panel-foot bg-back border-back">
						您好，666
						<%=session.getAttribute("username") %>
					</div>
				</div>
				<br /> <br />
			</div>
			<div class="xm9">
				<div class="alert">
					<h4>门店经理的功能介绍</h4>
					<p class="text-gray padding-top">
					<b>门店管理</b>可以查看,更新门店信息,查看商品库存;<br>
					<b>报货管理</b>可以半自动化上传报货表,浏览历史报货表;<br>
					<b>收货管理</b>可以上传收货表;<br>
					<b>个人管理</b>可以查看,更新个人信息;<br>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
