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
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<script>
function getMyCollection(){
	$.ajax({  
        url: "/CollectionServlet",  //servlet mapping + 传参  ——  servlet中request.get获取
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
        success: getCollections111 //成功执行方法          
    }); 
}

function getCollections111(data){
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
			$("#showUUU").append($("<li><a data-ajax='false'href = '/detail?questionSn="+json[index].questionSn+"'><img src = '../images/"+json[index].userPic+"' />"+
					"<h2>"+json[index].questionContent+"</h2>"+
					"<p>"+json[index].questionContent+"</p></a></li>"));
        });//forEach
        $("#showUUU").listview('refresh'); 
        $("#showUUU").find("li:last").slideDown(300);
    }//else
}//function 
</script>
</head>
<body onload ="getMyCollection()">
<% 			HUsersEntity u = (HUsersEntity) session.getAttribute("loginUser");
	//String haidaxueSn = u.getHaidaxueSn();
	if(u==null){response.sendRedirect("/jsp/login.jsp");}
%>
<div data-role="page" data-theme="a" data-title="我收藏过的问题" id="MyCollection">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
			<div class="mySearch">
			    <form method = "post" action = "/search">
				<input type="search" name="questionLabel" id="questionLabel" value=""
					placeholder="i want---"
					style="font-family: 'Comic Sans MS', cursive">
				</form>
			</div>
		</div>
		<div data-role="ui-content">
			<ul data-role="listview" id = "showUUU">
				<!-- 商品循环开始 -->
				
			</ul>

		</div>
	<div data-role="footer" data-position="fixed">
		<div data-role="navbar">
			<ul>
				<li><a href="/jsp/index.jsp" data-icon="home"  data-ajax="false"><img
						id="myFont" >首页</a></li>
				<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false"><img id="myFont">大神档案</a></li>
				<li><a href="/jsp/raiseQuestion.jsp" data-icon="edit" data-ajax="false"><img
						id="myFont">提问</a></li>
				<li><a href="#" data-icon="shop" data-ajax="false" class="ui-btn-active"><img
						id="myFont">收藏</a></li>
				<li><a href="/jsp/ihaidaxue.jsp" data-icon="user" data-ajax="false"><img id="myFont">我的</a></li>
			</ul>
		</div>
		<!--navbar结束 -->
	</div>
		<!-- ui-content 结束 -->
</div>
</body>
</html>