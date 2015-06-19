<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查看司机信息</title>
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
    <button class="button button-big bg-main dialogs" data-toggle="click" data-target="#mydialog" data-mask="1" data-width="50%">弹出对话框</button>

<div id="mydialog">
  <div class="dialog">
    <div class="dialog-head">
      <span class="close rotate-hover"></span>
      <strong>对话框标题</strong>
    </div>
    <div class="dialog-body">
      对话框内容
    </div>
    <div class="dialog-foot">
      <button class="button dialog-close">取消</button>
      <button class="button bg-green">确认</button>
    </div>
  </div>
</div>
    <blockquote class="border-main">
	  <strong>司机信息查看</strong>
		  <!-- <p></p> -->
		
	    <div class="table-responsive">
		<table class="table">
		    <tr>
	    		<th>司机名称</th>
	    		<th>联系电话</th>
	    		<th>是否空闲</th>
	    		<th>操作一</th>
	    		<th>操作二</th>
	    	</tr>
	    	
	    	<s:iterator value="#request.sjxxlist" id="us">
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
                    	<s:a href="updateSJxx.action?sjxx.bh=%{#us.bh}"><button class="button button-blue">更新</button></s:a>         
                	</td> 
	    			<td>  
                    	<s:a href="deleteSJxx.action?sjxx.bh=%{#us.bh}" onclick="return del()"><button class="button button-red">删除</button></s:a>  
                	</td> 
	    		</tr>
	    	</s:iterator>
		   </table>
		</div>
	    </div>
        
    </blockquote>
    
    
  </body>
</html>
