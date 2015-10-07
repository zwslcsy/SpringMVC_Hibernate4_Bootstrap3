<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/bootstrap.min.js"></script>
<title>login please</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="container " style="margin-top: 20px;">
    	<div class="row col-md-8 col-md-offset-2 jumbotron">
    		<table class="table table-bordered table-hover">
    			 <thead>
				    <tr>
				      <th>用户名</th>
				      <th>密码</th>
				      <th>状态</th>
				    </tr>
				  </thead>
				  <tbody>
		    		<c:forEach items="${users }" var="user">
		    			<tr>
		    				<td>${user.userName }</td>
		    				<td>${user.passwd }</td>
		    				<td>${user.state }</td>
		    			</tr>
		    		</c:forEach>
	    		</tbody>
    		</table>
    	</div>
 	</div>
</body>
</html>