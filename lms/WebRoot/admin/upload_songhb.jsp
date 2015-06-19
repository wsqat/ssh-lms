<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看历史报货表信息</title>
  </head>
  
  
<jsp:include page="../include/header.jsp" />
<jsp:include page="../include/lefter.jsp" />
  <body>
  <div class="admin">
    <!-- <h1><font color="red">门店信息</font></h1> -->
    
    <blockquote class="border-main">
	  <strong>送货信息生成</strong>
		  <!-- <p></p> -->
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
		    	<th>门店编号</th>
	    		<th>男/女鞋</th>
	    		<th>鞋款式</th>
	    		<th>数量</th>
	    		<th>受理时间</th>
	    		<th>司机名称</th>
	    		<th>车牌号</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.songbhlist" id="us">
	    		<tr>
	    			<td>
	    				<s:property value="#us.mdbh"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.xb"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.xks"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.num"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.times"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.sjmc"/>
	    			</td>
	    			<td>
	    				<s:property value="#us.clpz"/>
	    			</td>
	    		</tr>
	    	</s:iterator>
		   </table>
		   
		   <div class="panel-foot text-center">
        <ul class="pagination pagination-group">
            <li><s:a href="lookLsbhb.action?page=1">首页</s:a></li>&nbsp;&nbsp;
            <li><s:a href="lookLsbhb.action?page=%{#request.page-1}">上一页</s:a></li>&nbsp;&nbsp;
            <li><s:a href="lookLsbhb.action?page=%{#request.page+1}" >下一页</s:a></li>&nbsp;&nbsp;
            <li><s:a href="lookLsbhb.action?page=%{#request.totalPage}">尾页</s:a></li>
        </ul>
    </div>
		</div>
	    </div>
        
    </blockquote>
  </body>
</html>
