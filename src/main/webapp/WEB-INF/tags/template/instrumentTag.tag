<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ include file="/WEB-INF/base.jspf" %>

<template:menU htmlTitle="${htmlTitle}" bodyTitle="${bodyTitle}">
	
	<jsp:attribute name="extraHeadContentInstrument">
 		
		<style>
/* 
			ul {
			  list-style-type: none;
			  margin: 0;
			  padding: 0;
			  overflow: hidden;
			  background-color: #333;
			}
			
			li {
			  float: left;
			}
			
			li a {
			  display: block;
			  color: white;
			  text-align: center;
			  padding: 14px 16px;
			  text-decoration: none;
			}
			
 			li a:hover {
			  background-color: #111;
			}
*/
		</style> 

	</jsp:attribute>

	<jsp:attribute name="menuInstrument">
<!-- 		
		<table>
			<tr>
				<td><h5>TRANSFERS</h5></td>
				<td><h5>CARDS</h5></td>
				<td><h5>CREDITS</h5></td>
				<td><h5>SERVICES</h5></td>
			</tr>
		</table>
-->
<%-- 		
		<ul>
		  <li><a class="active" href="${pageContext.request.contextPath}/#">TRANSFERS</a></li>
		  <li><a href="${pageContext.request.contextPath}/#">CARDS</a></li>
		  <li><a href="${pageContext.request.contextPath}/#">CREDITS</a></li>
		  <li><a href="${pageContext.request.contextPath}/#">SERVICES</a></li>
		</ul> 
--%>

	<div align="center">
		<a href="${pageContext.request.contextPath}/#">TRANSFERS</a>&emsp;
		<a href="${pageContext.request.contextPath}/#">CARDS</a>&emsp;
		<a href="${pageContext.request.contextPath}/#">CREDITS</a>&emsp;
		<a href="${pageContext.request.contextPath}/#">SERVICES</a>
	</div>
	
	</jsp:attribute>
    
    <jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:menU>