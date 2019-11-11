<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>我的歌单</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/playlist.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/animate.min.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.min.js"></script>
<script src="${pageContext.request.contextPath }/js/jPages.js"></script>
<script>
	$(function() {
		$("div.holder").jPages({
			containerID : "itemContainer",
			previous : "←上一页",
			next : "下一页→",
			perPage : 3
		});
	});
</script>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include> 
	<div id="container" class="clearfix">
		<!--! end of #sidebar -->
		<div id="content" class="defaults">
			<!-- navigation holder -->
			<!-- item container -->
			<ul id="itemContainer">
				<c:forEach items="${ playlistDetailsList}" var="playlistDetails"
					varStatus="status">
					<li><div class="box">
							<a 
								href="${pageContext.request.contextPath }/radio/playlistToRadio?playlistId=${ playlistDetails.playlistId}"><img
								src="${pageContext.request.contextPath }/images/playlist/${ playlistDetails.playlistImg}.jpg"></a>
							${playlistDetails.playlistName }
						</div></li>
				</c:forEach>
			</ul>
			<!-- navigation holder -->
			<div class="holder"></div>
		</div>
		<!--! end of #content -->
	</div>
</body>
</html>
