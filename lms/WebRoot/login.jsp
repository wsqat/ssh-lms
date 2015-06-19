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
    <title>用户登录</title>
    <link rel="stylesheet" href="assets/css/pintuer.css">
    <link rel="stylesheet" href="assets/css/admin.css">
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/pintuer.js"></script>
    <script src="assets/js/respond.js"></script>
    <script src="assets/js/admin.js"></script>
    <link type="image/x-icon" href="/favicon.ico" rel="shortcut icon" />
    <link href="/favicon.ico" rel="bookmark icon" />
</head>
<body style="background-image:url('assets/images/bk.png');">
<struts:property value="popedom"/>
	<div class="container">
    <div class="line">
        <div class="xs6 xm4 xs3-move xm7-move">
            <br /><br />
            <div class="media media-y">
                <!-- <a href="#" target="_blank"><img src="assets/images/logo.png" class="radius" alt="后台管理系统" /></a> -->
                <br />
                <br />
                <br />
                <br />
                <br />
                <br />
                <br />
                <br />
                <br />
                <br />
            </div>
            <br /><br />
            <struts:form action="checkLogin.action" namespace="/">
            <div class="panel">
                <div class="panel-head"><strong>登录后台管理系统</strong></div>
                <div class="panel-body" style="padding:30px;">
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="text" class="input" name="username" placeholder="登录账号" data-validate="required:请填写账号,length#>=3:账号长度不符合要求,length#<=10:账号长度不符合要求" />
                            <span class="icon icon-user"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="field field-icon-right">
                            <input type="password" class="input" name="password" placeholder="登录密码" data-validate="required:请填写密码,length#>=3:密码长度不符合要求" />
                            <span class="icon icon-key"></span>
                        </div>
                    </div>
                </div>
                <div class="panel-foot text-center">
                	<%-- <struts:submit value="login" /> --%>
                	<button id="log" class="button button-block bg-main text-big">立即登录后台</button>
				</div>
            </div>
            </struts:form>
        </div>
    </div>
</div>

</body>
</html>
