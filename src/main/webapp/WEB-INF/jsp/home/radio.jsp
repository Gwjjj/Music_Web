<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport"
	content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>在线听歌</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/tplayer.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/Plugins/FontAwesome4.1/css/font-awesome.min.css" />
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath }/js/tPlayer.js"></script>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
	<div id="t_wrapper">
		<div id="t_cover">
			<img src="${pageContext.request.contextPath }/images/logo.png">
		</div>
		<div id="t_top">
			<div id="t_title_info">
				<span class="artist"></span> <span class="title"></span>
			</div>
		</div>
		<div id="t_middle">
			<div id="play"></div>
			<div id="pause" class="hidden"></div>
			<div
				class="ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all"
				id="t_progress">
				<div id="trackInfo">
					<div id="error"></div>
					<div id="current">0:00</div>
					<div id="duration">0:00</div>
				</div>
				<div style="width: 0%;"
					class="ui-slider-range ui-widget-header ui-corner-all ui-slider-range-min"></div>
				<span style="left: 0%;"
					class="ui-slider-handle ui-state-default ui-corner-all"
					tabindex="0"></span>
			</div>
			<span id="prev"></span> <span id="next"></span>
		</div>
		<div id="t_bottom">
			<div id="range">
				<div id="val"></div>
				<div id="vol"></div>
				<div id="rangeVal"></div>
			</div>
			<div id="t_pls_show" class="noselectpls"></div>
		</div>
	</div>
	<div id="playlist">
		<ul>
			<c:forEach items="${ musicDatailsList}" var="musicDatails"
				varStatus="status">
				<li
					t_cover="${pageContext.request.contextPath }/images/music/${ musicDatails.musicPe} - ${ musicDatails.musicName}.jpg"
					t_artist="${ musicDatails.musicPe}"
					t_name="${musicDatails.musicName }"><a href="#">${ musicDatails.musicPe}
						- ${ musicDatails.musicName}</a>
						 <audio preload="none">
						<source
							src="${pageContext.request.contextPath }/Media/${ musicDatails.musicPe} - ${ musicDatails.musicName}.mp3"
							type="audio/mp3">
						<!--   <source src="${pageContext.request.contextPath }/Media/Transformers2.htm" type="audio/ogg; codecs=vorbis"> -->
					</audio>

					</li>
			</c:forEach>
		</ul>
	</div>
	<div
		style="text-align: center; margin: 50px 0; font: normal 14px/24px 'MicroSoft YaHei';">
	</div>
</body>
</html>