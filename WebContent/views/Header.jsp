<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="row">
	<div id="presentuser" class="dropdown col-xs-2 col-md-offset-10 ">
			<strong> 当前用户:</strong><a class="btn dropdown-toggle glyphicon glyphicon-user" type="button" id="dropdownMenu1"
				data-toggle="dropdown" aria-expanded="true"><strong> ${sessionScope.userName}</strong><span
				class="caret"></span>
				<input id="presentUserId" type="hidden" value="${sessionScope.userId}">
				<input id="userOrgName" type="hidden" value="${sessionScope.organization}">
				<input id="userOrgCode" type="hidden" value="${sessionScope.organizationCode}">
			</a>
			<ul class="dropdown-menu" role="menu"
				aria-labelledby="dropdownMenu1">
				<li role="presentation"><a role="menuitem" tabindex="-1"
					data-toggle="modal" data-target="#modifyModal"
					href="javascript:void(0);">修改密码</a></li>
				<li role="separator" class="divider"></li>
				<li role="presentation"><a id="logout" role="menuitem"
					tabindex="-1" href="javascript:void(0);">退出</a></li>
			</ul>
		</div>
	</div>
	<div class="page-header">
		<h1>
			<span class="glyphicon glyphicon-home" aria-hidden="true"></span>&nbsp;定时服务管理系统
		</h1>
	</div>