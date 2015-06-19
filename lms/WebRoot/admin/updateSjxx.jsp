<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>更新司机信息</title>
  </head>
<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/z_lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>更新司机信息</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
	    	<s:form action="updateOSJxx">
	    	<s:iterator value="#request.sjxxlists" id="sjxx">
	    	<s:hidden name="sjxx.bh" value="%{#sjxx.bh}"></s:hidden>
			<table class="table">
	    	<tr>
	    			<s:textfield name="sjxx.xm" class="input" value="%{#sjxx.xm}" label="司机名称"></s:textfield>
	    	</tr>
	    	<tr>
	    			<s:textfield name="sjxx.lxdh" class="input" value="%{#sjxx.lxdh}" label="联系电话"></s:textfield>  
	    	</tr>
	    	<tr>
			<td>
				<select name="sjxx.isfree" style="width:150px">
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