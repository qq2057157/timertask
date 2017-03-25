<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<!-- 用户注册弹出框 -->
		<div class="modal fade" id="registerModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header text-center">
						<button type="button" class="close close-btn"
							aria-label="Close">
							<span aria-hidden="true">&times;</span>
						</button>
						<h4 class="modal-title userRegTitle" id="myModalLabel">用户注册</h4>
					</div>
					<div class="modal-body">
						<div class="row">
							<br>
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-xs-5 control-label text-right">用户名</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea register" id="username"
											placeholder="用户名" value="">
									</div>
									<span class="text-center" style="color:red;">*</span>
									<span id="disable-icon" class="glyphicon glyphicon-remove alert-icon" style="color:red;display:none;">用户名已存在</span>
									<span id="ok-icon" class="text-center glyphicon glyphicon-ok alert-icon" style="color:green;display:none;"></span>
									<span id="alert-icon" class="text-center glyphicon glyphicon-alert alert-icon" style="color:red;display:none;">用户名为字母数字的组合</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">密码</label>
								<div class="col-xs-4">
									<input type="password" class="form-control inputArea register" id="password"
										placeholder="6位数以上密码">
								</div>
								<span class="text-center" style="color:red;">*</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">确认密码</label>
								<div class="col-xs-4">
									<input type="password" class="form-control inputArea"
										id="repeatPassword" placeholder="确认密码">
								</div>
								<span class="text-center" style="color:red;">*</span>
								<span id="repw-icon" class="text-center glyphicon glyphicon-alert alert-icon" style="color:red;display:none;">两次输入的密<br>码不一致</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">姓名</label>
								<div class="col-xs-4">
									<input type="text" class="form-control inputArea"
										id="name" placeholder="姓名">
								</div>
								<span class="text-center" style="color:red;">*</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">组织名称</label>
								<div class="col-xs-4">
									<input type="text" class="form-control inputArea organization orgCheck"
										id="organization" placeholder="组织名称">
								</div>
								<span class="text-center" style="color:red;">*</span>
								<span id="org-warn-icon" class="glyphicon glyphicon-remove alert-icon" style="color:red;display:none;"></span>
								<span id="org-ok-icon" class="text-center glyphicon glyphicon-ok alert-icon" style="color:green;display:none;"></span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">组织代码</label>
								<div class="col-xs-4">
									<input type="text" class="form-control inputArea organizationCode orgCheck"
										id="organizationCode" placeholder="组织代码" maxlength="10" onpaste="return false;" 
										onkeyup="value=value.replace(/[^\d]/g,'') "
										onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
								</div>
								<span class="text-center" style="color:red;">*</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">手机号</label>
								<div class="col-xs-4">
									<input type="text" class="form-control inputArea"
										id="phone" placeholder="手机号" maxlength="11" onpaste="return false;" 
										onkeyup="value=value.replace(/[^\d]/g,'') "
										onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
								</div>
								<span class="text-center" style="color:red;">*</span>
								<span id="phone-icon" class="text-center glyphicon glyphicon-alert alert-icon" style="color:red;display:none;">手机号格式错误</span>
							</div>
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">邮箱</label>
								<div class="col-xs-4">
									<input type="text" class="form-control inputArea"
										id="email" placeholder="example@163.com">
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="modal-footer">
				<div class="text-center">
					<button type="button" class="btn btn-default close-btn">取消</button>
					<button id="registerSubmit" type="button" class="btn btn-primary">确定</button>
				</div>
				</div>
			</div>
		</div>
	</div>