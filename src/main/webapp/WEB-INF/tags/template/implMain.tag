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
    	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="${pageContext.request.contextPath}/hello"><fmt:message key="label.home"/></a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		  	<ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="${pageContext.request.contextPath}/hello"><fmt:message key="label.home"/> <span class="sr-only">(current)</span></a>
		      </li>
		      <c:if test="${labelLogin_Register}">
		    		<c:if test="${!logined_registeredUSER}">		      
					      <li class="nav-item">
					        <a class="nav-link" href="${pageContext.request.contextPath}/login_GET"><fmt:message key="label.login"/></a>
					      </li>
					      <li class="nav-item">
					        <a class="nav-link" href="${pageContext.request.contextPath}/register_GET"><fmt:message key="label.register"/></a>
					      </li>
					</c:if>
					<c:if test="${logined_registeredUSER}">
					      <li class="nav-item">
					        <a class="nav-link" href="${pageContext.request.contextPath}/logout"><fmt:message key="label.logout"/></a>
					      </li>		      		      
					      <li class="nav-item">
					        <a class="nav-link" href="${pageContext.request.contextPath}/profile/"><fmt:message key="label.profile"/></a>
					      </li>
					</c:if>
			  </c:if>
		      <li class="nav-item dropdown">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          Dropdown
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="#">Action</a>
		          <a class="dropdown-item" href="#">Another action</a>
		          <div class="dropdown-divider"></div>
		          <a class="dropdown-item" href="#">Something else here</a>
		        </div>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
		      </li>
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
		    </form>
		  </div>
		</nav>
    
   		<a href="${pageContext.request.contextPath}/hello"><fmt:message key="label.home"/></a>
		<c:if test="${labelLogin_Register}">
			<c:if test="${!logined_registeredUSER}">
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
				<a href="<c:url value="profile">
							<c:param name="actionMenu" value="transfers"/>
						 </c:url>">TRANSFERS</a>&emsp;
				<a href="<c:url value="profile">
							<c:param name="actionMenu" value="cards"/>
						 </c:url>">CARDS</a>&emsp;
				<a href="<c:url value="profile">
							<c:param name="actionMenu" value="credits"/>
						 </c:url>">CREDITS</a>&emsp;
				<a href="<c:url value="profile">
							<c:param name="actionMenu" value="settings"/>
						 </c:url>">SETTINGS</a>&emsp;
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

