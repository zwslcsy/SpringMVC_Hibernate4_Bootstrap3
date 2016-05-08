<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="import.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单</title>
<style type="text/css">
.diff{
	margin-top: 10px;
	background-color: #E6E2EB;
}
</style>
</head>
<body>
<div class="container">
	<div class="row diff">
		<div class="col-md-4">
			<form action="">
				<div class="input-group input-group-sm">
				  <input type="text" class="form-control" placeholder="Recipient's username" aria-describedby="basic-addon2">
				  <span class="input-group-addon" id="basic-addon2">@example.com</span>
				</div>
			</form>
		</div>
		
		<div class="col-md-2 col-lg-offset-1" >
		    <div class="input-group input-group-sm">
		      <input type="text" class="form-control">
		      <span class="input-group-btn">
		        <button class="btn btn-default" type="button">Go!</button>
		      </span>
		    </div><!-- /input-group -->
		</div>
		
		<div class="col-md-4 col-lg-offset-1" style="background-color: gray;">
			
		    <div class="input-group input-group-sm">
		      <input type="text" class="form-control" placeholder="Search for...">
		    </div><!-- /input-group -->
		</div>
		
	</div>
	<div class="row diff" >
		<div class="col-md-3 col-md-offset-4" style="background-color: orange;">
			<form class="form-horizontal">
			  <div class="form-group form-group-sm">
			    <label for="inputEmail3" class="col-sm-3 control-label">邮箱：</label>
			    <div class="col-sm-8" style="margin-left: -30px;">
			      <input type="text" class="form-control" placeholder="Text input">
			    </div>
			  </div>
			  <div class="form-group form-group-sm">
			    <label for="inputPassword3" class="col-sm-3 control-label">密码：</label>
			    <div class="col-sm-8" style="margin-left: -30px;">
			      <input type="password" class="form-control input-sm" id="inputPassword3" placeholder="Password">
			    </div>
			  </div>
			  <div class="form-group form-group-sm">
			    <label for="inputPassword3" class="col-sm-3 control-label">文件：</label>
			    <div class="col-sm-8" style="margin-left: -30px;">
			    	<input type="file">
			    </div>
			  </div>
			  <div class="form-group form-group-sm">
			  	<label for="inputPassword3" class="col-sm-3 control-label">擅长：</label>
			    <div class="col-sm-2" style="margin-left: -30px;">
			      <div class="checkbox">
			        <label><input type="checkbox">Java</label>
			      </div>
			    </div>
			    <div class="col-sm-2">
			      <div class="checkbox">
			        <label><input type="checkbox">C++</label>
			      </div>
			    </div>
			    <div class="col-sm-2">
			      <div class="checkbox">
			        <label><input type="checkbox">Linux</label>
			      </div>
			    </div>
			    <div class="col-sm-2">
			      <div class="checkbox">
			        <label><input type="checkbox">Hadoop</label>
			      </div>
			    </div>
			  </div>
			  <div class="form-group form-group-sm">
			  	<label for="inputPassword3" class="col-sm-3 control-label">是否：</label>
			  	<div class="col-md-4">
			  		<select class="form-control">
					  <option>启动</option>
					  <option>熄火</option>
					  <option>可用</option>
					  <option>禁用</option>
					  <option>锁定</option>
				    </select>
			  	</div>
			  </div>
			  
			  <div class="form-group form-group-sm">
			  	<label for="inputPassword3" class="col-sm-3 control-label">性别：</label>
			  	<div>
			  		<div class="radio col-sm-2"  style="margin-left: -30px;">
					  <label>
					    <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked> 男
					  </label>
					</div>
					<div class="radio col-sm-2">
					  <label>
					    <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">女
					  </label>
					</div>
			  	</div>
			  	
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Sign in</button>
			    </div>
			  </div>
			</form>
		</div>
	</div>
	<div class="row diff" >
		<div class="col-md-offset-2">
			<form class="form-inline">
			  <div class="form-group">
			    <label for="exampleInputName2">Name</label>
			    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail2">Email</label>
			    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
			  </div>
			  <button type="submit" class="btn btn-default">Send invitation</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>