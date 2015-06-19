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
	  <strong>更新门店信息</strong>
		  <!-- <p>门店信息</p> -->
		
	    <div class="table-responsive">
	    	<s:form action="updateMdxx">
	    	<s:iterator value="#request.mdxxblist" id="us">
		<table class="table">
		
	    	<tr>
	    		<td>
	    			<s:hidden name="mdxx.mdbh" value="%{#us.mdbh}"></s:hidden>  
	    		</td>
	    		<td>
	    			<s:textfield name="mdxx.mdmc" value="%{mdxx.mdmc}" label="门店名称"></s:textfield>
	    		</td>
	    		<td>
	    			<s:hidden name="mdxx.mdjl" value="%{#us.mdjl}"></s:hidden>  
	    		</td>
	    		<%-- <td>
	    			<s:textfield class="input" name="mdxx.lxdh" value="%{#us.mdjl}" label="门店地址"></s:textfield>
	    		</td> --%>
	    		<td>
	    			<s:textfield name="mdxx.lxdh" value="%{mdxx.lxdh}" label="联系电话"></s:textfield>
	    		</td>
	    		<td>
	    			<s:textfield name="mdxx.dz" value="%{mdxx.dz}" label="门店地址"></s:textfield>
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