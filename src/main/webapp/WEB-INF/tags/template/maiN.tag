<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="headContent" fragment="true" required="false" %>
<%@ attribute name="navigationContent" fragment="true" required="true" %>
<%@ attribute name="menuInstrument" fragment="true" required="true" %>

<%@ include file="/WEB-INF/base.jspf"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Service <c:out value="${fn:trim(htmlTitle)}" /></title>
		<jsp:invoke fragment="headContent" />
	</head>
	
	<body>
		<div align="center">
			<jsp:invoke fragment="navigationContent"/>
			<jsp:invoke fragment="menuInstrument"/>
		</div>
		<div align="center">
			<jsp:doBody />
		</div>
	</body>
</html>