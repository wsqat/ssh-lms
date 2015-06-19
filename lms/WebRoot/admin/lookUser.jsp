<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>查看用户信息</title>
	<script type="text/javascript">
		function del(){
			if(confirm("Are you sure?")){
				return true;
			}
			return false;
		}
	</script>
  </head>
  
  
<jsp:include page="../include/header.jsp" />
<% 
String name = (String)session.getAttribute("username");
String role = "门店经理";
if(name.compareTo("admin")==0){
	role = "总店经理";
%>
<jsp:include page="../include/z_lefter.jsp" />
<%	
}else{
	role = "门店经理";
%>
<jsp:include page="../include/lefter.jsp" />
<%} 
%>
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>用户信息介绍</strong>
		  <p>您当前的身份是：<%=role %></p>
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>用户名称</th>
	    		<th>用户密码</th>
	    		<th>用户身份</th>
	    		<th>所属门店</th>
	    		<th>操作</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.userlist" id="us">
	    		<tr>
	    			<td>
	    				<s:property value="#us.username"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.password"/>
	    			</td>
	    			<td>
	    				<%=role %>
	    			</td>
	    			<td>
	    				<%=session.getAttribute("mdmc") %>
	    			</td>
	    			<td>
	    				<a href="updateUserPwd.action" class='button button-small border-green'>修改密码</a>  
	    			</td>
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
	    </div>
        
    </blockquote>
  </body>
</html>
