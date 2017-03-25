<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 修改密码弹出框 -->
	<div class="modal fade" id="modifyModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close close-btn" 
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改用户密码</h4>
				</div>
				<div class="modal-body">
					<div class="row">
						<br>
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-xs-5 control-label text-right">原密码*</label>
								<div class="col-xs-4">
									<input type="password" class="form-control inputArea" id="password"
										placeholder="oldPassword">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword"
									class="col-xs-5 control-label text-right">新密码*</label>
								<div class="col-xs-4">
									<input type="password" class="form-control inputArea" id="newPassword"
										placeholder="newPassword">
								</div>
							</div>
							<div class="form-group">
								<label for="inputPassword"
									class="col-xs-5 control-label text-right">确认新密码*</label>
								<div class="col-xs-4">
									<input type="password" class="form-control inputArea"
										id="repeatNewPassword" placeholder="repeatNewPassword">
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default close-btn">取消</button>
					<button id="modifySubmit" type="button" class="btn btn-primary">确定</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 修改密码弹出框end -->