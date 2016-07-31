<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<jsp:include page="/view/import.jsp"></jsp:include>
<title>This is login3</title>
<style type="text/css">
.head{
	background-color:#f8f8f8;
	height:40px;
}
.container-fluid .jumbotron{
	padding-top:15px;
	padding-left: 30px;
	padding-right: 30px;
	padding-bottom:15px;
}
</style>
<script type="text/javascript">
function getTree() {
	var tree = [
	            {
	              text: "Parent 1",
	              nodes: [
	                {
	                  text: "Child 1",
	                  nodes: [
	                    {
	                      text: "Grandchild 1"
	                    },
	                    {
	                      text: "Grandchild 2"
	                    }
	                  ]
	                },
	                {
	                  text: "Child 2"
	                }
	              ]
	            },
	            {
	              text: "Parent 2"
	            },
	            {
	              text: "Parent 3"
	            },
	            {
	              text: "Parent 4"
	            },
	            {
	              text: "Parent 5"
	            }
	          ];	  return tree;
	}
	$(function() {
		$('#tree').treeview({data: getTree()});
	})
	
</script>
</head>
<body>

<div class="head">
	<div class="container">
		<div class="row">
			<ul class="nav nav-pills">
			  <li role="presentation" class="active "><a href="#">Home</a></li>
			  <li role="presentation"><a href="#">Profile</a></li>
			  <li role="presentation"><a href="#">KONO</a></li>
			</ul>
		</div>
	</div>
</div>
<div class="container-fluid" style="margin-top:8px;">
<div class="row">
	<div class="col-md-2">
		<div class="list-group">
		  <button type="button" class="list-group-item">Cras justo </button>
		  <button type="button" class="list-group-item">Dapibus in</button>
		  <button type="button" class="list-group-item">Morbi leo </button>
		  <button type="button" class="list-group-item">Porta a ac</button>
		  <button type="button" class="list-group-item">Vestibulum </button>
		</div>
	</div>
	<div id="tree" class="row col-md-2"></div>
	
	<div class="col-md-10 jumbotron">
		<div class="row">
			<form class="form-inline">
			  <div class="form-group">
			    <label class="sr-only" for="exampleInputEmail3">Email address</label>
			    <input type="email" class="form-control input-sm" id="exampleInputEmail3" placeholder="Email">
			  </div>
			  <div class="form-group">
			    <label class="sr-only" for="exampleInputPassword3">Password</label>
			    <input type="password" class="form-control input-sm" id="exampleInputPassword3" placeholder="Password">
			  </div>
			  <button type="submit" class="btn btn-default btn-sm">Sign in</button>
			</form>
		</div>
		<div class="row" style="margin-top:8px;">
					<table class="table table-bordered">
						<thead>
							<tr>
								<td>姓名</td>
								<td>编号</td>
								<td>邮箱</td>
								<td>备注</td>
								<td>操作</td>
							</tr>
						</thead>
						<tr>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>Penny</td>
							<td>Sheldon</td>
						</tr>
						<tr>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>Penny</td>
							<td>Sheldon</td>
						</tr>
						<tr>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
							<td>Penny</td>
							<td>Sheldon</td>
						</tr>
					</table>
		</div>
		<div class="row">
			<nav>
		      <ul class="pagination">
		        <li><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
		        <li><a href="#">1</a></li>
		        <li><a href="#">2</a></li>
		        <li><a href="#">3</a></li>
		        <li><a href="#">4</a></li>
		        <li><a href="#">5</a></li>
		        <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
		      </ul>
		    </nav>
		</div>
	</div>
	
</div>
</div>
</body>
</html>