<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<table class="table table-striped table-bordered table-hover table-condensed text-center">
			<tr><td>任务名称</td><td class="td-nowrap">触发器<br>类型</td><td class="td-nowrap">创建<br>时间</td><td class="td-nowrap">开始<br>时间</td><td class="td-nowrap">结束<br>时间</td><td class="td-nowrap">重复<br>次数</td><td class="td-nowrap">间隔<br>时间</td><td class="td-nowrap">cron表达式</td><td class="td-nowrap">创建人</td><td>目标URL</td><td class="td-nowrap">任务状态</td><td>操作
			<a id="publishTask" class="btn btn-default btn-sm" data-toggle="modal" data-target="#addTaskModal" role="button">
			<span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>创建任务</a></td></tr>
			<c:forEach  items="${timerTasks}" var="task">
			
				<tr>
					<td>
						<small>${task.jobName}</small>
					</td>
					<td>
						<small>
							<c:choose>
						       <c:when test="${task.triggerType==0}">
						              simple
						       </c:when>
						       <c:otherwise>
						              cron
						       </c:otherwise>
							</c:choose>
						</small>
					</td>
					<td>
						<small>
							<fmt:formatDate value="${task.createTime}" type="both" />
						</small>
					</td>
					<td>
						<small>
							<c:choose>
						       <c:when test="${task.triggerType==0}">
						             <fmt:formatDate value="${task.startTime}" type="both" />
						       </c:when>
							</c:choose>
						</small>
					</td>
					<td>
						<small>
							<c:choose>
						       <c:when test="${task.triggerType==0}">
						              <fmt:formatDate value="${task.endTime}" type="both" />
						       </c:when>
							</c:choose>
						</small>
					</td>
					<td>
						<c:choose>
						       <c:when test="${task.triggerType==0 && task.endTime==null}">
						              <small>${task.repeatCount}</small>
						       </c:when>
							</c:choose>
						
					</td>
					<td>
						<small>
							<c:choose>
						       <c:when test="${task.triggerType==0}">
						              ${task.repeatInterval}s
						       </c:when>
							</c:choose>
						</small>
					</td>
					<td>
						<small>${task.cronExpress}</small>
					</td>
					<td>
						<small>${task.name}</small>
					</td>
					<td>
						<small>${task.targetUrl}</small>
					</td>
					<td>
						<input class = "status" type="hidden" value="${task.status}">
						<small>
							<c:choose>
						       <c:when test="${task.status==0}">
						              未发布
						       </c:when>
						       <c:when test="${task.status==1}">
						              运行中
						       </c:when>
						       <c:otherwise>
						              已终止
						       </c:otherwise>
							</c:choose>
						</small>
					</td>
					<td>
						<input class="id" type="hidden" value="${task.id}">
						<c:choose>
					       <c:when test="${task.status==0}">
								<button type="button" class="btn btn-default btn-xs taskStart" href="javascript:void(0);">启动</button>
					       </c:when>
					       <c:when test="${task.status==1}">
					            <button type="button" class="btn btn-default btn-xs taskStop" href="javascript:void(0);">终止</button>
					       </c:when>
					      </c:choose>
					      <c:choose>
					       <c:when test="${task.status!=1}">
 								<button type="button" class="btn btn-danger btn-xs taskDelete" href="javascript:void(0);">删除</button>
					       </c:when>
					      </c:choose>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="row text-center">
		 <ul id='paginator' 	style="cursor:hand;"></ul>
		</div>