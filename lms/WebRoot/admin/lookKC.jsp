<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>查看商品库存</title>
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
<jsp:include page="../include/lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>查看商品库存</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>男女式</th>
	    		<th>款式</th>
	    		<th>数量</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.goodlist" id="good">
	    		<tr>
	    			<td>
	    				<s:property value="#good.xb"/>
	    			</td>
	    			<td>
	    				<s:property value="#good.xks"/>
	    			</td>
	    			<td>
	    				<s:property value="#good.num"/>
	    			</td>
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
	    </div>
        
    </blockquote>
  </body>
</html>
