<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="headCardsContent" fragment="true" required="false" %>
<%-- <%@ attribute name="extraNavigationContent" fragment="true" required="false" %> --%>
<%@ attribute name="implInstrumentContent" fragment="true" required="false" %>
<%@ attribute name="implCardsContent" fragment="true" required="false" %>
<%@ attribute name="implHomeContent" fragment="true" required="false" %>

<%@ include file="/WEB-INF/base.jspf" %>

<template:maiN htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">

    <jsp:attribute name="headContent">
    	<jsp:invoke fragment="headCardsContent" />
    </jsp:attribute>

    <jsp:attribute name="navigationContent">
   		<a href="${pageContext.request.contextPath}/hello">Home</a>
		<c:if test="${labelLogin_Register}">
			<c:if test="${!logined_registeredUSER}">Missing required attribute "menuInstrument"
				 |
				<a href="${pageContext.request.contextPath}/login_GET"><fmt:message key="label.login"/></a>
			 	 |
				<a href="${pageContext.request.contextPath}/register_GET"><fmt:message key="label.register"/></a> 
			</c:if>
			<c:if test="${logined_registeredUSER}">
				 |
				<a href="${pageContext.request.contextPath}/logout"><fmt:message key="label.logout"/></a>
			 	 |
				<a href="${pageContext.request.contextPath}/profile/"><fmt:message key="label.profile"/></a>	
			</c:if>
		</c:if>
<%--         <jsp:invoke fragment="extraNavigationContent"/> --%>
		<c:if test="${menuInstruments}">
			<br>
			<hr>
			<div align="center">
				<a href="${pageContext.request.contextPath}/#">TRANSFERS</a>&emsp;
				<a href="<c:url value="profile">
							<c:param name="actionMenu" value="cards"/>
						 </c:url>">CARDS</a>&emsp;
				<a href="${pageContext.request.contextPath}/#">CREDITS</a>&emsp;
				<a href="${pageContext.request.contextPath}/#">SERVICES</a>&emsp;
				<a href="${pageContext.request.contextPath}/#">CONTACTS</a>
			</div>
		</c:if>
    </jsp:attribute>

	<jsp:attribute name="homeContent">
		<c:if test="${menuInstruments}">
			<br>
			<hr>
			<jsp:invoke fragment="implHomeContent"/>
		</c:if>
	</jsp:attribute>

    <jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:maiN>

