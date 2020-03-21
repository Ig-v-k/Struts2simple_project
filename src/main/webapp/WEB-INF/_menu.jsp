<%@ include file="/WEB-INF/base.jsp"%>
<%--@elvariable id="logined_registeredUSER" type="java.lang.Boolean"--%>
<%--@elvariable id="labelLogined_Registered" type="java.lang.Boolean"--%>

	<fmt:setBundle basename="ApplicationResources"/>
    <%--<s:set name="logined" value="username"/> --%>
	<a href="${pageContext.request.contextPath}/hello">Home</a>
	<c:if test="${labelLogined_Register}">
		<c:if test="${!logined_registeredUSER}">
			 |
			<a href="${pageContext.request.contextPath}/login_GET"><fmt:message key="label.login"/></a>
		 	 |
			<a href="${pageContext.request.contextPath}/register_GET"><fmt:message key="label.register"/></a> 
		</c:if>
		<c:if test="${logined_registeredUSER}">
			 |
			<a href="${pageContext.request.contextPath}/logout">Logout</a>
		 	 |
			<a href="${pageContext.request.contextPath}/profile"><fmt:message key="label.profile"/></a>	
		</c:if>
	</c:if>
	<br>
<br>