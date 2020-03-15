<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

    <%--<s:set name="logined" value="username"/> --%>
	<a href="${pageContext.request.contextPath}/hello">Home</a>
	 |
	<s:if test="%{!#session.loginedUSER || !#session.registeredUSER}">
		<a href="${pageContext.request.contextPath}/login_GET">Login</a>
	 	 |
		<a href="${pageContext.request.contextPath}/register_GET">Register</a> 
	</s:if>
	 |
	<s:if test="%{#session.loginedUSER}">
		<a href="${pageContext.request.contextPath}/logout">Logout</a>
	 	 |
		<a href="${pageContext.request.contextPath}/profile">Profile</a> 	
	</s:if>
	<br>
	<s:date name="session.dateTime"/>
	 
<br>