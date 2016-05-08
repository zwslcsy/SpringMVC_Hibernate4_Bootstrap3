<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<title>login please</title>
<script type="text/javascript">
	function showTab(obj) {
		$("li").attr("class","");
		$("#mainDiv").load("<%=request.getContextPath()%>/view/" + obj + ".jsp");
		$("#"+obj).attr("class","active");
	}
	$(function(){
		showTab('home');
	});
</script>
</head>
<body>
	<div class="container">
		<ul class="nav nav-tabs">
		  <li role="presentation" id="home"><a onclick="showTab('home');">Home</a></li>
		  <li role="presentation" id="profile"><a onclick="showTab('profile');">Profile</a></li>
		  <li role="presentation" id="message"><a onclick="showTab('message');">Messages</a></li>
		</ul>
	</div>
	
	<div class="container" id="mainDiv">
		
	</div>
<script type="text/javascript">
	
</script>
</body>
</html>