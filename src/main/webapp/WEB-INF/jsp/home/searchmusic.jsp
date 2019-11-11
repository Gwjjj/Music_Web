<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>搜索结果</title>
<link href="${pageContext.request.contextPath }/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/search.css" />

<link href="${pageContext.request.contextPath }/css/jpage.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jpage.min.js"></script>
<script type="text/javascript">
	$('document').ready(function() {
		$('#jpage').jpage({
			effect : 'crossfade' //'slideLeft', 'slideRight'

		});
	})
	function pageScroll() { //点击完回到网页顶端
		window.scrollBy(0, -10);
		scrolldelay = setTimeout('pageScroll()', 10);
		if (document.documentElement.scrollTop == 0)
			clearTimeout(scrolldelay);
	}
	function oneToRadio(musicId) {
		location.href = '${pageContext.request.contextPath }/radio/oneToRadio?musicId='
				+ musicId;
	}
	function searchPlaylist() {
		var url = location.search; //获取url中"?"符后的字串

		if (url.indexOf("?") != -1) {
			var str = url.substr(1);
			strs = str.split("&");
			searchText = decodeURIComponent(strs[0].replace("searchText=",""));
			location.href = '${pageContext.request.contextPath }/search/playlist?searchText='
				+ searchText;
		}
	}
	function searchPlayer() {
		var url = location.search; //获取url中"?"符后的字串

		if (url.indexOf("?") != -1) {
			var str = url.substr(1);
			strs = str.split("&");
			searchText = decodeURIComponent(strs[0].replace("searchText=",""));
			location.href = '${pageContext.request.contextPath }/search/player?searchText='
				+ searchText;
		}
	}
</script>
<style type="text/css">
.nav-pills>li {
	float: left;
	margin-bottom: -1px;
	width: 33%;
	height: 100%;
}
</style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
	<ul class="nav nav-pills">
		<li role="presentation" class="active"><a href="#">单曲</a></li>
		<li role="presentation"><a onclick="searchPlayer()">歌手</a></li>
		<li role="presentation"><a onclick="searchPlaylist()">歌单</a></li>
	</ul>
		<div class="tab-pane fade in active" id="music">
			<div id="main-content" class="box">
				<div class="center">
					<div id="page-content" class="box">
						<!-- jPage DEMO -->
						<div id="jpage" class="jpage box">
							<!-- pagination panel -->
							<div class="list box text-shadow" data-type="content">
								<c:forEach items="${musicDatailsList}" var="musicDatail"
									varStatus="status">
									<div class="list-item box">
										<!-- img -->
										<div class="img left">
											<img
												src="${pageContext.request.contextPath }/images/music/${ musicDatail.musicPe} - ${ musicDatail.musicName}.jpg"
												style="cursor: pointer;"
												onclick="oneToRadio(${ musicDatail.musicId})" alt=""
												title="" />
										</div>
										<!-- data -->
										<div class="block right">
											<p class="date">
												<fmt:formatDate value="${musicDatail.musicCreate}"
													pattern="yyyy-MM-dd HH:mm:ss" />
											</p>
											<p class="title">${musicDatail.musicName}</p>
											<p class="desc">${musicDatail.musicInf}</p>
											<p class="like">${musicDatail.musicHot}Likes</p>
										</div>
									</div>
								</c:forEach>
							</div>
							<div class="box jpage-panel" data-type="panel"
								onclick="pageScroll()"></div>
							<!-- end of jPage DEMO -->
						</div>
					</div>
				</div>
			</div>
		</div>



</body>
</html>