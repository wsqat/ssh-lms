<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>更新车辆信息</title>
  </head>
<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/z_lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>更新车辆信息</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
	    	<s:form action="updateOCLxx">
	    	<s:iterator value="#request.clxxlists" id="clxx">
	    	<s:hidden name="clxx.bh" value="%{#clxx.bh}"></s:hidden>
			<table class="table">
	    	<tr>
	    			<s:textfield name="clxx.cph" class="input" value="%{#clxx.cph}" label="车牌号"></s:textfield>
	    	</tr>
	    	<tr>
	    			<s:textfield name="clxx.zhl" class="input" value="%{#clxx.zhl}" label="载货量"></s:textfield>  
	    	</tr>
	    	<tr>
			<td>
				<select name="clxx.isfree" style="width:150px">
	    				<option value="是" >空闲</option>
	    				<option value="否" >不空闲</option>
	    			</select>
	    	
			</td>
		</tr>
	    	<tr>
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