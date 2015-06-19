<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'lookMdxx.jsp' starting page</title>
	<script type="text/javascript">
		function del(){
			if(confirm("Are you sure?")){
				return true;
			}
			return false;
		}
	</script>
  </head>
<jsp:include page="include/header.jsp" />
<jsp:include page="include/lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>门店信息介绍</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>门店编号</th>
	    		<th>门店名称</th>
	    		<th>门店经理</th>
	    		<th>联系电话</th>
	    		<th>门店地址</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.mdxxblist" id="us">
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
	    			<td>
						<s:property value="#us.dz"/>		
	    			</td>
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
	    </div>
        
    </blockquote>
  </body>
</html>
