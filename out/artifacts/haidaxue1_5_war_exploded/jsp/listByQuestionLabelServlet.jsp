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

function questionLabelServlet(){
	$.ajax({  
        url: "/questionlabel",  //servlet mapping + 传参  ——  servlet中request.get获取
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
        success: showQuestionLabelSearchList //成功执行方法          
    }); 
}

function showQuestionLabelSearchList(data){  
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
			$("#showUUU").append($("<li><a href = '/detail?questionSn="+json[index].questionSn+"'><img src = '../images/"+json[index].userPic+"' />"+
					"<h2>"+json[index].questionLabel+"</h2>"+
					"<p>"+json[index].questionContent+"</p></a></li>"));
        });//forEach
        $('ul').listview('refresh');
        $("#showUUU").find("li:last").slideDown(300);
    }//else
}//function 
</script>
</head>
<body onload="questionLabelServlet()">
<div data-role="page" data-theme="a" data-title="QuestionLabelSearchList" id="QuestionLabelSearchList">
		<!--page开始 -->
		<div data-role="header" data-position="fixed">
			<!--header开始 -->
			<div class="myLogo">
				<img src="../images/logo.png">
			</div>
		</div>
			<!--header结束 -->
			<div data-role="ui-content">
			<ul data-role="listview" id = "showUUU">
				<!--list循环 -->
				
			</ul>
		
		<ul data-role="listview" id = "showUUU">
				<!-- 商品循环开始 --> 
				<li><a href="details.jsp"> 
				<img src="../images/t3.jpg" width="120" height="90"
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
				<li><a href="#" data-icon="home" class="ui-btn-active" data-ajax="false"><img
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
</div>
<body>

</body>
</html>