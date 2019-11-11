	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>新河音乐网</title>

<style type="text/css">  a {
  display: block;
  color: #333;
  text-decoration: none;
}  
a:hover {
  color: #31c27c;
}</style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
			<ul class="header-subNav">
				<li><a href="#newSong" class="subNav-cur">新歌首发</a></li>
				<li><a href="#recommend">精彩推荐</a></li>
				<li><a href="#rank">排行榜</a></li>
				<li><a href="#">分类歌单</a></li>
			</ul>

	<!-- 新歌首发 -->
	<div class="main" id="newSong">
		<div class="main-inner">
			<div class="main-title">
				<h2 class="title">
					<i></i>
				</h2>
				<span class="line line-left"></span> <span class="line line-right"></span>
			</div>
			<a href="#" class="readAll"><i class="icon-sprite"></i></a>
			<div class="main-slider tab-cont">
				<ul class="slider-wrapper">
					<c:forEach items="${newMusicList}" var="newMList"
						varStatus="status" begin="0" end="11">
						<li><a onclick="oneToRadio(${ newMList.musicId})" class="img"> 
						<c:set var="newMusicListurl" value="${pageContext.request.contextPath }/images/music/${ newMList.musicPe} - ${ newMList.musicName}.jpg"></c:set>
						<img
								src="${newMusicListurl}"
								alt="#"> <span class="mask"></span> <i class="icon-play"></i>
						</a>
							<div class="info">
								<div class="title">
									<a>${ newMList.musicName}</a> <i class="icon-sprite"></i>
								</div>
								<a href="#" class="author">${ newMList.musicPe}</a>
							</div></li>
					</c:forEach>

				</ul>
				<div class="slider-btns">
					<span class="cur"><i></i></span> <span><i></i></span> <span><i></i></span>
				</div>
			</div>
		</div>
		<div class="main-operate">
			<a href="javascript:;" class="slider-prev"><i class="icon-sprite"></i></a>
			<a href="javascript:;" class="slider-next"><i class="icon-sprite"></i></a>
		</div>
	</div>

	<!-- 精彩推荐 -->
	<div class="main" id="recommend">
		<div class="main-inner">
			<div class="main-title">
				<h2 class="title">
					<i></i>
				</h2>
				<span class="line line-left"></span> <span class="line line-right"></span>
			</div>
			<div class="carousel">
				<div class="carousel-slider">
					<a href="#" class="item item-pic1"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img1.jpg"
						alt="#"></a> <a href="#" class="item item-pic2"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img2.jpg"
						alt="#"></a> <a href="#" class="item item-pic3"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img3.jpg"
						alt="#"></a> <a href="#" class="item item-pic4"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img4.jpg"
						alt="#"></a> <a href="#" class="item item-pic5"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img5.jpg"
						alt="#"></a> <a href="#" class="item item-pic6"><img
						src="${pageContext.request.contextPath }/images/cont/carousel_img6.jpg"
						alt="#"></a>
				</div>
			</div>
		</div>
		<div class="main-operate">
			<a href="#" class="slider-prev"><i class="icon-sprite"></i></a> <a
				href="#" class="slider-next"><i class="icon-sprite"></i></a>
		</div>
	</div>

	<!-- 排行榜 -->
	<div class="main" id="rank">
		<div class="main-inner">
			<div class="main-title">
				<h2 class="title">
					<i></i>
				</h2>
				<span class="line line-left"></span> <span class="line line-right"></span>
			</div>
			<a href="#" class="readAll">全部<i class="icon-sprite"></i></a>
			<ul class="rank-list">
				<li class="rank-list__item rank-list__1"><span class="rank-bg"></span>
					<span class="mask"></span> <i class="icon-play"></i>
					<div class="title">
						<i></i>
						<h3>流行指数</h3>
					</div> <i class="line"></i>
					<ul class="song-list">
						<c:forEach items="${ hotMusicList}" var="hotMList"
						varStatus="status" begin="0" end="3">
						<li class="song-list__item"><a href="#"><span>${ status.index + 1}</span> ${  hotMList.musicPe} </a> <span>${  hotMList.musicName}</span></li>
						</c:forEach>
					</ul></li>
				<li class="rank-list__item rank-list__2"><span class="rank-bg"></span>
					<span class="mask"></span> <i class="icon-play"></i>
					<div class="title">
						<i></i>
						<h3>亚洲歌曲</h3>
					</div> <i class="line"></i>
					<ul class="song-list">
						<c:forEach items="${ asiaMusicList}" var="asiaMList"
						varStatus="status" begin="0" end="3">
						<li class="song-list__item"><a href="#"><span>${ status.index + 1}</span>${  asiaMList.musicPe}</a> <span>${  asiaMList.musicName}</span></li>
						</c:forEach>
					</ul></li>
				<li class="rank-list__item rank-list__3"><span class="rank-bg"></span>
					<span class="mask"></span> <i class="icon-play"></i>
					<div class="title">
						<i></i>
						<h3>欧美歌曲</h3>
					</div> <i class="line"></i>
					<ul class="song-list">
					<c:forEach items="${ americaMusicList}" var="americaMList"
						varStatus="status" begin="0" end="3">
						<li class="song-list__item"><a href="#"><span>${ status.index + 1}</span>${  americaMList.musicPe}</a> <span>${  americaMList.musicName}</span></li>
						</c:forEach>
					</ul></li>
				<li class="rank-list__item rank-list__4"><span class="rank-bg"></span>
					<span class="mask"></span> <i class="icon-play"></i>
					<div class="title">
						<i></i>
						<h3>日韩歌曲</h3>
					</div> <i class="line"></i>
					<ul class="song-list">
					<c:forEach items="${ japanAndKoreaaMusicList}" var="japanAndKoreaaMList" varStatus="status" begin="0" end="3">	
						<li class="song-list__item"><a href="#"><span>${ status.index + 1}</span>${  japanAndKoreaaMList.musicPe}</a> <span>${  japanAndKoreaaMList.musicName}</span></li>
					</c:forEach>	
					</ul></li>
			</ul>
		</div>
	</div>

	<!-- footer -->
	<footer class="footer">
		<div class="footer-inner">
			<div class="footer-info">
				<div class="footer-info__download">
					<h3>下载gwjjj音乐客户端</h3>
					<ul class="list">
						<li><a href="#"> <i class="footer-icon icon-pc"></i> PC版
						</a></li>
						<li><a href="#"> <i class="footer-icon icon-mac"></i>
								Mac版
						</a></li>
						<li><a href="#"> <i class="footer-icon icon-android"></i>
								Android版
						</a></li>
						<li><a href="#"> <i class="footer-icon icon-iphone"></i>
								iPhone版
						</a></li>
					</ul>
				</div>
				<div class="footer-info__product">
					<h3>特色产品</h3>
					<ul class="list">
						<li class="hasPic"><a href="#"> <i
								class="footer-icon icon-kg"></i> 全民K歌
						</a></li>
						<li class="hasPic"><a href="#"> <i
								class="footer-icon icon-ss"></i> 全民K歌
						</a></li>
						<li class="hasPic"><a href="#"> <i
								class="footer-icon icon-qp"></i> 全民K歌
						</a></li>
						<li><a href="#">gwjjj音乐原创音乐平台</a></li>
						<li><a href="#">上传视频</a></li>
						<li><a href="#">上传视频</a></li>
						<li><a href="#">上传视频</a></li>
					</ul>
				</div>
				<div class="footer-info__link">
					<h3>特色产品</h3>
					<ul class="list">
						<li><a href="#">CJ E&M</a></li>
						<li><a href="#">我们视频</a></li>
						<li><a href="#">手机KK空间</a></li>
						<li><a href="#">CJ E&M</a></li>
						<li><a href="#">我们视频</a></li>
						<li><a href="#">手机KK空间</a></li>
						<li><a href="#">CJ E&M</a></li>
						<li><a href="#">我们视频</a></li>
						<li><a href="#">手机KK空间</a></li>
						<li><a href="#">CJ E&M</a></li>
						<li><a href="#">我们视频</a></li>
						<li><a href="#">手机KK空间</a></li>
					</ul>
				</div>
			</div>
			<div class="footer-copyright">
				<p>
					<a href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a
						href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a
						href="#">关于我们</a><span>|</span><a href="#">关于我们</a><span>|</span><a
						href="#">关于我们</a><span>|</span><a href="#">关于我们</a>
				</p>
				<p>Copyright © 1998 - 2017 kk. All Rights Reserved.</p>
				<p>我们公司 版权所有 我们网络文化经营许可证</p>
			</div>
		</div>
	</footer>


	<!-- 分享到 -->
	<ul class="slider-share">
		<li><a href="#"> <i class="icon-sprite icon-add"></i> 添加到 <i
				class="icon-sprite icon-arrow"></i>
		</a></li>
		<li><a href="#"> <i class="icon-sprite icon-share"></i> 分享 <i
				class="icon-sprite icon-arrow"></i>
		</a></li>
		<li><a href="#"> <i class="icon-sprite icon-download"></i> 下载
		</a></li>
	</ul>

	<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath }/js/script.js"></script>
    <script type="text/javascript">
  
    function oneToRadio(musicId) {
        location.href = '${pageContext.request.contextPath }/radio/oneToRadio?musicId='
            + musicId;
    }
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
</body>
</html>
