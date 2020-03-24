<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ include file="/WEB-INF/base.jspf" %>

<template:menU htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">

	<jsp:attribute name="menuInstrument">
		<h3>MENU_INSTRUMENTS!!!!</h3>
	</jsp:attribute>
    
    <jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:menU>