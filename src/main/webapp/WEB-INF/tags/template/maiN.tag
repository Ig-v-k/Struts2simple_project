<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="headContent" fragment="true" required="false" %>
<%-- <%@ attribute name="navigationInstrumentContent" fragment="true" required="true" %> --%>
<%@ attribute name="navigationContent" fragment="true" required="true" %>
<%@ attribute name="homeContent" fragment="true" required="false" %>
<%@ attribute name="cardsContent" fragment="true" required="false" %>

<%@ include file="/WEB-INF/base.jspf"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Service <c:out value="${fn:trim(htmlTitle)}" /></title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
		<jsp:invoke fragment="headContent" />
	</head>
	
	<body>
		<div align="center">
			<jsp:invoke fragment="navigationContent"/>
<%-- 			<jsp:invoke fragment="navigationInstrumentContent"/> --%>
		</div>
		<div align="center">
			<jsp:invoke fragment="homeContent"/>
<%-- 			<jsp:invoke fragment="cardsContent"/> --%>
			<jsp:doBody />
		</div>
	</body>
</html>