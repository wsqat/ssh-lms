<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- <link rel="stylesheet" type="text/css" href="http://www.16css.com/skin/mb001/images/demo.css"/> -->
<style type="text/css">
.wrap-menu {
	width: 180px;
	margin: 0 auto;
	overflow: auto;
	background: #F6F6F6;
	float: left;
	font: 12px/1.5 Tahoma, Arial, sans-serif
}

.wrap-menu ul {
	list-style: none;
	margin: 0;
	padding: 0;
	font-weight: bold
}

.wrap-menu ul li {
	text-indent: 3em;
	white-space: nowrap;
}

.wrap-menu ul li h2 {
	cursor: pointer;
	height: 100%;
	width: 100%;
	margin: 0 0 1px 0;
	font: 12px/31px '宋体';
	color: #fff;
	background: #09c;
}

.wrap-menu ul li a {
	display: block;
	outline: none;
	height: 25px;
	line-height: 25px;
	margin: 1px 0;
	color: #1A385C;
	text-decoration: none;
}

.wrap-menu ul li img {
	vertical-align: top;
	margin-right: 10px;
	margin-left: -17px;
	margin-top: 9px;
	width: 7px;
	height: 7px;
	background: url(../assets/images/arrow.gif) no-repeat;
	border: none;
}

.wrap-menu ul li img.unfold {
	background-position: 0 -9px;
}

.wrap-menu ul li a:hover {
	background-color: #ccc;
	background-image: none;
}
</style>
<script src="../assets/js/jquery.min.js"></script>
<script src="../assets/js/16css.js"></script>
</head>

<body>

	<div class="wrap-menu"></div>
	<script>
		var testMenu = [

		{
			"name" : "报货管理",
			"submenu" : [ {
				"name" : "提交报货表",
				"url" : "../UploadBhb.action"
			}, {
				"name" : "浏览历史报货表",
				"url" : "../lookLsbhb.action"
			}
			/* {
			    "name": "二级菜单",
			    "submenu": [
			        {
			            "name": "三级菜单",
			            "submenu": [
			                {
			                    "name": "四级菜单",
			                    "url": ""
			                }
			            ]
			        },
			        {
			            "name": "三级菜单",
			            "url": ""
			        }
			    ]
			}, 
			{
			    "name": "二级菜单",
			    "url": ""
			},
			{
			    "name": "二级菜单",
			    "submenu": [
			        {
			            "name": "三级菜单",
			            "submenu": [
			                {
			                    "name": "四级菜单",
			                    "url": ""
			                },
			                {
			                    "name": "四级菜单",
			                    "submenu": [
			                        {
			                            "name": "五级菜单",
			                            "url": ""
			                        },
			                        {
			                            "name": "五级菜单",
			                            "url": ""
			                        }
			                    ]
			                }
			            ]
			        },
			        {
			            "name": "三级菜单",
			            "url": ""
			        }
			    ]
			},
			{
			    "name": "二级菜单",
			    "url": ""
			} */
			]
		},

		{
			"name" : "门店管理",
			"submenu" : [ {
				"name" : "查看门店信息",
				"url" : "../lookMdxx.action"
			}, {
				"name" : "更新门店信息",
				"url" : "../updatePMdxx.action"
			}, {
				"name" : "查看商品库存",
				"url" : "../lookKC.action"
			} ]
		}, {
			"name" : "收货管理",
			"submenu" : [ {
				"name" : "提交收货表",
				"url" : "../UploadShb.action"
			}, {
				"name" : "浏览历史收货表",
				"url" : "../lookLsshb.action"
			} ]
		}, {
			"name" : "个人管理",
			"submenu" : [ {
				"name" : "查看个人信息",
				"url" : "../lookUser.action"
			}, {
				"name" : "修改密码",
				"url" : "../updateUserPwd.action"
			} ]
		} ];
		$(function() {
			new AccordionMenu({
				menuArrs : testMenu
			});
		});
	</script>

</body>
</html>