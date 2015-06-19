<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>连锁专卖店管理信息系统</title>
<link rel="stylesheet" href="admin/css/style.css"/>
<script type="text/javascript" src="admin/js/demo.js"></script>
<!-- <link href="css/menu.css" rel="stylesheet" type="text/css" /> -->
<script src="admin/js/jquery-1.9.1.min.js" type="text/javascript"></script>
</head>
<jsp:include page="include/header.jsp" />
<jsp:include page="include/lefter.jsp" />
<body>
	<div class="admin">
	
	<div class="catbox" >

	
	<!-- goodlist -->
	<div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>男/女鞋</th>
	    		<th>款式</th>
	    		<th>码数</th>
	    		<th>颜色</th>
	    		<th>单价</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.goodlist" id="good">
	    		<tr>
	    			<td>
	    				<s:property value="#good.xb"/>
	    			</td>
	    			<td>
	    				<s:property value="#good.ks"/>
	    			</td>
	    			<td>
	    				<s:property value="#good.ms"/>
	    			</td>
	    			<td>
	    				<s:property value="#good.color"/>
	    			</td>
	    			<td>
						<s:property value="#good.price"/>		
	    			</td>
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
</div>
	</div>
</body>
</html>
