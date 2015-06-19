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

<%-- <jsp:include page="../include/header.jsp" />
<jsp:include page="../include/lefter.jsp" /> --%>
  <body>
    <h2><font color="red">查看门店信息</font></h2>
    <s:a href="/lms/index.jsp">返回</s:a>
    
    	用户名<%=name%>
    
    <table border="1" width="80%" align="center">
    	<tr>
    		<th>门店编号</th>
    		<th>门店名称</th>
    		<th>门店经理</th>
    		<th>联系电话</th>
    		<th>删除</th>
    		<th>更新</th>
    	</tr>
    	
    	<s:iterator value="#session.mdxxblist1" id="us">
    		<tr>
    			<td>
    				<s:property value="#us.mdbh"/>
    			</td>
    			<td>
    				<s:property value="#us.mdmc"/>
    			</td>
    			<td>
    				<s:property value="#us.mdjl"/>
    			</td>
    			<td>
    				<s:property value="#us.lxdh"/>
    			</td>
    			<td align="center">
					<s:a href="updatePUser.action?user.id=%{#us.id}">Update</s:a>		
    			</td>
    		</tr>
    	</s:iterator>
    </table>
    
  </body>
</html>
