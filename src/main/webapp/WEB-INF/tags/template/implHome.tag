<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/base.jspf" %>

<template:implMain bodyTitle="${htmlTitle}" htmlTitle="${bodyTitle}">
		<jsp:attribute name="headCardsContent">
			<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
			<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
			<style type="text/css">
			    body {
			        color: #404E67;
			        background: #F5F7FA;
					font-family: 'Open Sans', sans-serif;
				}
				.table-wrapper {
					width: 700px;
					margin: 30px auto;
			        background: #fff;
			        padding: 20px;	
			        box-shadow: 0 1px 1px rgba(0,0,0,.05);
			    }
			    .table-title {
			        padding-bottom: 10px;
			        margin: 0 0 10px;
			    }
			    .table-title h2 {
			        margin: 6px 0 0;
			        font-size: 22px;
			    }
			    .table-title .add-new {
			        float: right;
					height: 30px;
					font-weight: bold;
					font-size: 12px;
					text-shadow: none;
					min-width: 100px;
					border-radius: 50px;
					line-height: 13px;
			    }
				.table-title .add-new i {
					margin-right: 4px;
				}
			    table.table {
			        table-layout: fixed;
			    }
			    table.table tr th, table.table tr td {
			        border-color: #e9e9e9;
			    }
			    table.table th i {
			        font-size: 13px;
			        margin: 0 5px;
			        cursor: pointer;
			    }
			    table.table th:last-child {
			        width: 100px;
			    }
			    table.table td a {
					cursor: pointer;
			        display: inline-block;
			        margin: 0 5px;
					min-width: 24px;
			    }    
				table.table td a.add {
			        color: #27C46B;
			    }
			    table.table td a.edit {
			        color: #FFC107;
			    }
			    table.table td a.delete {
			        color: #E34724;
			    }
			    table.table td i {
			        font-size: 19px;
			    }
				table.table td a.add i {
			        font-size: 24px;
			    	margin-right: -1px;
			        position: relative;
			        top: 3px;
			    }    
			    table.table .form-control {
			        height: 32px;
			        line-height: 32px;
			        box-shadow: none;
			        border-radius: 2px;
			    }
				table.table .form-control.error {
					border-color: #f50000;
				}
				table.table td .add {
					display: none;
				}
			</style>
		</jsp:attribute>		

	<jsp:attribute name="implHomeContent">
		<c:if test="${homeContent}">
			<div class="container">
				<div class="row">
					<div class="col-xs-9"><h3>State of account</h3></div>
					<div class="w-100"></div>
					<div class="col-xs-9"><h5>${USER}</h5></div>
			    	<c:forEach items="${_cardsMapHome}" var="_cardsMapHomeID">
				    	<div class="w-100"></div>
				    	<div class="col"><h5>${_cardsMapHomeID.value.cardName}</h5></div>
				    	<div class="col"><h5>${_cardsMapHomeID.value.state}</h5></div>
			    	</c:forEach>
			  	</div>
			</div>
		</c:if>
		<c:if test="${cardContent}">
			<div class="container">
		        <div class="table-wrapper">
		            <div class="table-title">
		                <div class="row">
		                    <div class="col-sm-8"><h2>Cards <b>Details</b></h2></div>
		                    <div class="col-sm-4">
		                        <s:submit action="cards" value="Add New" />
		                    </div>
		                </div>
		            </div>
		            <table class="table table-bordered">
		                <thead>
		                    <tr>
		                        <th>Card Name</th>
		                        <th>Card Type</th>
		                        <th>Phone</th>
		                        <th>Actions</th>
		                    </tr>
		                </thead>
		                <tbody>
		                	<c:forEach items="${_cardsMap}" var="cardsMapId">
		                		 <tr>
			                        <td><c:out value="${cardsMapId.value.cardName}"/></td>
			                        <td><c:out value="${cardsMapId.value.cardType}"/></td>
			                        <td><c:out value="${cardsMapId.value.userPhone}"/></td>
			                        <td>
			                            <a class="edit" title="Edit" data-toggle="tooltip" href="<c:url value="profile">
			                            															<c:param name="actionMenu" value="cards"/>
																									<c:param name="actionCard" value="edit"/>
																								</c:url>"><i class="material-icons">&#xE254;</i></a>
			                            <a class="delete" title="Delete" data-toggle="tooltip" href="<c:url value="profile">
			                            															<c:param name="actionMenu" value="cards"/>
																									<c:param name="actionCard" value="delete"/>
																								</c:url>"><i class="material-icons">&#xE872;</i></a>
			                        </td>
			                    </tr>
		                	</c:forEach>
		                </tbody>
		            </table>
		         	<c:if test="${editFormCard}">
		                <h1>editFormCard</h1>
		            </c:if>
		        </div>
		    </div>
		</c:if>
	</jsp:attribute>
	
	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
</template:implMain>