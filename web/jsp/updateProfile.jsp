<%@ page import="Entity.HUsersEntity" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>updateProfile</title>
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
	<div data-role="page" data-theme="a" data-title="update"
		id="register">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
		<div class="ui-content">
		<div id = "registername">
		<jsp:useBean id="loginUser" class="Entity.HUsersEntity" scope="session" />
			<form name="register" action="/update" method="post">
				<ul data-role="listview" data-inset="true">
					<li data-role="fieldcontain"><label for="name">用户名</label>
							<input type="text" name="userName" id="userName" value="" placeholder=<jsp:getProperty name="loginUser" property="userName" />/></li>
					<li data-role="fieldcontain"><label for="name">电话 </label>
							<input type="text" name="telephoneNumber" id="telephone_number" value="" placeholder=<jsp:getProperty name="loginUser" property="telephoneNumber"/> /></li>
					<li data-role="fieldcontain"><label for="name">邮箱 </label>
					        <input type="text" name="emailAddress" id="email_address" value="" placeholder=<jsp:getProperty name="loginUser" property="emailAddress"/> /></li>
					<li data-role="fieldcontain"><label for="name">密码</label>
					        <input type="password" name="password" id="password" value="" placeholder=<jsp:getProperty name="loginUser" property="password" />/></li>
					<li data-role="fieldcontain"><label for="name">目前所在地 </label>
					        <input type="text" name="currentLocation" id="currentLocation" value="" placeholder = <jsp:getProperty name="loginUser" property="currentLocation"/>/></li>
					<li data-role="fieldcontain"><label for="name">大学</label>
					        <input type="text" name="collegeName" id="collegeName" value="" placeholder = <jsp:getProperty name="loginUser" property="collegeName" /> /></li>
					<li data-role="fieldcontain"><label for="name">专业</label>
					        <input type="text" name="majorName" id="majorName" value="" placeholder = <jsp:getProperty name="loginUser" property="majorName" /> /></li>
					<li data-role="fieldcontain"><label for="name">高中 </label>
					        <input type="text" name="highschoolName" id="highschoolName" value="" placeholder =<jsp:getProperty name="loginUser" property="highschoolName"/> /></li>
					<li data-role="fieldcontain"><label for="name">文理</label>
					        <input type="text" name="departmentalName" id="departmentalName" value="" placeholder = <jsp:getProperty name="loginUser" property="departmentalName"/>/></li>
					<li data-role="fieldcontain"><label for="name">生源地</label> 
					        <input type="text" name="originSchool" id="originSchool" value="" placeholder = <jsp:getProperty name="loginUser" property="originSchool"/>/></li>
					<li data-role="fieldcontain">
						<button type="submit" >提交</button>
					</li>
				    </ul>
			 </form>  
		</div>
		</div>
		<!--content结束 -->
	</div> 
</body>
</html>