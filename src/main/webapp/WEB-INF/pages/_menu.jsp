<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<%--  	<s:set name="logined" value="username"/> --%>
	<a href="${pageContext.request.contextPath}/">Home</a>
	 |
	<s:if test="%{(#logined != null) || (!#logined.equals(''))}">
		<a href="${pageContext.request.contextPath}/userInfo">Info</a>
	</s:if>
	
<%-- 	<a href="${pageContext.request.contextPath}/login">Login</a> --%>

<br>