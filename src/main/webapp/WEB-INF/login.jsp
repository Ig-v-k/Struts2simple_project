<%--@elvariable id="db" type="java.util.Map<String, com.struts2.beans.User>"--%>

<template:implMain htmlTitle="Login" bodyTitle="Login">
 	<div align="center">
<%--  	    <jsp:include page="_menu.jsp" /> --%>
	    <h2>Struts 2 - Login Application</h2>
	    <s:actionerror />
	 	<hr>
	    <s:form action="login_POST" method="post">
	        <s:textfield name="username" key="label.username" size="20" />
	        <s:password name="password" key="label.password" size="20" />
	        <s:submit method="execute" key="label.login" align="center" />
	        <input type="radio" name="role" value="admin">
			<label for="male">Admin</label><br>
			<input type="radio" name="role" value="employee">
			<label for="female">Employee</label><br>
			<input type="radio" name="role" value="user">
			<label for="other">User</label>
	    </s:form>
	    <hr>
	    <br>
<%-- 	    Login: &emsp; Password:
		<c:forEach items="${db}" var="i">
        	<p>${i.key} &nbsp; - &nbsp; ${i.value.password}</p>
        </c:forEach> 
--%>
	</div>
	    
</template:implMain>