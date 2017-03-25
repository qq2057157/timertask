<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
		<div class="list-group">
		  <a href="/timer/task/main" class="list-group-item task">
		    定时任务管理
		  </a>
	  	<c:choose>
			<c:when test="${sessionScope.userRole==1}">
		    	<a href="/timer/org/main" class="list-group-item org">组织管理</a>
		    </c:when>
		</c:choose>
	  	<c:choose>
	       <c:when test="${sessionScope.userRole==2 || sessionScope.userRole==1}">
	              <a href="/timer/user/main" class="list-group-item user">用户管理</a>
	       </c:when>
		</c:choose>
		</div>