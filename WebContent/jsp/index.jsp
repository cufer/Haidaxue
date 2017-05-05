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
	<script type="application/javascript">
		//就是做一个Ajax请操作
        function loadXMLDoc()
        {
            var xmlhttp;
            var jsonArray;
            if (window.XMLHttpRequest)
            {// code for IE7+, Firefox, Chrome, Opera, Safari
                xmlhttp=new XMLHttpRequest();
            }
            else
            {// code for IE6, IE5
                xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
            }
            xmlhttp.onreadystatechange=function()
            {
                if (xmlhttp.readyState==4 && xmlhttp.status==200)
                {
                    jsonArray=xmlhttp.responseText;//we get json Data here
                }
            }

            xmlhttp.open("GET","/ajax/demo_get.asp",true);
            xmlhttp.send();
            showQuestion("showQuestions",jsonArray);//then tansform it to showQuestion function
        }

	</script>
	<script>
		showQuestion(obj,json)
        {
            var ul = document.getElementById(obj);
			var jsonArray=json;//get json data,
			//eval 进行相关操作。
            //添加 li
            for (var i = 0; i < cars.length; i++){
				var li = document.createElement("li");
				var a=document.createElement("a");
				var img=document.createElement("")
				//添加 img
				var para = document.createElement("p");
				var node = document.createTextNode("这是新段落。");
				para.appendChild(node);
				li.appendChild(para);
				ul.appendChild(li);
        	}
		}



	</script>
</head>
<body onload="showQuestions('showQuestions')">
<div data-role="page" data-theme="a" data-title="main" id="main">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
			<div class="mySearch">
			    <form method = "post" action = "list.jsp">
				<input type="search" name="search" id="search" value=""
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
					<td><a href="list.jsp?search=书籍"><img
							src="../images/hourglass.png"></a></td>
					<td><a href="list.jsp?search=工具"><img src="../images/light.png"></td>
					<td><a href="list.jsp?search=衣鞋"><img src="../images/tag.png"></td>
					<td><a href="list.jsp?search=包包"><img src="../images/purse.png"></td>
					<td><a href="list.jsp?search=化妆"><img src="../images/guarantee.png"></td>
				</tr>
				<tr>
					<td>状元</td>
					<td>志愿</td>
					<td>备考</td>
					<td>自招</td>
					<td>问答</td>
				</tr>
				<tr>
					<td><a href="list.jsp?search=餐券" id="smallTitle"><img
							src="../images/purse.png"></td>
					<td><a href="list.jsp?search=零食" id="smallTitle"><img
							src="../images/lollipop.png"></td>
					<td><a href="list.jsp?search=门票" id="smallTitle"><img
							src="../images/gift.png"></td>
					<td><a href="list.jsp?search=电子" id="smallTitle"><img
							src="../images/camera.png"></td>
					<td><a href="list.jsp?search=杂物" id="smallTitle"><img
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
			<ul data-role="listview" id="showQuestions">
				<!-- 循环开始 -->
					<li><a>
				<img src="../images/t6.jpg" width="120" height="90"
						border="1" />
						<h2>类型: 填报志愿</h2>
						<p>
							 概述: 我妈让我学医 我爸要我学机械要死了要死了咋办啊我自己啥也不知道啊
						</p>
				</a></li>
			</ul>
		</div>
		<!-- ui-content 结束 -->

		<div data-role="footer" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#" data-icon="home" class="ui-btn-active"><img
							id="myFont" >首页</a></li>
					<li><a href="#list" data-icon="bullets"><img id="myFont">分类</a></li>
					<li><a href="showCart.jsp" data-icon="shop"><img
							id="myFont">收藏</a></li>
					<li><a href="login_success.jsp" data-icon="user"><img id="myFont"
							>我的</a></li>
				</ul>
			</div>
			<!--navbar结束 -->
		</div>
		<!--footer结束 -->
</div>
</body>
</html>