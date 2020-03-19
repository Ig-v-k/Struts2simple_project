<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--@elvariable id="logined_registeredUSER" type="java.lang.Boolean"--%>

	<fmt:setBundle basename="ApplicationResources"/>
    <%--<s:set name="logined" value="username"/> --%>
	<a href="${pageContext.request.contextPath}/hello">Home</a>
	 |
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
	<br>
<br>