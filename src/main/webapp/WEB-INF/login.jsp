<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--@elvariable id="db" type="java.util.Map<String, com.struts2.beans.Users>"--%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Struts 2 - Login Application</title>
</head>
 
<body>
 	<div align="center">
 	    <jsp:include page="_menu.jsp" />
 
 
	    <h2>Struts 2 - Login Application</h2>
	    <s:actionerror />
	 
	    <s:form action="login" method="post">
	        <s:textfield name="username" key="label.username" size="20" />
	        <s:password name="password" key="label.password" size="20" />
	        <s:submit method="execute" key="label.submit" align="center" />
	    </s:form>
	     
	    <br>
	    Username | Password<br>
	    admin      admin<br>
	    user       user
	    <br>
	    
 	</div>

 
</body>
 
</html>