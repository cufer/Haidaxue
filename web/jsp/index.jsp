<%@ page import="Entity.HUsersEntity" %>
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
	<!--这里插入照片墙效果的JS文件 -->
	<script src="../js/myfocus-2.0.1.min.js" type="text/javascript"></script>
	<script type="text/javascript">
        myFocus.set({
            id : 'picBox',
            pattern : 'mF_fancy'
        })
	</script>
	<script>
        function getAllQuestions(){
            $.ajax({
                url: "/getallquestion",  //servlet mapping + 传参  ——  servlet中request.get获取
                type: "post",
                dataType: "json",
                timeout: 1000,
                cache: false,
                async: false,
                error: function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                },  //错误执行方法    
                success: showAllQuestion111 //成功执行方法
            });
        }

        function showAllQuestion111(data){
            if(data == null){     //data返回值内容  servlet中用response.set来返回  还要定义好response头
                alert(" 暂无信息");
            }
            else if(data == ""){
                alert("暂无信息")
            }
            else{

                var json = eval(data);

                $.each(json, function(index, item){
                    //alert(json[index].questionSn) //循环获取数据
					/*            $("#showUUU").append($("<li><a href = 'questionDetail.jsp?question_sn="+json[index].questionSn>+"'><img src = '../images/"+json[index].questionContent+"' />"+
					 "<h2>"+json[index].questionLabel+"</h2>"+
					 "<p>"+json[index].questionSn+"</p>"+"</li>"));*/
                    $("#showUUU").append($("<li><a data-ajax='false' href = '/detail?questionSn="+json[index].questionSn+"' ><img src = '../images/t"+Math.ceil(Math.random()*7+1)+".jpg' />"+
                        "<h2>"+json[index].questionLabel+"</h2>"+
                        "<p>"+json[index].questionContent+"</p></a></li>"));
                });//forEach
                $("#showUUU").listview('refresh');
                $("#showUUU").find("li:last").slideDown(300);
            }//else
        }//function
	</script>
</head>
<body onload ="getAllQuestions()">
<% 			HUsersEntity u = (HUsersEntity) session.getAttribute("loginUser");
	//String haidaxueSn = u.getHaidaxueSn();
	if(u==null){response.sendRedirect("/jsp/login.jsp");}
%>
<div data-role="page" data-theme="a" data-title="嗨大学" id="index">
	<!--page开始 -->
	<div data-role="header" data-position="fixed">
		<!--header开始 -->
		<div class="myLogo">
			<img src="../images/logo.png">
		</div>
		<div class="mySearch">
			<form method = "post" action = "/search" data-ajax="false">
				<input type="search" name="questionLabel" id="questionLabel" value=""
					   placeholder="i want---"
					   style="font-family: 'Comic Sans MS', cursive">
			</form>
		</div>
	</div>
	<!--header结束 -->

	<div class="ad" id="picBox">
		<!--进入图片区域 -->
		<div class="loading">
			<img src="../images/loading.gif" alt="loading">
		</div>
		<div class="pic">
			<!--在写图片列表的时候还是要再写一个DIV把它包起来。-->
			<ul>
				<li><img src="../images/ad11.jpg" /></li>
				<li><img src="../images/ad22.jpg" /></li>
				<li><img src="../images/ad33.jpg" /></li>
			</ul>
		</div>
		<!--图片内部DIV结束-->
	</div>
	<!--图片列表结束-->
	<div class="portions">
		<table>
			<tr>
				<!--我去你妈b的这里有个神坑，data-ajax一定要false不然是以 ajax方式去做跳转不会执行 跳转页面的ajax方法。-->
				<td><a href="/questionlabel?questionLabel=状元" data-ajax="false"><img
						src="../images/hourglass.png"></a></td>
				<td><a href="/questionlabel?questionLabel=志愿" data-ajax="false"><img src="../images/light.png"></td>
				<td><a href="/questionlabel?questionLabel=备考" data-ajax="false"><img src="../images/tag.png"></td>
				<td><a href="/questionlabel?questionLabel=自招" data-ajax="false"><img src="../images/purse.png"></td>
				<td><a href="/questionlabel?questionLabel=问答" data-ajax="false"><img src="../images/guarantee.png"></td>
			</tr>
			<tr>
				<td>状元</td>
				<td>志愿</td>
				<td>备考</td>
				<td>自招</td>
				<td>问答</td>
			</tr>
			<tr>
				<td><a href="/questionlabel?questionLabel=专业" data-ajax="false"><img
						src="../images/purse.png"></td>
				<td><a href="/questionlabel?questionLabel=大学" data-ajax="false"><img
						src="../images/lollipop.png"></td>
				<td><a href="/questionlabel?questionLabel=地区" data-ajax="false"><img
						src="../images/gift.png"></td>
				<td><a href="/questionlabel?questionLabel=素材" data-ajax="false"><img
						src="../images/camera.png"></td>
				<td><a href="/questionlabel?questionLabel=笔记" data-ajax="false"><img
						src="../images/pin.png"></td>
			</tr>
			<tr>
				<td>专业</td>
				<td>大学</td>
				<td>地区</td>
				<td>素材</td>
				<td>笔记</td>
			</tr>
		</table>
	</div>



	<div data-role="ui-content">
		<ul data-role="listview" id = "showUUU">
			<!-- 商品循环开始 -->

		</ul>

	</div>
	<!-- ui-content 结束 -->

	<div data-role="footer" data-position="fixed">
		<div data-role="navbar">
			<ul>
				<li><a href="#" data-icon="home" class="ui-btn-active"><img
						id="myFont" >首页</a></li>
				<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false"><img id="myFont">大神档案</a></li>
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