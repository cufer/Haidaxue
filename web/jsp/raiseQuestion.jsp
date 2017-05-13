<%@ page import="Entity.HUsersEntity" %>
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
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js">
</script>
</head>
<body>
<% 			HUsersEntity u = (HUsersEntity) session.getAttribute("loginUser");
	//String haidaxueSn = u.getHaidaxueSn();
	if(u==null){response.sendRedirect("/jsp/login.jsp");}
%>
<div data-role="page" data-theme="a" data-title="raiseQuestion" id="raiseQuestion">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
 		</div>
		<!--header结束 -->
 		<div data-role="ui-content" style="font-family: Microsoft YaHei;color:#05ba92;font-weight:bolder;align:center;">
 		<form method = "post" action = "/raisequestion" data-ajax="false">
					<label for = "textarea-1">我的问题</label>
					<textarea name  ="questionContent" id = "questionContent" placeholder="I want to know~~~" style="font-family: 'Comic Sans MS', cursive"></textarea>
					<fieldset data-role="controlgroup">
						 <legend>问题类型</legend> 
		 				<select name="questionLabel" id="questionLabel">
							<option value="状元">状元</option>
							<option value="志愿">志愿</option>
							<option value="备考">备考</option>
							<option value="自招">自招</option>
							<option value="专业">专业</option>
							<option value="素材">素材</option>
						</select>
					</fieldset>
					<div style = "float:left;margin:5%;">
					<fieldset data-role="controlgroup" data-type = "horizontal">
						<legend>是否打赏</legend>
						<input type="radio" name="questionBonus" id="radio-choice-v-2a" value="true" checked="checked">
						<label for="radio-choice-v-2a">是</label>
						<input type="radio" name="questionBonus" id="radio-choice-v-2b" value="false">
						<label for="radio-choice-v-2b">否</label>
					</fieldset>
					</div>
					 
					<div style = "float:right;margin:5%">
					<fieldset data-role="controlgroup" data-type = "horizontal" >
						<legend>是否匿名</legend>
						<input type="radio" name="questionAnonymity" id="radio-choice-v-1a" value="true" checked="checked">
						<label for="radio-choice-v-1a">是</label>
						<input type="radio" name="questionAnonymity" id="radio-choice-v-1b" value="false">
						<label for="radio-choice-v-1b">否</label>
					</fieldset>
					</div>
					<button type="submit" >提交</button>
				</form>  
		</div>
		<!-- ui-content 结束 -->

		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="/jsp/index.jsp" data-icon="home" data-ajax="false">
					<img id="myFont" >首页</a></li>
					<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false">
						<img id="myFont">大神档案</a></li>
					<li><a href="#" data-icon="edit" class = "ui-btn-active" data-ajax="false">
					<img id="myFont" >提问</a></li>
					<li><a href="/jsp/showCollections.jsp" data-icon="shop" data-ajax="false">
					<img id="myFont">收藏</a></li>
					<li><a href="/jsp/ihaidaxue.jsp" data-icon="user" data-ajax="false"><img id="myFont">我的</a></li>
				</ul>
			</div>
			<!--navbar结束 -->
		</div>
		<!--footer结束 -->
</div> 
</body>
</html>