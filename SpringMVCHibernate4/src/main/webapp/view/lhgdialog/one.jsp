<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>one</title>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/scripts/lhgdialog/lhgdialog.min.js?skin=mac"></script>
<script type="text/javascript">
	var dialog = null;
	function push() {
		dialog = $.dialog({
			title:'我是新标题',
			content: 'url:<%=request.getContextPath()%>/view/home.jsp',
			okVal:'确定',
			ok: function(){
		        return true;
		    },
		    cancelVal: '关闭',
		    cancel: function () {
		    	return true;
		    },
		    width: '700px',
		    height: '500px',
		});
	}
</script>
</head>
<body>
	<input type="button" name="show" value="push" onclick="push();" />
</body>
</html>