<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改密码</title>
<script type="text/javascript">
	function del() {
		if (confirm("Are you sure?")) {
			return true;
		}
		return false;
	}
</script>
</head>
<jsp:include page="../include/header.jsp" />
<% 
String name = (String)session.getAttribute("username");
if(name.compareTo("admin")==0){
%>
<jsp:include page="../include/z_lefter.jsp" />
<%	
}else{
%>
<jsp:include page="../include/lefter.jsp" />
<%} 
%>
<body>
	<div class="admin">
		<!-- <h1><font color="red">门店信息</font></h1> -->

		<blockquote class="border-main">
			<strong>修改密码</strong>
			<!-- <p>门店信息</p> -->

			<div class="table-responsive">
				<s:form action="updateUser">
					<s:iterator value="#request.userlist" id="us">
						<s:hidden name="user.bh" value="%{#us.bh}"></s:hidden>
						<s:hidden name="user.username" value="%{#us.username}"></s:hidden>
						
						<table class="table"  style="width:600px">
							<tr>
								<td>
								<label  >输入用户新登录密码</label>
								</td>
								<td>
								<input type="text"  style="width:200px" class="input" name="user.password" 
										placeholder="输入用户新登录密码" data-validate="required:请填写密码,length#>=3:密码长度不符合要求" />
								</td>
								<br>
								<td>
									<button type="submit" class='button button-main'>提交</button>
								</td>
							</tr>
						</table>
					</s:iterator>
				</s:form>
			</div>
	</div>

	</blockquote>
</body>
</html>