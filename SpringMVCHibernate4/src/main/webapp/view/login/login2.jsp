<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="/view/import.jsp"></jsp:include>
<title>登陆模板二</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/login/login2.js"></script>
</head>
<body>
<div>
	<div class="container">
		<div class="row">
			<ul class="nav nav-tabs">
				<li role="presentation" class="active">
					<a onclick="changeMain('<%=request.getContextPath()%>/view/message.jsp', this);">Home</a>
				</li>
				<li role="presentation">
					<a onclick="changeMain('<%=request.getContextPath()%>/view/profile.jsp', this);">Profile</a>
				</li>
				<li role="presentation"><a href="#">Messages</a></li>
			</ul>
		</div>
		<div class="row" id="mainPane">

		</div>
	</div>
</div>
</body>
</html>