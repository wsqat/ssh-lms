<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="struts" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>连锁专卖店信息管理系统</title>
    <link rel="stylesheet" href="assets/css/pintuer.css">
    <link rel="stylesheet" href="assets/css/admin.css">
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/pintuer.js"></script>
    <script src="assets/js/respond.js"></script>
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon" />
    <link href="/favicon.ico" rel="bookmark icon" />
</head>
<body>
<div class="lefter">
    <div class="logo"><a href="#"><img src="assets/images/logo.png" alt="连锁专卖店信息管理系统" /></a></div>
</div>
<div class="righter nav-navicon" id="admin-nav">
    <div class="mainer">
        <div class="admin-navbar">
            <span class="float-right">
            	<a class="button button-little bg-main" href="index.jsp">前台首页</a>
                <a class="button button-little bg-yellow" href="logout.jsp">注销登陆</a>
            </span>
            <ul class="nav nav-inline admin-nav">
                <li class="active"><a href="index.php" class="icon-home"> 开始</a>
                	<%-- <jsp:include page="lefter.jsp" /> --%>
                    <!-- <ul>
                    <li><a href='content.php'>简章发布</a></li>
                    <li>999</li>
					</ul> -->
                </li>
                <li>
                </li>
                <li><a href="content.php" class="icon-file-text"> 内容</a>
                </li>
               
            </ul>
        </div>
        <div class="admin-bread">
            <span>您好，<%=session.getAttribute("username") %>，欢迎您的光临。</span>
            <ul class="bread">
                <li><a href="index.php" class="icon-home"> 开始</a></li>
                <li>后台首页</li>
            </ul>
        </div>
    </div>
</div>

<body>

</body>
</html>