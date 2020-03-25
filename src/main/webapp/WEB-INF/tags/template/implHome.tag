<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/base.jspf" %>

<template:implMain bodyTitle="${htmlTitle}" htmlTitle="${bodyTitle}">
	<jsp:attribute name="implHomeContent">
		<div class="container">
			<div class="row">
		    	<div class="col">State of account</div>
		    	<div class="w-100"></div>
		    	<div class="col"><h3>${_cardName}</h3></div>
		    	<div class="col"><h3>${_state}</h3></div>
		  	</div>
		</div>
	</jsp:attribute>
	
	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
</template:implMain>