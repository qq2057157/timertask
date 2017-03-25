<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>cron表达式详解</title>
<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrap.css.map"/>
<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="css/bootstrap-theme.css.map"/>
<link rel="stylesheet" href="css/task-manager.css"/>
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css"/>
</head>
<body>
<div id="container" class="container-fluid">
	<div class="row">
		<div class="page-header">
			<h3><strong>Cron Expressions</strong></h3>
		</div>
	</div>
	<div class="row">
		Cron表达式是一个字符串，字符串以5或6个空格隔开，分为6或7个域，每一个域代表一个含义，Cron有如下两种语法格式：<br>
	</div>
	<div class="row">
		<div class="col-xs-12 text-left">
			Seconds Minutes Hours DayofMonth Month DayofWeek Year 或 

		</div>
	</div>
	<div class="row">
		<div class="col-xs-12 text-left">
			Seconds Minutes Hours DayofMonth Month DayofWeek   
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12 text-left">
			<br>
			<h4><strong>1）Cron表达式的格式：秒 分 时 日 月 周 年(可选)。</strong></h4>
		</div>
	</div>
	<div class="row">
		<table class="table table-bordered">
			<tr>
				<td>字段名</td>
				<td>允许的值</td>
				<td>允许的特殊字符</td>
			</tr>
			<tr>
				<td>秒(Seconds)</td>
				<td>0-59</td>
				<td> , - * /</td>
			</tr>
			<tr>
				<td>分(Minutes)</td>
				<td>0-59</td>
				<td>, - * /</td>
			</tr>
			<tr>
				<td>小时(Hours)</td>
				<td>0-23</td>
				<td>, - * /</td>
			</tr>
			<tr>
				<td>日(DayofMonth)</td>
				<td>1-31</td>
				<td>, - * ? / L W C</td>
			</tr>
			<tr>
				<td>月(Month)</td>
				<td>1-12 or “JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV and DEC”</td>
				<td>, - * /</td>
			</tr>
			<tr>
				<td>周几(DayofWeek)</td>
				<td>1-7 or “SUN, MON, TUE, WED, THU, FRI and SAT”</td>
				<td>, - * ? / L C #</td>
			</tr>
			<tr>
				<td>年 (Year)(可选字段)</td>
				<td>empty, 1970-2099</td>
				<td>, - * /</td>
			</tr>
		</table>
	</div>
	
	<div class="row">
		<div class="col-xs-12 text-left">
			<strong>每一个域都使用数字或指定的字符串，但还可以出现如下特殊字符，它们的含义是：</strong>       
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“*”字符：        
		</div>
		<div class="col-xs-10 text-left">
			表示匹配该域的任意值，假如在Minutes域使用*, 即表示每分钟都会触发事件。
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“?”字符：        
		</div>
		<div class="col-xs-10 text-left">
			只能用在DayofMonth和DayofWeek两个域。它也匹配域的任意值，但实际不会。因为DayofMonth和DayofWeek会相互影响。例如想在每月的20日触发调度，不管20日到底是星期几，则只能使用如下写法： 13 13 15 20 * ?, 其中最后一位只能用？，而不能使用*，如果使用*表示不管星期几都会触发，实际上并不是这样。 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“,”字符：      
		</div>
		<div class="col-xs-10 text-left">
			表示列出枚举值值。例如：在Minutes域使用5,20，则意味着在5和20分每分钟触发一次。 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“-”字符：       
		</div>
		<div class="col-xs-10 text-left">
			表示范围，例如在Minutes域使用5-20，表示从5分到20分钟每分钟触发一次 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“/”字符：       
		</div>
		<div class="col-xs-10 text-left">
			指定一个值的增加幅度。n/m表示从n开始，每次增加m
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“L”字符：       
		</div>
		<div class="col-xs-10 text-left">
			表示最后，只能出现在DayofWeek和DayofMonth域，如果在DayofWeek域使用5L,意味着在最后的一个星期四触发。 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“W”字符：       
		</div>
		<div class="col-xs-10 text-left">
			表示有效工作日(周一到周五),只能出现在DayofMonth域，系统将在离指定日期的最近的有效工作日触发事件。例如：在 DayofMonth使用5W，如果5日是星期六，则将在最近的工作日：星期五，即4日触发。如果5日是星期天，则在6日(周一)触发；如果5日在星期一到星期五中的一天，则就在5日触发。另外一点，W的最近寻找不会跨过月份 
		</div>
	</div>
	<div class="row">
		<div class="col-xs-2 text-right">
			“#”字符：      
		</div>
		<div class="col-xs-10 text-left">
			用于确定每个月第几个星期几，只能出现在DayofMonth域。例如在4#2，表示某月的第二个星期三。
		</div>
	</div>
	<div class="row">
		<div class="col-xs-12 text-left">
			<h4><strong>2）Cron表达式范例：</strong></h4>
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每隔5秒执行一次：
		</div>
		<div class="col-xs-8 text-left">
			*/5 * * * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每隔1分钟执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 */1 * * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每天23点执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 23 * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每天凌晨1点执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 1 * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每月1号凌晨1点执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 1 1 * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每月最后一天23点执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 23 L * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每周星期天凌晨1点实行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 1 ? * L
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			在26分、29分、33分执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 26,29,33 * * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			每天的0点、13点、18点、21点都执行一次：
		</div>
		<div class="col-xs-8 text-left">
			0 0 0,13,18,21 * * ?
		</div>
    </div>
    <div class="row">
		<div class="col-xs-4 text-left">
			 在2002-2006年的每个月的最后一个星期五上午10:15执行:
		</div>
		<div class="col-xs-8 text-left">
			0 15 10 ? 6L 2002-2006
		</div>
    </div>
</div>
</body>
<script  src="js/jquery-1.12.0.min.js"></script>
<script  src="js/bootstrap.min.js"></script>
</html>