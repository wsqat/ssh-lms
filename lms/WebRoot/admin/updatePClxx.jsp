<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看车辆信息</title>
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
<jsp:include page="../include/z_lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->

    <blockquote class="border-main">
	  <strong>车辆信息查看</strong>
		  <!-- <p></p> -->
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>车牌号</th>
	    		<th>载货量</th>
	    		<th>是否空闲</th>
	    		<th>操作一</th>
	    		<th>操作二</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.clxxlist" id="us">
	    		<tr>
	    			<td>
	    				<s:property value="#us.xm"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.lxdh"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.isfree"/>
	    			</td>
	    			<td>  
                    	<s:a href="updateCLxx.action?clxx.bh=%{#us.bh}"><button class="button button-blue">更新</button></s:a>         
                	</td> 
	    			<td>  
                    	<s:a href="deleteCLxx.action?clxx.bh=%{#us.bh}" onclick="return del()"><button class="button button-red">删除</button></s:a>  
                	</td> 
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
	    </div>
        
    </blockquote>
    
    
  </body>
</html>
