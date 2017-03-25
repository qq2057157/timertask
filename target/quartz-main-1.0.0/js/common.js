	function isEmpty(value){
		return(value=='' || value==undefined || value==null);
	}

	//提示弹窗
	function alertModalMessage(message){
		$('#dialogModal').modal('show');
		$('#message').html(message);
	};

	function dismiss(){
		$('.modal').modal('hide');
		$(".inputArea").val(null);
		hide(".alert-icon");
		
    };
	// 显示id的元素
	function show(id){
    	$(id).css("display","inline");
    }
	// 隐藏id的元素
    function hide(id){
    	$(id).css("display","none");
    }
    function keyPress() {    
        var keyCode = event.keyCode;    
        if ((keyCode >= 48 && keyCode <= 57))    
       {    
            event.returnValue = true;    
        } else {    
              event.returnValue = false;    
       }    
    }  
    
    function checkOrgExist(){
		var orgName = $("#organization.orgCheck").val();
		var orgCode = $("#organizationCode.orgCheck").val();
		if($("#organization.orgCheck").attr("readonly")!="readonly" && !isEmpty(orgName) && !isEmpty(orgCode)){
			$.ajax({
	    		url:"/passport/checkOrgExist",
	    		data:{
	    			organization:orgName,
	    			organizationCode:orgCode
	    		},
	    		type:'get',
	    		dataType:'json',
	    		success:function(data){
	    			if(data.code ==99999){
	    				hide("#org-warn-icon");
	    				show("#org-ok-icon");
	    				return true;
	    			} else if(data.code==30001){
	    				show("#org-warn-icon");
	    				hide("#org-ok-icon");
	    				alertModalMessage("组织被封禁，无法注册");
	    				return false;
	    			} else if(data.code==505){
	    				alertModalMessage("验证组织信息是否存在时发生错误，请联系管理员");
	    				return false;
	    			} else {
	    				show("#org-warn-icon");
	    				hide("#org-ok-icon");
	    				alertModalMessage("您输入的组织信息错误，无法注册");
	    				return false;
	    			}
	    		}
	    		});
		}
	}
    function validateExist(){
		var username = $("#username.register").val();
		var Regx = /^[A-Za-z0-9]*$/;
		if(!Regx.test(username)){				
			show("#alert-icon");
			hide("#disable-icon");
			hide("#ok-icon");
			return false;
		} else {
			// ajax start
			$.ajax({
	    		url:"/passport/validateExist",
	    		data:{
	    			username:username
	    		},
	    		type:'get',
	    		dataType:'json',
	    		success:function(data){
	    			if(data.code ==99999){
	    				hide("#alert-icon");
	    				hide("#disable-icon");
	    				show("#ok-icon");
	    				return true;
	    			} else {
	    				hide("#alert-icon");
	    				show("#disable-icon");
	    				hide("#ok-icon");
	    				return false;
	    			}
	    		}
	    		});
				// ajax end
		}
		
	}
    
    function valideRepeatPassword(){
    	var password = $("#password.register").val();
		var repeatPassword = $("#repeatPassword").val();
			if(password==repeatPassword){
				hide("#repw-icon");
				return true;
			} else {
				show("#repw-icon");
				return false;
			}
    }
    
    function validePhone(){
    	var phoneReg= /^1\d{10}$/;
		var phone = $("#phone").val();
		if(phoneReg.test(phone)){
			hide("#phone-icon");
			return true;
		} else {
			show("#phone-icon");
			return false;
		}
    }