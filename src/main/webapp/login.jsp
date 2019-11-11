<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh">
<head>
<jsp:include page="/common.jsp"></jsp:include>
<title>欢迎访问新河音乐网</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
	<div class="htmleaf-container">
		<div class="wrapper">
			<div class="container">
				<h1>Welcome gwjjjMusic</h1>
				<form method="post" id="formlogin" class="form"
					action="login/loginToHome">
					<!-- action="login/loginToHome" -->
					<input type="text" name="userIdOrMail" id="userIdOrMail"
						placeholder="请输入手机号或邮箱"> <input type="password"
						name="password" id="password" placeholder="请输入密码">
					<button type="button" id="login-button" onclick="mylogin()">登录</button>
					<div class="form_reg_btn">
						<span>还没有帐号？</span><a href="register.jsp">马上注册</a>
					</div>
				</form>
			</div>

			<ul class="bg-bubbles">
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
				<li></li>
			</ul>
		</div>
	</div>

	<script type="text/javascript">
		function mylogin() {

			var userIdOrMail = $("#userIdOrMail").val();
			var password = $("#password").val();
			if ("" == userIdOrMail || undefined == userIdOrMail) {
				alert("登录名不能为空");
				return;
			}
			if ("" == password || undefined == password) {
				alert("密码不能为空");
				return;
			}
			var data = {};
			data.idOrMail = userIdOrMail;
			data.password = password;
			$.ajax({
				type : 'post',
				url : 'login/loginCheck',
				data : data,
				cache : false,
				sync : true,
				success : function(result) {
					alert(result);
					console.log(result)
					if (result.status == 200) {
						if (result.data == "1") {
							$("#formlogin").submit();
						} else if (result.data == "0") {
							alert("用户名或者密码不正确");
							return;
						}

					}
				},
				error : function() {
					alert("请求失败!");
				}
			});
		}
	</script>

</body>
</html>