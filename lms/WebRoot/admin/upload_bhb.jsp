<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>上传报货表</title>
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
		<h2>
			<strong>报货表</strong>
		</h2>
		<br>
		<s:form action="createBhb">
			<div class="form-group">
				<div class="x2">
					<strong style="font-size:20px;">千元用量(>1000):</strong>
				</div>
				<div class="x4 x1-move">
					<input type="number" class="input" id="money" name="money"
						size="30" data-validate="required:必填,compare#>100:数值须大于1000,currency,学费为货币"
						placeholder="请输入千元用量,千元用量为货币" />
					<p class="text-dot">(*请输入千元用量,千元用量>1000)</p>
				</div>
				&nbsp;&nbsp;&nbsp;&nbsp;
				<div class="x2 x1-move">
					<button type="submit" class='button button-main'>生成</button>
				</div>

			</div>
		</s:form>

		<%-- <blockquote class="border-main">
			<strong>报货表</strong>
			<!-- <p>门店信息</p> -->
		</blockquote> --%>
		
		<%

		List baohuolist = (List)request.getAttribute("baohuolist");
		%>
		<s:form action="UploadPBhb">
		<table class="table table-bordered">
			<tr>
				<th>男女式</th>
				<th>款式</th>
				<th>手动数量</th>
				<th>千元自动数量</th>
				<th>价格</th>
			</tr>
			<%
				for(int a=0;a<5;a++){
			%>
			<s:iterator value="#request.baohuolist" id="baohuo">
				<s:hidden name="szjlb.xb" value="%{#baohuo.xb}"></s:hidden>
				<s:hidden name="szjlb.xks" value="%{#baohuo.xbs}"></s:hidden>
				<s:hidden name="szjlb.price" value="%{#baohuo.price}"></s:hidden>
	    		<tr>
		    		<td>
	    				<s:property value="#baohuo.xb" />
	    			</td>
	    			
	    			<td>
	    				<s:property value="#baohuo.xks" />
	    			</td>
	    			<td><div class="x4 x1-move">
	    				<input type="number" class="input" name="num<%=a %>"
						size="30" data-validate="required:必填,compare#>1:数值须大于1,currency"
						placeholder="请输入数目" />
						</div>
	    			</td>
	    			<td>
	    				<s:property value="#baohuo.num" />
	    				
	    				<%-- <s:textfield class="input" name="num<%=a %>" value="%{#baohuo.num}"  ></s:textfield> --%>
	    			</td>
	    			<td>
	    				<s:property value="#baohuo.price"/>
	    			</td>
	    		</tr>
	    		    		<%a++;%>
	    	</s:iterator>
	    	<%}%>
		</table>
		<br/><br/>
			<div class="x2 x9-move"><button type="submit" class='button button-red'>上报报货表</button></div>
		</s:form>
		<%-- <struts:form action="checkLogin" namespace="/"> --%>




	</div>
	</div>

</body>
</html>
