<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="/view/import.jsp" %> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<jsp:include page="/view/import.jsp"></jsp:include>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>登录模板一</title>
<style type="text/css">
.top{
	height:40px;
	width:100%;
 	background-color:maroon; 
	padding-top:5px;
}
.main{
	margin-top:20px;

}
.top_con{
	
	background-color: #E6E2EB;
}
.container .jumbotron{
	padding-top:30px;
	padding-left: 30px;
	padding-right: 30px;
}
</style>
</head>
<body>
	<div class="top">
		<div class="container">
			<div class="row col-md-7 col-md-offset-5">
				<form class="form-inline">
				  <div class="form-group">
				    <label class="sr-only">Email address</label>
				    <input type="email" class="form-control input-sm" id="" placeholder="用户名/邮箱/手机号码">
				  </div>
				  <div class="form-group">
				    <label class="sr-only">Password</label>
				    <input type="password" class="form-control input-sm" id="" placeholder="密码">
				  </div>
				  
				  <button type="submit" class="btn btn-warning btn-sm">登录 </button>
				  <button type="submit" class="btn btn-success btn-sm">注册</button>
				  <div class="checkbox" style="font-size: 70%;">
				    <label>
				      <input type="checkbox" style="vertical-align:middle;"> 
				      <span style="vertical-align:middle; font-family: tahoma;color: white;">自动登陆</span>
				    </label>
				  </div>
				</form>
			</div>
		</div>
	</div>
	<div class="container main">
		<div class="row">
			<div class="col-md-4 col-md-offset-4 jumbotron">
				<form class="margin-top:-10px;">
				  <div class="form-group">
				    <label class="sr-only">Email address</label>
				    <input type="email" class="form-control" id="" placeholder="用户名/邮箱/手机号码">
				  </div>
				  <div class="form-group">
				    <label class="sr-only">Password</label>
				    <input type="password" class="form-control" id="" placeholder="密码">
				  </div>
				  <div class="checkbox">
				    <label>
				      <input type="checkbox" checked="checked"> 自动登录
				    </label>
				    <div style="display: inline-block; margin-left: 190px;"><button type="button" class="btn btn-xs btn-link">忘记密码</button></div>
				  </div>
				  <button type="submit" class="btn btn-warning btn-lg btn-block">登录</button>
				  <button type="submit" class="btn btn-success btn-lg btn-block">注册</button>
				</form>
			</div>
		</div>
		
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		        <ol class="carousel-indicators">
		          <li data-target="#carousel-example-generic" data-slide-to="0" class=""></li>
		          <li data-target="#carousel-example-generic" data-slide-to="1" class=""></li>
		          <li data-target="#carousel-example-generic" data-slide-to="2" class="active"></li>
		        </ol>
		        <div class="carousel-inner" role="listbox">
		          <div class="item">
		            <img class="img-rounded" data-src="holder.js/1140x500/auto/#777:#444/text:Second slide" alt="First slide [1140x500]" src="<%=request.getContextPath()%>/img/one.png" data-holder-rendered="true">
		          </div>
		          <div class="item">
		            <img class="img-rounded" data-src="holder.js/1140x500/auto/#666:#444/text:Second slide" alt="Second slide [1140x500]" src="<%=request.getContextPath()%>/img/two.png" data-holder-rendered="true">
		          </div>
		          <div class="item active">
		            <img class="img-rounded" data-src="holder.js/1140x500/auto/#555:#333/text:Third slide" alt="Third slide [1140x500]" src="<%=request.getContextPath()%>/img/three.png" data-holder-rendered="true">
		          </div>
		        </div>
		        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		          <span class="sr-only">Previous</span>
		        </a>
		        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		          <span class="sr-only">Next</span>
		        </a>
	      </div>
	<div class="row" style="margin-top:20px;">
		<div class="panel panel-default">
		  <div class="panel-body">
		    Panel content
		  </div>
		  <div class="panel-footer">Panel footer</div>
		</div>
	</div>
	</div>
</body>
</html>