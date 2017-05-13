<%@ page import="Entity.HUsersEntity" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>detail</title>
	<link rel="stylesheet" href="../css/haidaxue.min.css" />
	<link rel="stylesheet" href="../css/jquery.mobile.icons.min.css" />
	<link rel="stylesheet" href="../css/index.css" />
	<link rel="stylesheet"
		  href="http://code.jquery.com/mobile/1.4.5/jquery.mobile.structure-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script
			src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<script>
        function getQuestionsDetail(questionSn) {


            $.ajax({
                url : "/detail", //servlet mapping + 传参  ——  servlet中request.get获取
                type : "post",
                dataType : "json",
                timeout : 1000,
                cache : false,
                async : false,
                error : function(XMLHttpRequest, textStatus, errorThrown) {
                    alert(XMLHttpRequest.status);
                    alert(XMLHttpRequest.readyState);
                    alert(textStatus);
                }, //错误执行方法
                success : getQuestionsDetail111
                //成功执行方法
            });


        function getQuestionsDetail111(data) {



            if (data == null) { //data返回值内容  servlet中用response.set来返回  还要定义好response头
                alert(" 暂无信息");
            } else if (data == "") {
                alert("暂无信息")
            } else {
                var json = eval(data);

                $.each(json,function(index, item) {
                    //alert(json[index].questionSn) //循环获取数据
                    if(json[index].questionContent!=null){
                        var para=document.createElement("p");
                        var node=document.createTextNode(json[index].questionContent);

                        para.appendChild(node);

                        var element=document.getElementById("wenti");
                        element.appendChild(para);
                    }else{
						

                        $("#answers").append($("<p>"+ json[index].answersContent
                            + "</p><a onclick='AddIntoPreference("+json[index].answersSn+","+json[index].questionSn+")'><img src = '../images/赞1.png' id = 'dianzan"+json[index].answersSn+"'/></a>"
                            +"<a onclick ='AddIntoCollection("+json[index].answersSn+","+json[index].questionSn+")'><img src = '../images/收藏1.png' id = 'shoucang"+json[index].answersSn+"'/></a>"
                            +"<p>"+json[index].answersSupportCount+"</p></li>"));
                    }});


            }

        }}//forEach
	</script>
	<!-- 这两个function实现更换了图片，但是还没想好怎么把信息传给servlet -->
	<script>
        function AddIntoPreference(answersSn,questionSn){
			alert(answersSn+" "+questionSn);
            document.getElementById('dianzan'+answersSn).src = "../images/赞2.png";
            var tmp = document.createElement("form");
            var action = "/preference?answerSn="+answersSn+"&"+"questionSn="+questionSn;
            tmp.action = action;
            tmp.method = "post";
            document.body.appendChild(tmp);
            tmp.submit();
            alert("成功");
        }
        function AddIntoCollection(answersSn,questionSn){
            alert("colleciton");
            document.getElementById('shoucang'+answersSn).src = "../images/收藏.png";
            document.getElementById('dianzan'+answersSn).src = "../images/赞2.png";
            var tmp = document.createElement("form");
            var action = "/collection?answerSn="+answersSn+"&"+"questionSn="+questionSn;
            tmp.action = action;
            tmp.method = "post";
            document.body.appendChild(tmp);
            tmp.submit();
            alert("成功");
        }
		function addElement(questionSn) {
			alert(questionSn);
            document.getElementById("sn").value=questionSn;
        }

	</script>
</head>
<body onload="addElement(<%=request.getParameter("questionSn")%>),getQuestionsDetail(<%=request.getParameter("questionSn")%>)">
<% 			HUsersEntity u = (HUsersEntity) session.getAttribute("loginUser");
	//String haidaxueSn = u.getHaidaxueSn();
	if(u==null){response.sendRedirect("/jsp/login.jsp");}
%>
<div data-role="page" data-theme="a" data-title="detail" id="detail" >
	<!--page开始 -->
	<div data-role="header" data-position="fixed">
		<!--header开始 -->
		<div class="myLogo">
			<img src="../images/logo.png">
		</div>
	</div>
	<!--header结束 -->
	<div data-role="ui-content">
		<div class="ui-corner-all custom-corners">
			<div class="ui-bar ui-bar-a">
				<h3>问题</h3>
			</div>
			<div class="ui-body ui-body-a" id="wenti">
				<p></p>
			</div>
		</div>

		<div class="ui-corner-all custom-corners">
			<div class="ui-bar ui-bar-a">
				<h3>评论</h3>
			</div>
			<div class="ui-body ui-body-a" id = "answers">
				<p> </p>
			</div>
		</div>

		<form id="formToAnswer" method="post" action="/provideanswer">
			<label for = "textarea-1">我的回答</label>
			<input type="hidden" id="sn" name="questionSn" value="" ></input>
			<textarea name  ="answerContent" id = "answerContent" placeholder="I think~~~" style="font-family: 'Comic Sans MS', cursive"></textarea>
			<button type="submit" >提交</button>
		</form>
	</div>
	<!-- ui-content 结束 -->

	<div data-role="footer" data-position="fixed">
		<div data-role="navbar">
			<ul>
				<li><a href="/jsp/index.jsp" data-icon="home" data-ajax="false"> <img id="myFont">首页
				</a></li>
				<li><a href="/jsp/specialProfile.jsp" data-icon="bullets" data-ajax="false"> <img
						id="myFont">大神档案
				</a></li>
				<li><a href="/jsp/raiseQuestion.jsp" data-icon="edit" data-ajax="false"> <img
						id="myFont">提问
				</a></li>
				<li><a href="/jsp/showCollections.jsp" data-icon="shop" data-ajax="false"> <img
						id="myFont">收藏
				</a></li>
				<li><a href="/jsp/ihaidaxue.jsp" data-icon="user" data-ajax="false"><img
						id="myFont">我的</a></li>
			</ul>
		</div>
		<!--navbar结束 -->
	</div>
	<!--footer结束 -->
</div>
</div>
</body>
</html>
