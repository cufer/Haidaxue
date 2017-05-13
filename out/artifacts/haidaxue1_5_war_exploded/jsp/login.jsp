<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<div data-role="page" data-theme="a" data-title="ihaidaxue"
		id="login">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
		</div>
		<!--header结束 -->
		<div class="ui-content">
		<div class="forLogin">
			<form action="/login" method="post">
				<ul data-role="listview" data-inset="true">
					<li data-role="fieldcontain"><label for="name"><span
							style="color: #05ba92; font-family: 微软雅黑;">电话号码</span></label> <input
						name="telephoneNumber" id = "telephoneNumber" value="" /></li>
					<li data-role="fieldcontain"><label for="name"><span
							style="color: #05ba92; font-family: 微软雅黑;">密码</span></label> <input
						type="password" name="password" id = "password" value=""></li>
					<li><div><a href="/jsp/register.jsp">还没注册？？</a></li>
					<li data-role="fieldcontain">
						<fieldset class="ui-grid-a">
							<div class="ui-block-a">
								<button type="reset">
								取消</button>
							</div>
							<div class="ui-block-b">
								<input type="submit" value="登录" class="login" style="cursor: pointer;" />
							</div>
						</fieldset>
					</li>
				</ul>
			</form>
		</div>
		</div>
		<!--content结束 -->
	</div>
	<!--loginpage结束 -->
</body>
</html>