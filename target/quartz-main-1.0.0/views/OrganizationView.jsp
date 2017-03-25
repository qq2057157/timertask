<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<table class="table table-striped table-bordered table-hover table-condensed text-center">
			<tr><td>组织名称</td><td class="td-nowrap">组织代码</td><td class="td-nowrap">创建时间</td><td class="td-nowrap">管理员账号</td><td class="td-nowrap">管理员姓名</td><td class="td-nowrap">联系方式</td><td class="td-nowrap">组织状态</td>
			<td>操作
			<a id="publishTask" class="btn btn-default btn-sm" data-toggle="modal" data-target="#addOrgModal" role="button">
			<span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>新增组织</a></td></tr>
			<c:forEach  items="${orgModels}" var="org">
			
				<tr>
					<td class="orgName">
						<small>${org.organization}</small>
					</td>
					<td class="orgCode">
						<small>${org.organizationCode}</small>
					</td>
					<td>
						<small>
				             <fmt:formatDate value="${org.createTime}" type="both" />
						</small>
					</td>
					<td>
						<small>${org.adminUsername}</small>
					</td>
					<td>
						<small>${org.adminName}</small>
					</td>
					<td>
						<small>${org.adminPhone}</small>
					</td>
					<td>
						<input class = "status" type="hidden" value="${org.status}">
						<small>
							<c:choose>
						       <c:when test="${org.status==4}">
						              封禁
						       </c:when>
						       <c:when test="${org.status==0}">
						              未启用
						       </c:when>
						       <c:otherwise>
						              正常
						       </c:otherwise>
							</c:choose>
						</small>
					</td>
					<td>
						<input class="id" type="hidden" value="${org.id}">
						<input class="adminId" type="hidden" value="${org.administratorId}">
						<c:choose>
							<c:when test="${org.organizationCode !=sessionScope.organizationCode}">
								<c:choose>
									<c:when test="${org.status==0}">
										<button type="button" class="btn btn-default btn-xs setAdmin" href="javascript:void(0);">添加管理员</button>
							      	</c:when>
									<c:when test="${org.status==4}">
										<button type="button" class="btn btn-default btn-xs enableOrg" href="javascript:void(0);">解禁</button>
									</c:when>
									<c:otherwise>
										<button type="button" class="btn btn-default btn-xs disableOrg" href="javascript:void(0);">封禁</button>
									</c:otherwise>
								</c:choose>
								<button type="button" class="btn btn-danger btn-xs deleteOrg" href="javascript:void(0);">删除</button>
							</c:when>
						</c:choose>
					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="row text-center">
		 <ul id='paginator' 	style="cursor:hand;"></ul>
		</div>