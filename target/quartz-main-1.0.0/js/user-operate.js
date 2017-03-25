$(document).ready(function(){
	
	$(".close-btn").click(function(){
		dismiss();
	});
	
	$(document).on("click",".closeMessage",function(){
		$("#dialogModal").modal('hide');
	});
	
	$("#modifySubmit").click(function()
			{	var repeatNewPassword = $("#repeatNewPassword").val();
				var newPassword = $("#newPassword").val();
				//alert(repeatNewPassword);
				//alert(newPassword);
				if(repeatNewPassword!=newPassword){
					alertModalMessage("两次输入的新密码不一致，请重新输入！");
				} else {
					$.ajax({
			    		url:"/timer/user/modifypassword",
			    		data:{
			    			password:$("#password").val(),
			    			newPassword:$("#newPassword").val()
			    		},
			    		type:'get',
			    		dataType:'json',
			    		success:function(data){
			    			if(data.code==99999){
			    				alertModalMessage("修改成功");
			    			} else if(data.code==10001){
			    				alertModalMessage("修改失败,请登录");
			    				location.reload();
			    			} else if(data.code==10002){
			    				alertModalMessage("修改失败,密码错误");
			    			} else {
			    				alertModalMessage("修改失败");
			    			}
			    		}
			    		});
				} 
				
		    });
	
	$("#logout").click(function()
			{
			$.ajax({
	    		url:"/passport/logout",
	    		dataType:'json',
	    		success:function(data){
	    			if(data.code==99999){
	    				alertModalMessage("退出成功！");
	    			}
	    			location.reload();
	    		},
	    		error:function(XMLHttpRequest, textStatus, errorThrown){
	    			if(textStatus=="error"){
	    				alertModalMessage("服务器异常，登出发生错误，请刷新页面！");
	    				
	    			}
	    		}
	    		});
		    });
});