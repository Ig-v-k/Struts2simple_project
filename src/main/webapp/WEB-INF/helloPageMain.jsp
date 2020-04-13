<template:implMain htmlTitle="Hello" bodyTitle="Hello">
 	<div align="center">
 		<c:if test="${labelLogin_Register}">
 			<h2> Welcome you, to our service, 
 			here you will find many interesting tools for using our platform >> <a href='<c:url value="/profile_GET"/>'><fmt:message key="label.profile"/></a></h2>
 		</c:if>
 		<c:if test="${!labelLogin_Register}">
 			<h2>Welcome, this service that provides banking services.
	 		For more information, please 
	 		<a href='<c:url value="/login"/>'><fmt:message key="label.login"/></a> 
	 		or <a href='<c:url value="/register"/>'><fmt:message key="label.register"/></a>!</h2>
 		</c:if>
    </div>	
</template:implMain>