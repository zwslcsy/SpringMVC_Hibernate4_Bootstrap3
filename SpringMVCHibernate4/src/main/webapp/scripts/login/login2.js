function changeMain(url,obj) {
	var currentLi = obj.parentNode;
	var lis = currentLi.parentNode.children;
	for (var i = 0; i < lis.length; i ++) {
		lis[i].removeAttribute('class');
	}
	currentLi.setAttribute('class','active');
	$("#mainPane").load(url);
}
$(function() {
	$("li")[0].children[0].click();
})