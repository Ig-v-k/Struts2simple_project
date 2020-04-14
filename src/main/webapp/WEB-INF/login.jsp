<%--@elvariable id="db" type="java.util.Map<String, com.struts2.beans.User>"--%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="iw" uri="http://www.iw.com/jsp/tld/iw" %>
<fmt:setBundle basename="ApplicationResources"/>

<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>

<template:implLogin htmlTitle="Login" bodyTitle="Login">
	
 	<div align="center">
<%--  	    <jsp:include page="_menu.jsp" /> 
	    <h2>Struts 2 - Login Application</h2>--%>
	    
	    <s:if test="hasFieldErrors()">
		    <div class="alert alert-danger" role="alert">
				<s:fielderror fieldName="error_field_head"/>
			</div>
			<hr>
		</s:if>
	    <h2><s:property value="#var_field_error"/></h2>
<%-- 	    <s:form action="login_POST" method="post">
	        <s:textfield name="username" key="label.username" size="20" />
	        <s:password name="password" key="label.password" size="20" />
	        <s:submit method="execute" key="label.login" align="center" />
	        <input type="radio" name="role" value="admin">
			<label for="male">Admin</label><br>
			<input type="radio" name="role" value="employee">
			<label for="female">Employee</label><br>
			<input type="radio" name="role" value="user">
			<label for="other">User</label>
	    </s:form> --%>
	    <form id="form_login" class="card card-block bg-faded" action="loginPost" method="post">
			<legend class="m-b-1 text-xs-center">Sign up</legend>
			<div class="form-group input-group" align="center">
			  <label class="has-float-label">
			    <span><fmt:message key="label.username"/></span>
			  	<input name="username" class="form-control"/>
			  </label>
			</div>
			<div class="form-group has-float-label" align="center">
				<label for="password"><fmt:message key="label.password"/></label>
				<input name="password" class="form-control" id="password" type="password"/>
			</div>
			  <button class="btn btn-block btn-primary" type="submit" >Sign up</button>
		</form>
		<s:form action="#" method="post">
			<button type="submit" class="btn btn-link" value="fgt_pwd" name="fgt_password">Forget your password</button>	
		</s:form>
	</div>
	    
</template:implLogin>