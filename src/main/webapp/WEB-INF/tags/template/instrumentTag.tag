<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="extraHeadContent" fragment="true" required="false" %>
<%@ attribute name="navigationContent" fragment="true" required="true" %>
<%@ include file="/WEB-INF/base.jspf" %>

<template:maiN htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">

    <jsp:attribute name="headContent">
        <jsp:invoke fragment="extraHeadContent" />
    </jsp:attribute>
    
	<jsp:attribute name="navigationContent" />
	<jsp:attribute name="menuInstrument">
		<br>
		<hr>
		<h1>MENU_INSTRUMENTS!!!!</h1>
		<hr>
		<br>
	</jsp:attribute>
    
    <jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:maiN>