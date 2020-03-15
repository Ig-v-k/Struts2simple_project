<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<html>
<head>
<title>Profile</title>
</head>
  
<body>
	<div align="center">
		<jsp:include page="_menu.jsp" />
	    <h2>Profile, ${session.loginedUSER}!</h2>
	</div>
</body>
</html>