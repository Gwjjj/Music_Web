<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册界面</title>
<link rel="stylesheet" href="css/reset.css" />
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/font-awesome.min.css" />
<jsp:include page="/common.jsp"></jsp:include>
</head>
<body>
	<div class="wrap login_wrap">
		<div class="content">

			<div class="logo"></div>

			<div class="login_box">

				<div class="login_form">
					<div class="login_title">注册</div>
					<form action="#" method="post">

						<div class="form_text_ipt">
							<input id="userPhoneOrId" name="userPhoneOrId" type="text"
								placeholder="手机号/邮箱">
						</div>
						<div class="ececk_warning">
							<span>手机号/邮箱不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input id="password" name=" password" type="password"
								placeholder="密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>
						<div class="form_text_ipt">
							<input id="repassword" name="repassword" type="password"
								placeholder="重复密码">
						</div>
						<div class="ececk_warning">
							<span>密码不能为空</span>
						</div>
						<!-- <div class="form_text_ipt">
							<input id="code" name="code" type="text" placeholder="验证码">
						</div>
						-- <div class="ececk_warning">
							<span>验证码不能为空</span>
						</div>  -->

						<div class="form_btn">
							<button type="button" onclick="register()">注册</button>
						</div>
						<div class="form_reg_btn">
							<span>已有帐号？</span><a href="login.jsp">马上登录</a>
						</div>
					</form>
					<div class="other_login">
						<div class="left other_left">
							<span>其它登录方式</span>
						</div>
						<div class="right other_right">
							<a href="#"><i class="fa fa-qq fa-2x"></i></a> <a href="#"><i
								class="fa fa-weixin fa-2x"></i></a> <a href="#"><i
								class="fa fa-weibo fa-2x"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	<div style="text-align: center;"></div>
</body>
<script type="text/javascript">
	function register() {
		var userPhoneOrId = $("#userPhoneOrId").val();
		var password = $("#password").val();
		var repassword = $("#repassword").val();
		if ("" == userPhoneOrId || undefined == userPhoneOrId) {
			alert("手机或邮箱不能为空");
			return;
		}

		if ("" == password || undefined == password) {
			alert("密码不能为空");
			return;
		}
		if ("" == repassword || undefined == repassword) {
			alert("重复密码不能为空");
			return;
		}

		if (password != repassword) {
			alert("两次密码输入不一致");
			return;
		}
		if ("" == password || password.length < 6) {
			alert("密码长度必须至少六位!");
			return;
		}
		var reg = new RegExp(/^(?![^a-zA-Z]+$)(?!\D+$)/);
		if (!reg.test(password)) {
			alert("密码至少包含一个数字和一个字母!");
			return;
		}
		var data = {};
		data.idOrMail = userPhoneOrId;
		data.password = password;
		$
				.ajax({
					type : 'post',
					url : '${pageContext.request.contextPath }/login/register',
					//contentType:"application/json;charset=utf-8",
					data : data,
					//JSON.stringify(data),
					cache : false,
					sync : true,
					success : function(result) {
						alert(result);
						console.log(result)
						if (result.status == 1) {
							location.href = '${pageContext.request.contextPath }/login.jsp';
						} else {
							alert("已有帐号")
						}
					},
					error : function() {
						alert("请求失败!");
					}
				});
	}
</script>

</html>
