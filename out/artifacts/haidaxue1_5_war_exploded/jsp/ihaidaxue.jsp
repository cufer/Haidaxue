<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ page import="Entity.HUsersEntity"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>ihaidaxue</title>
	<link rel="stylesheet" href="../css/haidaxue.min.css" />
	<link rel="stylesheet" href="../css/jquery.mobile.icons.min.css" />
	<link rel="stylesheet" href="../css/index.css" />
	<link rel="stylesheet"
		  href="http://code.jquery.com/mobile/1.4.5/jquery.mobile.structure-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
			src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>

</head>
<body>
<% 			HUsersEntity u = (HUsersEntity) session.getAttribute("loginUser");
	//String haidaxueSn = u.getHaidaxueSn();
	if(u==null){response.sendRedirect("/jsp/login.jsp");}
%>
<div data-role="page" data-theme="a" data-title="ihaidaxue"
	 id="ihaidaxue">
	<!--page开始 -->
	<div data-role="header" data-position="fixed">
		<!--header开始 -->
		<div class="myLogo">
			<img src="../images/logo.png">
		</div>
	</div>
	<!--header结束 -->
	<div data-role="ui-content">
		<div class="ihaidaxue">
			<a href="/jsp/updateProfile.jsp"><img src="../images/t5.jpg"></a>
			<p>欢迎来到嗨大学♪(^∇^*)</p>
		</div>
		<div class="ihaidaxue">
			<table>
				<tr>
					<td style="border-left: none;"><a href="/jsp/showTracks.jsp" data-ajax="false">
						<img src="../images/足迹.png" /></a></td>
					<td><a href="/questionByUser?aaa=1" data-ajax="false">
						<img src="../images/问过.png" /></a></td>
					<td><a href="/answerByUser?aaa=1" data-ajax="false">
						<img src="../images/答过.png" /></a></td>
				</tr>
				<tr>
					<td style="border-left: none;">足迹
						<p>&nbsp;</p>
					</td>
					<td>问过
						<p>&nbsp;</p>
					</td>
					<td>答过
						<p>&nbsp;</p>
					</td>
				</tr>
				<tr style="border-top: 1px solid #c0c0c0;">
					<td style="border-left: none; border-top: 1px solid #c0c0c0;"><a
							href="/jsp/showCollections.jsp?aaa=1" data-ajax="false"><img src="../images/赞过.png" /></a></td>
					<td style="border-top: 1px solid #c0c0c0;"><a
							href="/jsp/updateProfile.jsp" data-ajax="false"><img src="../images/学位.png" /></a></td>
					<td style="border-top: 1px solid #c0c0c0;"><a
							href="/jsp/contactUs.jsp" data-ajax="false"`><img src="../images/联系我们.png" /></a></td>
				</tr>
				<tr>
					<td style="border-left: none;">收藏
						<p>&nbsp;</p>
					</td>
					<td>更新
						<p>&nbsp;</p>
					</td>
					<td>联系
						<p>&nbsp;</p>
					</td>
				</tr>
			</table>
		</div>
		<span style = "font-family:微软雅黑;font-size:13px;font-weight: bolder;">推荐</span>

		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="/jsp/index.jsp" data-icon="home"  data-ajax="false"><img
							id="myFont" >首页</a></li>
					<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false"><img id="myFont">大神档案</a></li>
					<li><a href="/jsp/raiseQuestion.jsp" data-icon="edit" data-ajax="false"><img
							id="myFont">提问</a></li>
					<li><a href="/jsp/showCollections.jsp" data-icon="shop" data-ajax="false"><img
							id="myFont">收藏</a></li>
					<li><a href="#" data-icon="user" data-ajax="false" class="ui-btn-active"><img id="myFont">我的</a></li>
				</ul>
			</div>
			<!--navbar结束 -->
		</div>
		<!--footer结束 -->
	</div>
</body>
</html>