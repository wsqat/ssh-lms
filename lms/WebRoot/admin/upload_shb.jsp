<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>录入收货表</title>
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
<jsp:include page="../include/lefter.jsp" />


<body>
	<div class="admin">
		<!-- <h1><font color="red">门店信息</font></h1> -->
<%-- 		<h2>
			<strong>报货表</strong>
		</h2> --%>
		<br>

		<blockquote class="border-main">
			<strong>录入收货表</strong>
			<!-- <p>门店信息</p> -->
		</blockquote>
			<br>
		<s:form action="createShb">
		<table class="table table-bordered">
			<tr>
				<th>男女式</th>
				<th>款式</th>
				<th>数量</th>
			</tr>
			
			<%
			for(int a=0;a<5;a++){
			%>
			
			<s:iterator value="#request.lsshblist" id="good" status='st'>
				<%-- <s:hidden name="xb" value="%{#good.xb}"></s:hidden>
				<s:hidden name="xks" value="%{#good.xks}"></s:hidden> --%>
				<%-- <s:property value='#st.index' /> --%>
				<!-- <input  type="text" name="num#st.index"> -->
				<%-- <s:hidden name="lsshb.price" value="%{#good.price}"></s:hidden> --%>
	    		<tr>
		    		<td>
	    				<s:property value="#good.xb" />
	    			</td>
	    			<td>
	    				<s:property value="#good.xks" />
	    			</td>
	    			<td><div class="x4 x1-move">
	    				<input type="number" class="input" name="num<%=a %>" 
						size="30" data-validate="required:必填,compare#>1:数值须大于1,currency"
						placeholder="请输入数目" />
						</div>
	    			</td>
	    		</tr>
	    		<%a++;%>
	    	</s:iterator>
	    	<%}%>
		</table>
		<br/><br/>
			<div class="x2 x9-move"><button type="submit" class='button button-red'>录入收货表</button></div>
		</s:form>
		<%-- <struts:form action="checkLogin" namespace="/"> --%>




	</div>
	</div>

</body>
</html>
