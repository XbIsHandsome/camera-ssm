<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<title>智慧课堂行为监测系统</title>
<meta charset="utf-8" />
<link rel="stylesheet"
	href="../static/css/amazeui.min.css">
<link rel="stylesheet"
	href="../static/css/admin.css">
<link rel="stylesheet"
	href="../static/css/app.css">

<style>
.admin-main {
	padding-top: 0px;
}
</style>
</head>
<body>
<body>
	<header class="am-topbar am-topbar-inverse admin-header">
	<div class="am-topbar-brand">
		<strong>智慧课堂</strong> <small>行为管理系统系统</small>
		<span><small style="font-size:8px">上次登录：${loginUser.lastLogin }</small></span>
	</div>
	<button
		class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
		data-am-collapse="{target: '#topbar-collapse'}">
		<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
	</button>
	<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

		<ul
			class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
			<li class="am-dropdown" data-am-dropdown=""><a
				class="am-dropdown-toggle" data-am-dropdown-toggle=""
				href="javascript:;"> <span class="am-icon-users"></span>
				${loginUser.userName } <span
					class="am-icon-caret-down"></span>
			</a>
				<ul class="am-dropdown-content">
					<li ><a href="/camera/user/updatePwdPage"><span class="am-icon-sign-out"></span>
							修改密码</a></li>
					<li><a
						href="/camera/user/logout"><span
							class="am-icon-power-off"></span> 退出 </a></li>
				</ul></li>
			<li class="am-hide-sm-only"><a href="javascript:;"
				id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span
					class="admin-fullText">开启全屏</span> </a></li>
		</ul>
	</div>
	</header>

	<div class="am-cf admin-main">
		<!-- sidebar start -->
		<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
			<div class="am-offcanvas-bar admin-offcanvas-bar">
				<ul class="am-list admin-sidebar-list">
					<li><a href="admin-index.html"><span class="am-icon-home">
								首页</span></a>
					<li class="admin-parent"><a href="/camera/history/showall" class="am-cf" target="right"><span
							class="am-icon-file"></span> 历史课程<span
							class="am-icon-angle-right am-fr am-margin-right"></span> </a>
						</li>
					<li class="admin-parent"><a href="/camera/sycroh/showall" class="am-cf" target="right"><span
							class="am-icon-file"></span> 实时监控<span
							class="am-icon-angle-right am-fr am-margin-right"></span> </a>
						</li>
						<li class="admin-parent"><a href="/camera/course/courseManage" class="am-cf" target="right"><span
							class="am-icon-file"></span> 课程管理<span
							class="am-icon-angle-right am-fr am-margin-right"></span> </a>
						</li>
					<li class="admin-parent"><a href="/camera/Calendar/calendar" class="am-cf" target="right"><span
							class="am-icon-file"></span> 日程管理<span
							class="am-icon-angle-right am-fr am-margin-right"></span> </a>
						</li>
							
					<li><a href="/camera/user/updatePwdPage"><span class="am-icon-sign-out"></span>
							修改密码</a></li>
					<li><a href="/camera/user/logout"><span
							class="am-icon-sign-out"></span> 注销</a></li>
				</ul>

				<div class="am-panel am-panel-default admin-sidebar-panel">
					<div class="am-panel-bd">
						<p>
							<span class="am-icon-bookmark"></span> 公告
						</p>
						<p>时光静好，与君语；细水流年，与君同</p>
					</div>
				</div>


			</div>
		</div>
		<!-- sidebar end -->

		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				<iframe src="/camera/sycroh/showall" width="100%" height="1100" name="right"
					style="border: none;"></iframe>
			</div>
		</div>

		<footer class="admin-content-footer" >
		<hr>
		<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under
			MIT license.</p>
		</footer>

	</div>
	<!-- content end -->

	</div>

	<a href="#"
		class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

	<footer>
	<hr>
	<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under
		MIT license.</p>
	</footer>

	<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.3/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

	<!--[if (gte IE 9)|!(IE)]><!-->
	<script src="../static/js/jquery-1.11.3.min.js"></script>
	<!--<![endif]-->
	<script src="../static/js/amazeui.min.js"></script>
	<script src="../static/js/app.js"></script>
	<script type="text/javascript" src="../static/myplugs/js/plugs.js"></script>
	
</html>