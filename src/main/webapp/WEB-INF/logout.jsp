<%@ include file="/WEB-INF/base.jsp"%>
 
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