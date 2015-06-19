<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>添加车辆信息</title>
  </head>
<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/z_lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>添加车辆信息</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
	    	<s:form action="addCLxx">
			<table class="table">
			<s:hidden name="clxx.isfree"  value="是"></s:hidden>
	    	<tr>
	    		<td>
	    			<s:textfield name="clxx.xm" value="" label="司机名称"></s:textfield>
	    		</td>
	    		<td>
	    			<s:textfield name="clxx.lxdh" value="" label="联系电话"></s:textfield>  
	    		</td>
	    	</tr>
	    	<tr>
			<td>
				<button type="submit" class='button button-main'>提交</button>
			</td>
		</tr>	
		   </table>
		   </s:form>
		</div>
	    </div>
        
    </blockquote>
  </body>
</html>