<%@ page language="java" contentType="text/html; charset=Ù-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>

<fmt:setBundle basename="ApplicationResources"/>

<html>
<head>
<title>Struts 2 - Hello World</title>
</head>
 
<body>
 	<div align="center">
 		<jsp:include page="_menu.jsp" />
    	<h2>Hey, please to <fmt:message key="label.login"/> or <fmt:message key="label.register"/> in the service!</h2>
    </div>	
 
</body>
 
</html>