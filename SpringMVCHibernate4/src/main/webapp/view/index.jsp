<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<div class="container">
		<div class="row col-md-4 col-md-offset-4 jumbotron">

			<form action="<c:url value="/user/login.htm" />" method="post">
				<div class="form-group">
					<label for="exampleInputEmail1">Email address</label> 
					<input name="userName" type="text" class="form-control" 
						id="exampleInputEmail1" placeholder="Email">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Password</label> 
					<input name="passwd" type="password" class="form-control" 
							id="exampleInputPassword1" placeholder="Password">
				</div>
				<button type="submit" class="btn btn-lg btn-primary">Login</button>
			</form>
		</div>
	</div>

</body>
</html>