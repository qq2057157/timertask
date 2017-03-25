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
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>定时管理系统</title>
<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrap.css.map"/>
<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="css/bootstrap-theme.css.map"/>
<script  src="js/jquery-1.12.0.min.js"></script>
<script  src="js/bootstrap.min.js"></script>
<script  src="js/bootstrap-paginator.js"></script>
<script  src="js/common.js"></script>
<script  src="js/user-operate.js"></script>
<script  src="js/user-register.js"></script>
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
         location.href = '/timer/org/main?currentPage='+page;
         //console.log(e);
         //console.log(originalEvent);
        // console.log(type);
    }
};
element.bootstrapPaginator(options);	//进行初始化
});

</script>
</head>

<body>

<div id="container" class="container-fluid">
<%@ include  file='../views/Header.jsp'%>
<div class="row garybgcolor">
	<div id="menu" class="col-xs-2 text-center">
	<h3>功能列表</h3>
		<%@ include  file='../views/Menu.jsp'%>
	</div>
	<div id="data" class="col-xs-10 table-responsive">
		<%@ include  file='../views/OrganizationView.jsp'%>
	</div>
</div>
</div>
<%@ include  file='../views/AddOrganizationView.jsp'%>
<%@ include  file='../views/ModifyPasswordView.jsp'%>
<%@ include  file='../views/UserRegiterView.jsp'%>
<%@ include  file='../views/MessageModal.jsp'%>
</body>
<script type="text/javascript">
$(document).ready(function(){
	
	$(".org").addClass("active");
	
	$(document).on("click","#registerSubmit",function(){
		//alert("jinlailai");
		var username= $("#username.register").val();
		var password= $("#password.register").val();
		var name= $("#name").val();
		var organization = $("#organization.organization").val();
		var organizationCode= $("#organizationCode.organizationCode").val();
		var phone= $("#phone").val();
		var email = $("#email").val();
		if(isEmpty(username) || 
				isEmpty(password) || 
				isEmpty(name) || 
				isEmpty(organization) || 
				isEmpty(organizationCode) || 
				isEmpty(phone)){
			alertModalMessage("必填项不能为空，请检查");
		} else {
			$.ajax({
	    		url:"/timer/org/addAdmin",
	    		data:{
	    			username:username,
	    			password:password,
	    			name:name,
	    			organization:organization,
	    			organizationCode:organizationCode,
	    			phone:phone,
	    			email:email
	    		},
	    		type:'get',
	    		dataType:'json',
	    		success:function(data){
	    			if(data.code ==99999){
	    				alertModalMessage("添加管理员成功");
	    				$(".closeMessage").addClass("refresh-btn");
	    			} else if(data.code == 505) {
	    				alertModalMessage("服务器发生异常，添加管理员失败");
	    			} else {
	    				alertModalMessage("添加管理员失败");
	    			}
	    		}
	    		});
			// ajax end;
		}
		
    });
	
	$(document).on("click",".setAdmin",function(){
		//alert($(this).parents('td').prev().find('input.status').val());
		var mythis = $(this);
		var orgId = mythis.parents('td').find('input.id').val();
		var orgName = mythis.parents('tr').find(".orgName").find("small").html();
		//alert(orgName);
		var orgCode = mythis.parents('tr').find(".orgCode").find("small").html();
		//var status= mythis.parents('td').prev().find('input.status').val();
		
		$("#registerModal").modal();
		$("#myModalLabel.userRegTitle").html("添加管理员");
		$("#organization.organization").attr("readonly","readonly");
		$("#organization.organization").val(orgName);
		$("#organizationCode.organizationCode").attr("readonly","readonly");
		$("#organizationCode.organizationCode").val(orgCode);
		//alert($(this).parents('td').find('input.id').val());
	});
	
	$(document).on("click",".disableOrg",function(){
		//alert($(this).parents('td').prev().find('input.status').val());
		var mythis = $(this);
		//alert($(this).parents('td').find('input.id').val());
		$.ajax({
    		url:"/timer/org/disable",
    		data:{
    			id:$(this).parents('td').find('input.id').val()
    		},
    		type:'get',
    		dataType:'json',
    		success:function(data){
    			if(data.code==99999){
    				alertModalMessage("封禁成功");
    				mythis.parents('td').prev().html("<small>封禁</small>");
    				mythis.parents('td').prev().find('input.status').val(4);
    				//mythis.parents('td').html('<a class="taskStop" href="javascript:void(0);">终止</a>');
    				mythis.html("解禁");
    				mythis.addClass("enableOrg");
    				mythis.removeClass("disableOrg");
    				//alert(mythis.hasClass("disableOrg"));
    			} else if(data.code==505){
    				alertModalMessage("封禁失败,服务器异常");		
    			} else {
    				alertModalMessage("封禁失败");
    			}
    		}
    		});
		//ajax end;
	});

	$(document).on("click",".enableOrg",function(){
		//alert($(this).parents('td').prev().find('input.status').val());
		var mythis = $(this);
		//alert($(this).parents('td').find('input.id').val());
		$.ajax({
    		url:"/timer/org/enable",
    		data:{
    			id:$(this).parents('td').find('input.id').val()
    		},
    		type:'get',
    		dataType:'json',
    		success:function(data){
    			if(data.code==99999){
    				alertModalMessage("解禁成功");
    				mythis.parents('td').prev().html("<small>正常</small>");
    				mythis.parents('td').prev().find('input.status').val(1);
    				//mythis.parents('td').html('<a class="taskStop" href="javascript:void(0);">终止</a>');
    				mythis.html("封禁");
    				mythis.addClass("disableOrg");
    				mythis.removeClass("enableOrg");
    			} else if(data.code==505){
    				alertModalMessage("解禁失败,服务器异常");		
    			} else {
    				alertModalMessage("解禁失败");
    			}
    		}
    		});
		//ajax end;
	});
	
	$(document).on("click",".deleteOrg",function(){
		//alert($(this).parents('td').prev().find('input.status').val());
		var mythis = $(this);
		//alert($(this).parents('td').find('input.id').val());
		$.ajax({
    		url:"/timer/org/delete",
    		data:{
    			id:$(this).parents('td').find('input.id').val(),
    			organizationCode:$(this).parents('tr').find('td.orgCode').find("small").html()
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
		//ajax end;
	});
	$("#addOrgButton").click(function(){
		var mythis = $(this);
		$.ajax({
    		url:"/timer/org/add",
    		data:{
    			organization:$("#organization").val(),
    			organizationCode:$("#organizationCode").val()
    		},
    		type:'get',
    		dataType:'json',
    		success:function(data){
    			if(data.code==99999){
    				alertModalMessage("新增组织成功");
    				$(".closeMessage").addClass("refresh-btn");
     			} else if(data.code==505){
     				alertModalMessage("新增组织失败,服务器异常");		
    			} else if(data.code==505){
    				alertModalMessage("新增组织失败,组织名或组织代码已存在");		
    			} else {
    				alertModalMessage("新增组织失败");
    			}
    		}
    		});
	});
	$("#organizationCode").change(function(){
		var reg = new RegExp("^[0-9]*$"); 
		if(!reg.test($(this).val())){
			show("#organizationCodeWarn");
		}else {
			hide("#organizationCodeWarn");
		}
	});
});
</script>
</html>