<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>定时服务管理系统登陆系统</title>
<base href="<%=basePath%>">
<link rel="stylesheet" href="css/bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrap.css.map"/>
<link rel="stylesheet" href="css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="css/bootstrap-theme.css.map"/>
<link rel="stylesheet" href="css/main.css"/>
<script  src="js/jquery-1.12.0.min.js"></script>
<script  src="js/bootstrap.min.js"></script>
<script  src="js/common.js"></script>
<script  src="js/user-register.js"></script>
<script  src="js/user-operate.js"></script>
</head>

<body>

<div id="container" class="container-fluid ">
	<div class="row">
			<div class=" col-xs-1 col-md-offset-11 ">
			<a role="menuitem" tabindex="-1"
						data-toggle="modal" data-target="#registerModal"
						href="javascript:void(0);">用户注册</a>
			</div>
	</div>
	<div class="page-header">
		<h1>
			<span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;定时服务管理系统
		</h1>
	</div>
		<div class="row">
			<br>
			<br>
			<br>
			<br>
			<br>
			<form class="form-horizontal">
				<div class="form-group">
					<label class="col-xs-2 col-md-offset-3 control-label text-right">用户名：</label>
					<div class="col-xs-2">
						<input type="text" class="form-control" id="username"
							placeholder="Username">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword"
						class="col-xs-2 col-md-offset-3 control-label text-right">密码：</label>
					<div class="col-xs-2">
						<input type="password" class="form-control" id="password"
							placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-2 col-md-offset-3">&nbsp;</div>
					<div class="col-xs-1 text-right">
						<input id="reset" type="button" name="重置" value="重置"
							class="btn btn-info btn-lg" />
					</div>
					<div class="col-xs-1 text-left">
						<input id="submit" type="button" value="登录"
							class="btn btn-primary btn-lg" />
					</div>
				</div>
				<div class="form-group">
					<div class="col-xs-2 col-md-offset-3">&nbsp;</div>
					<div class="col-xs-2 text-center">
						<a href="javascript:void(0);">忘记密码？</a>
					</div>
				</div>
			</form>
		</div>
	</div>
	<div id="footer" class="container text-center footer">
		<nav class="navbar navbar-default navbar-fixed-bottom">
				<small><strong>Copyright hust.edu.com </strong>Design by huwentao All Rights Reserved</small>
		</nav>
	</div>
	
	<%@ include  file='views/UserRegiterView.jsp'%>
	<%@ include  file='views/MessageModal.jsp'%>
	</body>
	<script type="text/javascript">
	$(document).ready(function(){
		
		$(document).keyup(function(event){
			  if(event.keyCode ==13){
			    $("#submit").trigger("click");
			  }
			});

		// 重置按钮
		$("#reset").click(function(){
			$("#username").val(null);
			$("#password").val(null);
		});
		
		// 登录提交按钮
		$("#submit").click(function()
			{	
				$.ajax({
		    		url:"/passport/login",
		    		data:{
		    			username:$("#username").val(),
		    			password:$("#password").val()
		    		},
		    		type:'get',
		    		dataType:'json',
		    		success:function(data){
		    			if(data.code ==99999){
		    				alertModalMessage("登录成功");
		    				location.href = '/timer/task/main';
		    			} else if(data.code == 20001){
		    				alertModalMessage("登录失败，您已被禁止登录，请联系管理员");
		    			} else if(data.code == 30001){
		    				alertModalMessage("登录失败，您所属组织已被封禁，请联系系统管理员");
		    			} else if(data.code == 505){
		    				alertModalMessage("服务器异常，登录失败，请联系管理员");
		    			} else {
		    				alertModalMessage("登录失败");
		    			}
		    		}
		    		});
				// ajax end;
		    });

		// 注册提交按钮
		$("#registerSubmit").click(function()
			{					
				var username= $("#username.register").val();
				var password= $("#password.register").val();
				var name= $("#name").val();
				var organization = $("#organization").val();
				var organizationCode= $("#organizationCode").val();
				var phone= $("#phone").val();
				var email = $("#email").val();

				if(isEmpty(username) || 
						isEmpty(password) || 
						isEmpty(name) || 
						isEmpty(organization) || 
						isEmpty(organizationCode) || 
						isEmpty(phone)){
					alertModalMessage("必填项不能为空，请检查");
				} else if(validateExist()&& checkOrgExist() && valideRepeatPassword() && validePhone()){
					$.ajax({
			    		url:"/passport/register",
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
			    				alertModalMessage("注册成功");
			    				dismiss();
			    			} else if(data.code == 505) {
			    				alertModalMessage("服务器发生异常，注册失败");
			    			} else {
			    				alertModalMessage("注册失败");
			    			}
			    		}
			    		});
					// ajax end;
				}
				
		    });
	});

</script>
</html>