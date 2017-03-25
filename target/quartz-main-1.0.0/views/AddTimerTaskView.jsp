<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<!-- 添加定时任务弹出框start -->
	<div class="modal fade" id="addTaskModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close close-btn" 
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">添加定时任务</h4>
				</div>
				<div class="modal-body">
					<div>
						<!-- Nav tabs -->
						<ul id="myTabs" class="nav nav-tabs" role="tablist">
							<li role="presentation" class="active"><a href="#simple"
								role="tab" data-toggle="tab">simple类型任务</a></li>
							<li role="presentation"><a href="#cron" role="tab"
								data-toggle="tab">cron类型任务</a></li>
						</ul>
						<div class="row">
							<br>
							<form class="form-horizontal">
								<div class="form-group">
									<label class="col-xs-5 control-label text-right">任务名称</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="jobName" placeholder="jobName">
									</div>
									<span class="text-center" style="color:red;">*</span>
								</div>
								
								<div class="form-group">
									<label for="inputPassword"
										class="col-xs-5 control-label text-right">触发器名称</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="triggerName" placeholder="triggerName">
									</div>
									<span class="text-center" style="color:red;">*</span>
								</div>
								<div class="form-group">
									<label for="inputPassword"
										class="col-xs-5 control-label text-right">任务目标URL</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="targetUrl" placeholder="http://www.hust.edu.cn">
									</div>
									<span class="text-center" style="color:red;">*</span>
									<span id="urldisable-icon" class="glyphicon glyphicon-remove alert-icon" style="color:red;display:none;">URL格式不正确</span>
									<span id="urlok-icon" class="text-center glyphicon glyphicon-ok alert-icon" style="color:green;display:none;"></span>
								</div>
								<div class="form-group">
									<label for="inputPassword"
										class="col-xs-5 control-label text-right">目标URL参数列表</label>
									<div class="col-xs-4">
										<input type="text" class="form-control inputArea"
											id="parameters" placeholder='{"key":"value","key":"value"}'>
									</div>
								</div>
								<!-- Tab panes -->
								<div class="tab-content">
									<div role="tabpanel" class="tab-pane active" id="simple">
										<div class="form-group">
											<label for="inputPassword"
												class="col-xs-5 control-label text-right">开始时间</label>
											<div class="col-xs-4 ">
												<input type="text" class="form-control inputArea"
													id="startTime" placeholder="yyyy-MM-dd hh:mm:ss" data-date-format="yyyy-mm-dd hh:ii:ss" >
											</div>
											<span class="text-center" style="color:red;">*</span>
										</div>
										<div class="form-group">
											<label for="inputPassword"
												class="col-xs-5 control-label text-right">结束时间</label>
											<div class="col-xs-4">
												<input type="text" class="form-control inputArea"
													id="endTime" placeholder="yyyy-MM-dd hh:mm:ss" data-date-format="yyyy-mm-dd hh:ii:ss" >
											</div>
											<span class="text-center endTimeWarn glyphicon glyphicon-alert alert-icon" style="color:red;display:none"><small>若设置开始时间，<br>则执行次数的设置无效！</small></span>
										</div>
										<div class="form-group">
											<label for="inputPassword"
												class="col-xs-5 control-label text-right">执行次数</label>
											<div class="col-xs-4">
												<input type="text" class="form-control inputArea"
													id="repeatCount" placeholder="repeatCount" 
													maxlength="5" onpaste="return false;" 
													onkeyup="value=value.replace(/[^\d]/g,'') "
													onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
											</div>
											<span class="text-center repeatCountWarn glyphicon glyphicon-alert alert-icon" style="color:red;display:none"><small>若已设置开始时间，<br>执行次数的设置无效！</small></span>
											
										</div>
										<div class="form-group">
											<label for="inputPassword"
												class="col-xs-5 control-label text-right">执行间隔(s)</label>
											<div class="col-xs-4">
												<input type="text" class="form-control inputArea"
													id="repeatInterval" placeholder="repeatInterval"
													maxlength="10" onpaste="return false;" 
													onkeyup="value=value.replace(/[^\d]/g,'') "
													onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
											</div>
											<span class="text-center" style="color:red;">*</span>
										</div>
									</div>
									<!-- 简单类型定时任务end -->
									<div role="tabpanel" class="tab-pane" id="cron">
										<div class="form-group">
											<label for="inputPassword"
												class="col-xs-5 control-label text-right">cron表达式</label>
											<div class="col-xs-4">
												<input type="text" class="form-control inputArea"
													id="cronExpress" placeholder="cronExpress">
											</div>
											<span class="text-center" style="color:red;">*</span>
										</div>
										<div class="form-group">
											<div class="col-xs-12 text-center">点击了解：<a href="CronHelp.jsp" target="_Blank"><small>Cron表达式详解</small></a>，<small>在线生成cron表达式:<a href="http://www.cronmaker.com/" target="_Blank">CronMaker</a> or <a href="http://cron.qqe2.com/" target="_Blank">cron.qqe2</a></small></div>
										</div>
									</div>
									<!-- cron类型定时任务end -->
								</div>
								<input type="hidden" id="triggerType" class="form-control inputArea" value="0">
							</form>
						</div>
					</div>
				</div>
				<!-- modalbody end -->
				<div class="modal-footer">
					<button type="button" class="btn btn-default close-btn">取消</button>
					<button id="addTaskButton" type="button" class="btn btn-primary">确定</button>
				</div>
			</div>
		</div>
	</div>
	<!-- 添加定时任务弹出框end -->