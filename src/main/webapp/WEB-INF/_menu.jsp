<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<%--  	<s:set name="logined" value="username"/> --%>
	<a href="${pageContext.request.contextPath}/hello">Home</a>
	 |	
	<a href="${pageContext.request.contextPath}/login_GET">Login</a>
	 |
	<a href="${pageContext.request.contextPath}/register_GET">Register</a> 
	 |	
	<a href="${pageContext.request.contextPath}/logout">Logout</a>
	<br>
	<s:date name="#session.dateTime"/>
	 
<br>