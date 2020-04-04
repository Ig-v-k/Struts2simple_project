<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/base.jspf" %>

<template:implMain bodyTitle="${htmlTitle}" htmlTitle="${bodyTitle}">

	<jsp:attribute name="headLoginContent">
		<style>
			#parent {
			   display: table;
			   width: 100%;
			}
			#form_login {
			   display: table-cell;
			   text-align: center;
			   vertical-align: middle;
			}
			a {
			  display: block;
			  padding: 10px;
			  position: absolute;
			  z-index: -1;
			  top: 1rem;
			  left: 100%;
			  margin-left: -62px;
			  transition: all .2s;
			}
			a:hover {
			  margin-left: 0;
			}
		</style>
	</jsp:attribute>

	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
</template:implMain>