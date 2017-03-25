<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

		<table class="table table-striped table-bordered table-hover table-condensed text-center">
			<tr><td>组织</td><td>姓名</td><td class="td-nowrap">用户名</td><td class="td-nowrap">用户角色</td><td class="td-nowrap">联系方式</td><td class="td-nowrap">邮箱</td><td class="td-nowrap">注册时间</td><td class="td-nowrap">用户状态</td>
			<td>操作
			<a id="addUserModal" class="btn btn-default btn-sm" href="javascript:void(0);" role="button">
			<span class="glyphicon glyphicon-plus" aria-hidden="true" ></span>新增用户</a></td></tr>
			<c:forEach  items="${userModels}" var="user">
			
				<tr>
					<td class="orgName">
						<small>${user.organization}</small>
					</td>
					<td>
						<small>${user.name}</small>
					</td>
					<td>
						<small>${user.username}</small>
					</td>
					<td>
						<small>
							<c:choose>
						       <c:when test="${user.role==4}">
						              普通用户
						       </c:when>
						       <c:when test="${user.role==2}">
						              组织管理员
						       </c:when>
						       <c:when test="${user.role==1}">
						              系统管理员
						       </c:when>
							</c:choose>
						</small>
					</td>
					<td>
						<small>${user.phone}</small>
					</td>
					<td>
						<small>${user.email}</small>
					</td>
					<td>
						<small>
				             <fmt:formatDate value="${user.createTime}" type="both" />
						</small>
					</td>
					<td>
						<input class = "status" type="hidden" value="${user.status}">
						<small>
							<c:choose>
						       <c:when test="${user.status==0}">
						       		封禁
						       </c:when>
						       <c:when test="${user.status==1}">
						       		正常
						       </c:when>
						       <c:otherwise>
						              
						       </c:otherwise>
							</c:choose>
						</small>
					</td>
					<td>
						<input class="id" type="hidden" value="${user.id}">
						<input class="role" type="hidden" value="${user.role}">
						<input class="organizationCode" type="hidden" value="${user.organizationCode}">
						<c:choose>
							<c:when test="${user.id!=sessionScope.userId}">
								<c:choose>
									<%-- 当此用户为非超级管理员所在组织的普通用户，且当前登录用户为超级用户时，才可以将非超级管理员所在组织的普通用户设置为管理员 --%>
									<c:when test="${user.role==4 && sessionScope.organizationCode != user.organizationCode && sessionScope.userRole == 1}">
										<button type="button"
											class="btn btn-default btn-xs setAdminRole"
											href="javascript:void(0);">设为管理员</button>
									</c:when>
								</c:choose>
								<c:choose>
									<c:when test="${user.status==0}">
										<button type="button" class="btn btn-default btn-xs enableUser"
											href="javascript:void(0);">解禁</button>
									</c:when>
									<c:otherwise>
										<button type="button" class="btn btn-default btn-xs disableUser"
											href="javascript:void(0);">封禁</button>
									</c:otherwise>
								</c:choose>
		
								<c:choose>
									<c:when test="${user.role==4}">
										<button type="button" class="btn btn-danger btn-xs deleteUser"
											href="javascript:void(0);">删除</button>
									</c:when>
								</c:choose>
							</c:when>
					    </c:choose>

					</td>
				</tr>
			</c:forEach>
		</table>
		<div class="row text-center">
		 <ul id='paginator' 	style="cursor:hand;"></ul>
		</div>