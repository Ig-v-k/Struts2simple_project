<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/base.jspf" %>

<template:implMain bodyTitle="${htmlTitle}" htmlTitle="${bodyTitle}">
	<jsp:attribute name="implCardsContent">
		<div class="container">
		  <div class="row">
		    <div class="col">State of account</div>
		    <div class="col">${state}</div>
		    <div class="w-100"></div>
		    <div class="col">Column</div>
		    <div class="col">Column</div>
		  </div>
		</div>
	</jsp:attribute>
	
	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
</template:implMain>