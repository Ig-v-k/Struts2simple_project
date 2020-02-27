<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
 
<html>
<head>
<title>User Logout</title>
</head>
  
<body>
	<div align="center">
		<jsp:include page="_menu.jsp" />
	    <h2>Good bye, <s:property value="username"/>!</h2>
	</div>
</body>
</html>