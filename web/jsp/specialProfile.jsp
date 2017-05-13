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
	<div data-role="page" data-theme="a" data-title="specialProfile">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
			<div class="mySearch">
				<form method="post" action="list.jsp">
					<input type="search" name="search" id="search" value=""
						placeholder="i want---"
						style="font-family: 'Comic Sans MS', cursive">
				</form>
			</div>
		</div>
		<!--header结束 -->



		<div data-role="ui-content">
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t6.jpg" />
				<p>潘聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t7.jpg" />
				<p>潘聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t8.jpg" />
				<p>张聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t4.jpg" />
				<p>张聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t9.jpg" />
				<p>梁聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t3.jpg" />
				<p>张聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t5.jpg" />
				<p>张聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>
			<div
				style="border-left: 1px solid #c0c0c0; border-bottom: 1px solid #c0c0c0; float: left; text-align: center; width: 49.5%; background: white; font-size: 5px;"
				class="specialPro">
				<img src="../images/t3.jpg" />
				<p>张聪明·中央财经大学·电子商务</p>
				<p>理科·天上·英山一中</p>
			</div>

		</div>
		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="/jsp/index.jsp" data-icon="home" data-ajax="false"><img
							id="myFont" >首页</a></li>
					<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false" class="ui-btn-active"><img id="myFont">大神档案</a></li>
					<li><a href="/jsp/raiseQuestion.jsp" data-icon="edit" data-ajax="false"><img
							id="myFont">提问</a></li>
					<li><a href="/jsp/showCollections.jsp" data-icon="shop" data-ajax="false"><img
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