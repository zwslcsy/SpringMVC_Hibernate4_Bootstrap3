<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>栅格系统</title>
<style type="text/css">
.diff{
	margin-top: 10px;
	background-color: #E6E2EB;
}
</style>
</head>
<body>
	<div class="container-fluid" >
		<div class="row diff">
			<div class="row col-md-3 col-md-offset-4" style="background-color: gray;">
				col-md-3
			</div>
			
			<div class="col-md-2" style="background-color: orange;">
				col-md-2  <span class="glyphicon glyphicon-asterisk">小星星</span>
				<button type="button" class="btn btn-default" aria-label="Left Align">
				  <span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
				</button>
				
				<button type="button" class="btn btn-default btn-lg">
				  <span class="glyphicon glyphicon-star" aria-hidden="true"></span> Star
				</button>
			</div>
		</div>
		
		
		<div class="row diff">
			<div class="col-md-3" style="background-color: blue;">col-md-3</div>
			<div class="col-md-3 col-md-offset-6" style="background-color: green;">col-md-3</div>
		</div>
		
		<div class="row diff">
			<div class="col-md-2 col-md-offset-2" style="background-color: red;">col-md-2 col-md-offset-2</div>
			<div class="col-sm-1 col-md-offset-2" style="background-color: gray;">col-sm-1</div>
		</div>
		
		<div class="row diff">
			<div class="col-md-3">
				<div class="dropdown">
				  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
				    Dropdown
				    <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				    <li><a href="#">Action</a></li>
				    <li><a href="#">Another action</a></li>
				    <li><a href="#">Something else here</a></li>
				    <li><a href="#">Separated link</a></li>
				  </ul>
				</div>
			</div>
			<div class="col-md-3 col-md-offset-2">
				<div class="dropup">
				  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
				    Dropdown
				    <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				    <li><a href="#">Action</a></li>
				    <li><a href="#">Another action</a></li>
				    <li><a href="#">Something else here</a></li>
				    <li><a href="#">Separated link</a></li>
				  </ul>
				</div>
			</div>
			
			<div class="col-md-3 col-md-offset-1">
				<div class="btn-group" role="group" aria-label="123">
				  <button type="button" class="btn btn-default">Left</button>
				  <button type="button" class="btn btn-default">Middle</button>
				  <button type="button" class="btn btn-default">Right</button>
				</div>
			</div>
		</div>
		
		<div class="row diff">
			<div class="col-md-5">
			  <div class="btn-group" role="group" aria-label="...">
			  	<button type="button" class="btn btn-primary">1</button>
				<button type="button" class="btn btn-warning">2</button>
				<button type="button" class="btn btn-default">3</button>
				<button type="button" class="btn btn-success">4</button>
				<button type="button" class="btn btn-info">5</button>
				<button type="button" class="btn btn-default">6</button>
			  </div> 
			</div>
			<div class="col-md-3 col-md-offset-1">
				<div class="dropdown">
				  <button class="btn btn-success dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
				    Dropdown
				    <span class="caret"></span>
				  </button>
				  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
				    <li><a href="#">Action</a></li>
				    <li><a href="#">Another action</a></li>
				    <li><a href="#">Something else here</a></li>
				    <li><a href="#">Separated link</a></li>
				  </ul>
				</div>
			</div>
		</div>
		
		<div class="row diff">
			<div class="col-md-2" style="margin-left: 0px;">
				<div class="btn-group-vertical" role="group" aria-label="...">
				  <button type="button" class="btn btn-default">Left</button>
				  <button type="button" class="btn btn-default">Middle</button>
				  <button type="button" class="btn btn-default">Right</button>
				  <button type="button" class="btn btn-default">Left</button>
				  <button type="button" class="btn btn-default">Middle</button>
				  <button type="button" class="btn btn-default">Right</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>