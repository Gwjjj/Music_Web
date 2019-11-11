
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/index2.css">
<link rel="icon"
	href="${pageContext.request.contextPath }/favicons/1.png">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/reset2.css">
<title>Insert title here</title>
<style type="text/css">
.header {
	
}


.header-top {
	height: 90px;
	border-bottom: 1px solid #f2f2f2;
	background-color: white;
}

.header-top .logo {
	float: left;
	width: 190px;
	height: 52px;
	margin-top: 18px;
	background: url(./images/logo.png) no-repeat;
}

.header-nav {
	float: left;
	margin: 0 29px 0 35px;
}

.header-nav ul {
	
}

.header-nav li {
	float: left;
}

.header-nav li a {
	height: 90px;
	line-height: 90px;
	padding: 0 20px;
	font-size: 18px;
}

.header-nav li a.header-nav__cur {
	color: #fff;
	background-color: #31c27c;
}
.header-nav li a.header-nav__cur2 {
	color: #fff;
	background-color: #9AC0CD;
}
.header-search {
	position: relative;
	float: left;
	width: 248px;
	height: 36px;
	margin-top: 26px;
	border: 1px solid #c9c9c9;
	border-radius: 3px;
	font-size: 0;
}

.header-search .text {
	display: inline-block;
	width: 212px;
	height: 36px;
	padding-left: 14px;
	box-sizing: border-box;
	font-family: "Microsoft Yahei";
	font-size: 14px;
	vertical-align: top;
}

.header-search .btn {
	display: inline-block;
	width: 36px;
	height: 36px;
	line-height: 52px;
	text-align: center;
	cursor: pointer;
}

.header-search .btn i {
	display: inline-block;
	width: 16px;
	height: 16px;
	background-position: 0 -40px;
}

.header-search .btn:hover i {
	background-position: 0 -60px;
}

.header-search .result {
	display: none;
	position: absolute;
	z-index: 999;
	top: 36px;
	left: -1px;
	width: 248px;
	padding: 6px 0 14px;
	border: 1px solid #c9c9c9;
	font-size: 14px;
	background-color: #fff;
}

.header-search .result-item {
	position: relative;
	padding: 0 15px;
	height: 36px;
	line-height: 36px;
	font-size: 12px;
}

.header-search .result-item:hover {
	background-color: #31c27c;
}

.header-search .result-item .rank {
	margin-right: 12px;
	color: #ff594b;
}

.header-search .result-item .title {
	font-size: 14px;
}

.header-search .result-item .num {
	position: absolute;
	right: 15px;
	color: #999;
}

.header-search .result-item:hover .rank, .header-search .result-item:hover .title,
	.header-search .result-item:hover .num {
	color: #fff;
}

.header-search .history {
	position: relative;
	padding: 0 15px;
	margin-top: 15px;
	height: 24px;
	line-height: 24px;
}

.header-search .history span {
	color: #999;
}

.header-search .history i {
	position: absolute;
	top: 5px;
	right: 15px;
	width: 16px;
	height: 16px;
	background-position: -100px 0;
	cursor: pointer;
}

.header-search .history i:hover {
	background-position: -20px -60px;
}

.header-login {
	float: right;
	margin-top: 24px;
	font-size: 0;
}

.header-login a {
	display: inline-block;
}

.header-login a.login, .header-login a.open-green, .header-login a.open-vip
	{
	height: 40px;
	line-height: 40px;
	text-align: center;
	font-size: 14px;
	border-radius: 3px;
}

.header-login a.login {
	width: 60px;
}

.header-login a.open-green {
	width: 115px;
	margin: 0 10px;
	color: #fff;
	background-color: #31c27c;
}

.header-login a.open-vip {
	width: 86px;
	height: 38px;
	border: 1px solid #c9c9c9;
	background-color: #fff;
	color: #333;
}

.header-login a.open-green:hover {
	background-color: #2caf6f;
}

.header-login a.open-vip:hover {
	background-color: #ededed;
}
.icon-sprite {
  background: url(../images/icon_sprite.png) ;
}

</style>
 <script type="text/javascript">
    function search(searchText) {
    	var searchText = $("#searchText").val();
    	if ("" == searchText || undefined == searchText) {
			alert("搜索内容不能为空");
			return;
		}
        location.href = '${pageContext.request.contextPath }/search/music?searchText='
            + searchText;
    }
    </script>
</head>
<body>
	<header class="header">

		<div class="header-top">
			<a href="#" class="logo"></a>
			<nav class="header-nav">
			<ul >
				<li><a href="#" class="header-nav__cur" >音乐馆</a></li>
				<li><a class="header-nav__cur2"
					href="${pageContext.request.contextPath }/playlist/myplaylist">我的音乐</a></li>
			</ul>
			</nav>
			<div class="header-search">
				<input id="searchText" type="text" class="text"
					placeholder="here...">
				<div class="btn" onclick="search()">
					<i class="icon-sprite"></i>
				</div>
				<div class="result"></div>
			</div>
		</div>
	</header>
</body>
</html>