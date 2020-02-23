<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:set name="logined" value="username"/>

<html>
<head>
<title>Struts 2 - Hello World</title>
</head>
 
<body>
 	<div align="center">
 		<jsp:include page="_menu.jsp" />
    	<h2>You must be Autorization! --> <s:if test="%{(logined == null) || logined.equals('')}"><a href="${pageContext.request.contextPath}/login">Login</a></s:if></h2>
    </div>	
 
</body>
 
</html>