$(document).ready(function(){
	$(document).on("click",".refresh-btn",function(){
		location.reload();
	});
	
	$(document).on("change",".orgCheck",function(){
		checkOrgExist();
	});
	// 验证用户名是否有效
	$("#username.register").change(function(){
		validateExist();
	});

	// 验证确认密码是否有效
	$("#repeatPassword").change(function(){
		valideRepeatPassword();
	});
	
	// 验证手机号是否有效
	$("#phone").change(function(){
		validePhone();
	});
});