<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>定时管理系统</title>
<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrap.css.map"/>
<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="css/bootstrap-theme.css.map"/>
<link rel="stylesheet" href="css/task-manager.css"/>
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css"/>
<script  src="js/jquery-1.12.0.min.js"></script>
<script  src="js/bootstrap.min.js"></script>
<script  src="js/common.js"></script>
<script  src="js/user-operate.js"></script>
<script  src="js/bootstrap-paginator.js"></script>
<script  src="js/bootstrap-datetimepicker.js"></script>
<script  src="js/locales/bootstrap-datetimepicker.zh-CN.js"></script>
</head>

<body>

<div id="container" class="container-fluid">
<%@ include  file='../views/Header.jsp'%>
<div class="row">
	<div id="menu" class="col-xs-2 text-center">
	<h3>功能列表</h3>
		<%@ include  file='../views/Menu.jsp'%>
	</div>
	<div id="data" class="col-xs-10 table-responsive">
		<%@ include  file='../views/TimerTaskView.jsp'%>
	</div>
</div>
</div>
<%@ include  file='../views/ModifyPasswordView.jsp'%>
<%@ include  file='../views/AddTimerTaskView.jsp'%>
<%@ include  file='../views/MessageModal.jsp'%>

</body>
<script type="text/javascript">
$(".task").addClass("active");
$(document).ready(function(){
	$('#startTime').datetimepicker({
		language:  'zh-CN',                                     
        weekStart: 1,
        todayBtn:  1,
        todayHighlight: 1,
        autoclose:1,
        pickerPosition:"top-left",
        startDate:new Date(),
        maxView:3
	}).on("click",function(ev){
	    $("#startTime").datetimepicker("setEndDate", $("#endTime").val())});
	    
	$('#endTime').datetimepicker({
		language:  'zh-CN',                                     
        weekStart: 1,
        todayBtn:  1,
        todayHighlight: 1,
        autoclose:1,
        pickerPosition:"top-left",
        startDate:new Date(),
        maxView:3
	}).on("click",function(ev){
	    $("#endTime").datetimepicker("setStartDate", $("#startTime").val());
	    show(".endTimeWarn");
	});
	$(document).on("blur","#endTime",function(){
		hide(".endTimeWarn");
	});
	$(document).on("click","#repeatCount",function(){
		show(".repeatCountWarn");
	});
	$(document).on("blur","#repeatCount",function(){
		hide(".repeatCountWarn");
		});
	$(document).on("click","#cronExpress",function(){
		show(".cronWarn");
	});
	$(document).on("change","#cronExpress",function(){
		hide(".cronWarn");
	});
	$('#myTabs a[href="#simple"]').click(function (e) {
		  $("#triggerType").val(0);
		});
	$('#myTabs a[href="#cron"]').click(function (e) {
		  $("#triggerType").val(1);
		});
	$("#jobName").keyup(function(){
		 $("#triggerName").val($(this).val());
		});
	$("#targetUrl").one("click",function(){
		alertModalMessage("目标URL必须以http://或https://开头");
		});
	$(document).on("change","#targetUrl",function(){
		var patt=new RegExp(/http(s)?:\/\/([\w-]+\.)+[\w-]+(\/[\w- .\/?%&=]*)?/);
		if(patt.test($(this).val())){
			show("#urlok-icon");
			hide("#urldisable-icon");
		} else {
			show("#urldisable-icon");
			hide("#urlok-icon");
		}
		});
	$("#parameters").one("click",function(){
		alertModalMessage('参数列表格式为JSON，例如:{"key":"value","key":"value"}');
		});
	$("#parameters").change(function(){
		// todo
		});
	$("#addTaskButton").click(function(){
		var jobName = $("#jobName").val();
		var triggerName = $("#triggerName").val();
		var targetUrl = $("#targetUrl").val();
		var repeatInterval = $("#repeatInterval").val();
		var repeatCount = $("#repeatCount").val();
		var triggerType = $("#triggerType").val();
		var startTime = $("#startTime").val();
		var endTime = $("#endTime").val();
		var cronExpress = $("#cronExpress").val();
		// 触发器类型为简单类型
		if(triggerType==0){
			if(isEmpty(jobName) ||
					isEmpty(triggerName) ||
					isEmpty(targetUrl) ||
					isEmpty(startTime) ||
					isEmpty(repeatInterval) ||
					(isEmpty(endTime) && isEmpty(repeatCount))){
				alertModalMessage("添加的simple类型任务中有必填参数为空，请检查");
			} else {
				
				$.ajax({
		    		url:"/timer/task/add",
		    		data:{
		    			jobName:jobName,
		    			triggerName:triggerName,
		    			targetUrl:targetUrl,
		    			parameters:$("#parameters").val(),
		    			startTime:startTime,
		    			endTime:endTime,
		    			repeatCount:repeatCount,
		    			repeatInterval:repeatInterval,
		    			triggerType:triggerType
		    		},
		    		type:'get',
		    		dataType:'json',
		    		success:function(data){
		    			if(data.code==99999){
		    				alertModalMessage("添加simple任务成功");
		    				location.reload();
		    			} else if(data.code==10008){
		    				alertModalMessage("添加任务失败,数据库中未查到此任务的信息，请重试");
		    			} else if(data.code==505){
		    				alertModalMessage("添加任务失败,服务器异常");		
		    			} else {
		    				alertModalMessage("添加任务失败");
		    			}
		    		}
		    		});
				// ajax end;
			}
		}else {// 触发器类型为cron类型
			if(isEmpty(jobName) ||
					isEmpty(triggerName) ||
					isEmpty(targetUrl) ||
					isEmpty(cronExpress)){
				alertModalMessage("添加cron类型任务中有必填参数为空，请检查");
			} else {
				$.ajax({
		    		url:"/timer/task/add",
		    		data:{
		    			jobName:jobName,
		    			triggerName:triggerName,
		    			targetUrl:targetUrl,
		    			parameters:$("#parameters").val(),
		    			triggerType:triggerType,
		    			cronExpress:cronExpress
		    		},
		    		type:'get',
		    		dataType:'json',
		    		success:function(data){
		    			if(data.code==99999){
		    				alertModalMessage("添加cron类型任务成功");
		    				location.reload();
		    			} else if(data.code==10008){
		    				alertModalMessage("添加任务失败,数据库中未查到此任务的信息，请重试");
		    			} else if(data.code==505){
		    				alertModalMessage("添加任务失败,服务器异常");		
		    			} else {
		    				alertModalMessage("添加任务失败");
		    			}
		    		}
		    		});
				// ajax end;
			}
		} 
	});
	
	$(document).on("click",".taskStart",function(){
			//alert($(this).parents('td').prev().find('input.status').val());
			var mythis = $(this);
			//alert($(this).parents('td').find('input.id').val());
			$.ajax({
	    		url:"/timer/task/start",
	    		data:{
	    			id:$(this).parents('td').find('input.id').val()
	    		},
	    		type:'get',
	    		dataType:'json',
	    		success:function(data){
	    			if(data.code==99999){
	    				alertModalMessage("启动成功");
	    				mythis.parents('td').prev().html("<small>运行中</small>");
	    				mythis.parents('td').prev().find('input.status').val(1);
	    				//mythis.parents('td').html('<a class="taskStop" href="javascript:void(0);">终止</a>');
	    				mythis.html("终止");
	    				mythis.removeClass("taskStart");
	    				mythis.addClass("taskStop");
	    			} else if(data.code==10008){
	    				alertModalMessage("启动失败,数据库中未查到此任务的信息，请重试");
	    			} else if(data.code==505){
	    				alertModalMessage("启动失败,服务器异常");		
	    			} else {
	    				alertModalMessage("启动失败");
	    			}
	    		}
	    		});
			//ajax end;
		});
	
	$(document).on("click",".taskStop",function(){
		//alert($(this).parents('td').prev().find('input.status').val());
		var mythis = $(this);
		$.ajax({
    		url:"/timer/task/stop",
    		data:{
    			id:$(this).parents('td').find('input.id').val()
    		},
    		type:'get',
    		dataType:'json',
    		success:function(data){
    			if(data.code==99999){
    				alertModalMessage("终止成功");
    				mythis.parents('td').prev().html("<small>已终止</small>");
    				mythis.parents('td').prev().find('input.status').val(4);
    				mythis.css("display","none");
    				//mythis.removeClass("taskStop");
    				//mythis.addClass("taskDelete");
   				} else if(data.code==505){
   					alertModalMessage("终止失败,服务器异常");		
    			} else {
    				alertModalMessage("终止失败");
    			}
    		}
    		});
	});
	
	$(".taskDelete").click(function(){
		var mythis = $(this);
		$.ajax({
    		url:"/timer/task/delete",
    		data:{
    			id:$(this).parents('td').find('input.id').val()
    		},
    		type:'get',
    		dataType:'json',
    		success:function(data){
    			if(data.code==99999){
    				alertModalMessage("删除成功");
    				mythis.parents('td').parents("tr").remove();
     			} else if(data.code==505){
     				alertModalMessage("删除失败,服务器异常");		
    			} else {
    				alertModalMessage("删除失败");
    			}
    		}
    		});
	});
});
</script>

