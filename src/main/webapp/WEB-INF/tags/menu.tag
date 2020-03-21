<%--@elvariable id="username" type="java.lang.String"--%>
<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="extraHeadContent" fragment="true" required="false" %>
<%@ attribute name="extraNavigationContent" fragment="true" required="false" %>
<%@ include file="/WEB-INF/base.jsp" %>

<iwTag:main htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">
    <jsp:attribute name="headContent">
        <jsp:invoke fragment="extraHeadContent" />
    </jsp:attribute>

    <jsp:attribute name="navigationContent">
   		<a href="${pageContext.request.contextPath}/hello">Home</a>
		 |
		<c:if test="${labelLogined_Register}">
			<c:if test="${!logined_registeredUSER}">
				<a href="${pageContext.request.contextPath}/login_GET"><fmt:message key="label.login"/></a>
			 	 |
				<a href="${pageContext.request.contextPath}/register_GET"><fmt:message key="label.register"/></a> 
			</c:if>
			<c:if test="${logined_registeredUSER}">
				<a href="${pageContext.request.contextPath}/logout">Logout</a>
			 	 |
				<a href="${pageContext.request.contextPath}/profile">Profile</a>	
			</c:if>
		</c:if>
        <jsp:invoke fragment="extraNavigationContent" />
    </jsp:attribute>

    <jsp:body>
        <jsp:doBody/>
    </jsp:body>
</iwTag:main>