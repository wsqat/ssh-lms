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
			"name" : "总店管理",
			"submenu" : [ {
				"name" : "查看总店信息",
				"url" : ""
			}, {
				"name" : "更新总店信息",
				"url" : ""
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
			"name" : "仓库信息管理",
			"submenu" : [ {
				"name" : "查看商品库存",
				"url" : ""
			}, {
				"name" : "更新商品库存",
				"url" : ""
			} ]
		}, {
			"name" : "送货管理",
			"submenu" : [ {
				"name" : "生成送货表",
				"url" : "../uploadSonghb.action"
			}, {
				"name" : "浏览历史送货表",
				"url" : ""
			} ]
		}, {
			"name" : "门店信息管理",
			"submenu" : [ {
				"name" : "查看各门店商品库存",
				"url" : ""
			}]
		}, {
			"name" : "司机信息管理",
			"submenu" : [ {
				"name" : "查看司机信息",
				"url" : "../lookSJ.action"
			},{
				"name" : "添加司机信息",
				"url" : "../addSJ.action"
			}, {
				"name" : "更新司机信息",
				"url" : "../updatePSJxx.action"
			} ]
		},{
			"name" : "车辆信息管理",
			"submenu" : [ {
				"name" : "查看车辆信息",
				"url" : "../lookSJ.action"
			}, {
				"name" : "更新车辆信息",
				"url" : ""
			} ]
		}, {
			"name" : "个人信息管理",
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