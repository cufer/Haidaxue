<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1"> 
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
<div data-role="page" data-theme="a" data-title="个人信息" id="userinfo">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
			
		</div>
		<!--header结束 -->

		
		<div data-role="ui-content">
		 
		</div>
		<!-- ui-content 结束 -->

		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="index.jsp" data-icon="home" data-ajax="false"><img
							id="myFont" >首页</a></li>
					<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false"><img id="myFont">大神档案</a></li>
					<li><a href="showCollections.jsp" data-icon="shop" data-ajax="false"><img
							id="myFont">收藏</a></li>
					<li><a href="/jsp/ihaidaxue.jsp" data-icon="user" data-ajax="false"><img id="myFont">我的</a></li>
				</ul>
			</div>
			<!--navbar结束 -->
		</div>
		<!--footer结束 -->
</div>
</body>
</html>