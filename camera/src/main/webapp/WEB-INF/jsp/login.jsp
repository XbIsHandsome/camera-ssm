<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>智慧课堂</title>
<link href="../static/css/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div class="login_box">
		<div class="login_l_img">
			<img src="../static/images/login-img.png" />
		</div>
		<div class="login">
			<div class="login_logo">
				<a href="#"><img src="../static/images/login_logo.png" /></a>
			</div>
			<div class="login_name">
				<p>智慧课堂行为监测系统</p>
			</div>
			<form method="post" action="/camera/user/login" id="commentForm">
				<input name="userName" type="text" value="用户名" required="true"
					onfocus="this.value=''"
					onblur="if(this.value==''){this.value='用户名'}" /> <span id="msgSpan" style="color: red">${msg }</span><span
					id="password_text"
					onclick="this.style.display='none';document.getElementById('user_pass').style.display='block';document.getElementById('user_pass').focus().select();">密码</span>
				<input name="userPass" type="password" id="user_pass"
					style="display: none;"
					onblur="if(this.value==''){document.getElementById('password_text').style.display='block';this.style.display='none'};" />
				<input value="登录" style="width: 100%;" type="submit" onclick="check();"/>
			</form>
		</div>
		<div class="copyright">CCSU大数据实验室 版权所有©2016-2018</div>
	</div>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js"></script>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
	<script
		src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
	<script type="text/javascript">
		function check(){
			$.validator.setDefaults({
				submitHandler : function() {
					$("#commentForm").submit();
					
				}
			});
			$().ready(function() {
				// 在键盘按下并释放及提交后验证提交表单
				$("#commentForm").validate({
					rules : {
						userName : "required",
						user_pass : "required",
					},
					messages : {
						userName : "请输入用户名",
						user_pass : "请输入密码",
					}
				});
			});
		}
	</script>
</body>
</html>