<script type="text/javascript">

$(function(){
	var element = $("#paginator");//获得数据装配的位置
	//初始化所需数据
	var options = {
	    bootstrapMajorVersion:3,//版本号。3代表的是第三版本
	    currentPage: ${currentPage}, //当前页数
	    numberOfPages: 5, //显示页码数标个数
	    totalPages:Math.ceil(${sumNum}/${pageSize}), //总共的数据所需要的总页数
	    itemTexts: function (type, page, current) {  
	    		//图标的更改显示可以在这里修改。
	    switch (type) {  
	            case "first":  
	                return "首页";  
	            case "prev":  
	                return "上一页";  
	            case "next":  
	                return "下一页";  
	            case "last":  
	                return "末页";  
	            case "page":  
	                return  page;  
	        }                 
	    }, 
    tooltipTitles: function (type, page, current) {
		//如果想要去掉页码数字上面的预览功能，则在此操作。例如：可以直接return。
        switch (type) {
            case "first":
                return "Go to first page";
            case "prev":
                return "Go to previous page";
            case "next":
                return "Go to next page";
            case "last":
                return "Go to last page";
            case "page":
                return (page === current) ? "Current page is " + page : "Go to page " + page;
        }
    },
    onPageClicked: function (e, originalEvent, type, page) {  
         //单击当前页码触发的事件。若需要与后台发生交互事件可在此通过ajax操作。page为目标页数。
         location.href = '/timer/task/main?currentPage='+page;
         //console.log(e);
         //console.log(originalEvent);
        // console.log(type);
    }
};
element.bootstrapPaginator(options);	//进行初始化
});

</script>
</html>