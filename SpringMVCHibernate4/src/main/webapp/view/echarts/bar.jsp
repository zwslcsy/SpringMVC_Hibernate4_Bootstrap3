<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../import.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>play with echarts</title>
<script type="text/javascript">
	$(function() {
		var mainChart = echarts.init(document.getElementById('main'));
		var main1Chart = echarts.init(document.getElementById('main1'));
        var option0 = {
            title: {
                text: '各个编程语言使用人数'
            },
            tooltip: {},
            legend: {
                data:['JAVA']
            },
            xAxis: {
                data: ["2010","2011","2012","2013","2014","2015","2016"]
            },
            yAxis: {name:'人数(万)'},
            series: [{
                name: 'JAVA',
                type: 'line',
                data: [5, 12, 25, 27, 25, 30, 35]
            }
            ]
        };
        var option1 = {
                title: {
                    text: '各个编程语言使用人数'
                },
                tooltip: {},
                legend: {
                    data:['JAVA', 'C', 'C++']
                },
                xAxis: {
                    data: ["2010","2011","2012","2013","2014","2015","2016"]
                },
                yAxis: {name:'人数(万)'},
                series: [{
                    name: 'JAVA',
                    type: 'line',
                    data: [5, 12, 25, 27, 25, 30, 35]
                },{
                    name: 'C',
                    type: 'line',
                    data: [7, 8, 12, 16, 17, 20, 26]
                },{
                    name: 'C++',
                    type: 'line',
                    data: [7, 10, 16, 18, 20, 26, 30]
                }
                ]
            };
        mainChart.setOption(option0);
        main1Chart.setOption(option1);
	});
</script>
</head>
<body>
<div id="main" style="width: 700px;height:500px;"></div>

<div id="main1" style="width: 700px;height:500px;"></div>
</body>
</html>