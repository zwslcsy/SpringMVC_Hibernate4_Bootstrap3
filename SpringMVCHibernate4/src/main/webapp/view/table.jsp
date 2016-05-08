<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表格</title>
</head>
<style type="text/css">
.diff{
	margin-top: 10px;
	background-color: #E6E2EB;
}
</style>
<script type="text/javascript">
	function show() {
		alert("ni click");
	}
</script>
<body>
	<div class="container diff">
		<div class="row "></div>
		<div class="col-md-5 col-md-offset-3">
			
			<table class="table table-bordered table-hover table-condensed">
			  <thead>
			  	<tr>
			  		<td>姓名</td>
			  		<td>电话</td>
			  		<td>操作</td>
			  	</tr>
			  </thead>
			  <tbody>
			  	<tr class="active">
			  		<td>张三</td>
			  		<td>938938473839</td>
			  		<td>操作</td>
			  	</tr>
			  	<tr class="warning">
			  		<td>李四</td>
			  		<td>938938473839</td>
			  		<td>操作</td>
			  	</tr>
			  	<tr class="warning">
			  		<td>
			  		发送到
			  		</td>
			  		<td>938938473839</td>
			  		<td>
			  			<button type="button" class="btn btn-default btn-sm" onclick="show();">
			  				<span class="glyphicon glyphicon-edit" aria-hidden="true"></span>
			  			</button>
			  			
			  			<button type="button" class="btn btn-default btn-sm">
			  				<span class="glyphicon glyphicon-trash" aria-hidden="true"></span>
			  			</button>
			  			
			  			<button type="button" class="btn btn-default btn-sm">
			  				<span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
			  			</button>
			  		</td>
			  	</tr>
			  </tbody>
			</table>
		</div>
	</div>
</body>
</html>