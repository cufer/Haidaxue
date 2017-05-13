<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>index</title>
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
<div data-role="page" data-theme="a" data-title="嗨大学" id="index">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
			<div class="mySearch">
			    <form method = "post" action = "SearchServlet">
				<input type="search" name="questionLabel" id="questionLabel" value=""
					placeholder="i want---"
					style="font-family: 'Comic Sans MS', cursive">
				</form>
			</div>
		</div>
		<!--header结束 -->
		
	   <div data-role="ui-content">
	   <div data-demo-html="true">
       
			<div class="ui-body ui-body-a ui-corner-all" style="font-family:Microsoft YaHei">
			<p>你有什么想和我说的吗？分享你的故事,提出你的见解,甚至是发发牢骚,我知道你期待一个推心置腹的朋友,一场酣畅淋漓的倾诉,
			
			【嗨大学】，将成为你最暖心的朋友</p>
			
			<p>电子邮箱：haidaxue2015@163.com</p>
			<p>QQ号：3545083957</p>
			<p>微信公众号：cooollege</p>
			</div>
		</div>
	   
			
		<!-- ui-content 结束 -->

		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="index.jsp" data-icon="home" data-ajax="false"><img
							id="myFont" >首页</a></li>
					<li><a href="ShowProfileServlet" data-icon="bullets" data-ajax="false"><img id="myFont">大神档案</a></li>
					<li><a href="raiseQuestion.jsp" data-icon="edit" data-ajax="false"><img
							id="myFont">提问</a></li>
					<li><a href="showCollection" data-icon="shop" data-ajax="false"><img
							id="myFont">收藏</a></li>
					<li><a href="ihaidaxue.jsp" data-icon="user" data-ajax="false"><img id="myFont">我的</a></li>
				</ul>
			</div>
			<!--navbar结束 -->
		</div>
		<!--footer结束 -->
</div>
</body>
</html>