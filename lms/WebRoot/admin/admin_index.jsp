<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>连锁专卖店管理信息系统</title>
</head>
<jsp:include page="include/header.jsp" />
<jsp:include page="include/z_lefter.jsp" />
<body>
	<div class="admin">
		<div class="line-big">
			<div class="xm3">
				<div class="panel border-back">
					<div class="panel-body text-center">
						<img src="../assets/images/face.jpg" width="120"
							class="radius-circle" /><br />
					</div>
					<div class="panel-foot bg-back border-back">
						您好，
						<%=session.getAttribute("username") %>，
					</div>
				</div>
				<br /> <br />
			</div>
			<div class="xm9">
				<div class="alert">
					<h4>总店经理的功能介绍</h4>
					<p class="text-gray padding-top">
					<b>总店管理</b>可以查看，更新总店信息;<br>
					<b>仓库管理</b>可以查看，更新仓库商品信息;<br>
					<b>送货信息管理</b>可以自动生成送货表、浏览历史库存信息;<br>
					<b>门店信息管理</b>可以查看各门店商品库存信息;<br>
					<b>司机信息管理</b>可以查看,更新司机信息;<br>
					<b>车辆信息管理</b>可以查看,更新车辆信息;<br>
					<b>个人信息管理</b>可以查看,更新个人信息;<br>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
