<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 添加组织弹出框start -->
	<div class="modal fade" id="addOrgModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close close-btn" 
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">新增组织</h4>
				</div>
				<div class="modal-body">
						<div class="row">
							<br>
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-xs-5 control-label text-right">组织名称</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="organization" placeholder="organization" maxlength="20">
									</div>
									<span class="text-center" style="color:red;">*</span>
								</div>
								
								<div class="form-group">
									<label for="inputPassword"
										class="col-xs-5 control-label text-right">组织代码</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="organizationCode" placeholder="organizationCode" maxlength="10" onpaste="return false;" 
											onkeyup="value=value.replace(/[^\d]/g,'')"
											onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
									</div>
									<span class="text-center" style="color:red;">*</span>
									<span id="organizationCodeWarn" class="text-center" style="color:red;display:none"><small>组织代码必须为纯数字</small></span>
								</div>
							</form>
						</div>
					</div>
				<!-- modalbody end -->
				<div class="modal-footer">
					<button type="button" class="btn btn-default close-btn">取消</button>
					<button id="addOrgButton" type="button" class="btn btn-primary">确定</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 添加定时任务弹出框end -->