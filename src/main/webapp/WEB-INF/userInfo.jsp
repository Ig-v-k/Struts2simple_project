<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<html>
<head>
<title>User Info</title>
</head>
  
<body>
	<div align="center">
		<jsp:include page="_menu.jsp" />
	    <h2>Hello, ${USER.getUsername()}...!</h2>
    	<h3><s:property value="username"/></h3>
	</div>
</body>
</html>