<%--
  Created by IntelliJ IDEA.
  User: panyunyi
  Date: 2017/5/6
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="application/javascript">
        //就是做一个Ajax请操作
        function loadXMLDoc()
        {
            alert("sbsbbs");
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

            xmlhttp.open("POST","/servlet/ShowItems",true);
            xmlhttp.send();

            showItems("showItems",jsonArray);//then tansform it to showQuestion function
        }

    </script>
    <script>
        function showItems(obj,json)
        {
            alert("show");
            var ul = document.getElementById(obj);
            var jsonArray=eval(json);//get json data,
            //eval 进行相关操作。

            var rows =jsonArray.rows;
            alert(jsonArray);
            var ul = $("#showItems");
            if(obj==null || obj==""){
                ul.append('暂无数据！');
                return false;
            }
            for (var i = 0; i < rows; i++){
                li.append('<ul><li>'+jsonArray[i].Picture+jsonArray[i].Itemname+obj[i].Address+jsonArray[i].Itemtype+jsonArray[i].Pic+'</li></ul>');
                ul.appendChild(li);
            }
        }
    </script>

    <title>Title</title>
</head>
<body>
<ul id="showItems">

</ul>

</body>
</html>
