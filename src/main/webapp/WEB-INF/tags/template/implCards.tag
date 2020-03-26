<%-- <%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
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
 		<script type="text/javascript">
			$(document).ready(function(){
				$('[data-toggle="tooltip"]').tooltip();
				var actions = $("table td:last-child").html();
				// Append table with add row form on add new button click
			    $(".add-new").click(function(){
					$(this).attr("disabled", "disabled");
					var index = $("table tbody tr:last-child").index();
			        var row = '<tr>' +
			            '<td><input type="text" class="form-control" name="name" id="name"></td>' +
			            '<td><input type="text" class="form-control" name="department" id="department"></td>' +
			            '<td><input type="text" class="form-control" name="phone" id="phone"></td>' +
						'<td>' + actions + '</td>' +
			        '</tr>';
			    	$("table").append(row);		
					$("table tbody tr").eq(index + 1).find(".add, .edit").toggle();
			        $('[data-toggle="tooltip"]').tooltip();
			    });
				// Add row on add button click
				$(document).on("click", ".add", function(){
					var empty = false;
					var input = $(this).parents("tr").find('input[type="text"]');
			        input.each(function(){
						if(!$(this).val()){
							$(this).addClass("error");
							empty = true;
						} else{
			                $(this).removeClass("error");
			            }
					});
					$(this).parents("tr").find(".error").first().focus();
					if(!empty){
						input.each(function(){
							$(this).parent("td").html($(this).val());
						});			
						$(this).parents("tr").find(".add, .edit").toggle();
						$(".add-new").removeAttr("disabled");
					}		
			    });
				// Edit row on edit button click
				$(document).on("click", ".edit", function(){		
			        $(this).parents("tr").find("td:not(:last-child)").each(function(){
						$(this).html('<input type="text" class="form-control" value="' + $(this).text() + '">');
					});		
					$(this).parents("tr").find(".add, .edit").toggle();
					$(".add-new").attr("disabled", "disabled");
			    });
				// Delete row on delete button click
				$(document).on("click", ".delete", function(){
			        $(this).parents("tr").remove();
					$(".add-new").removeAttr("disabled");
			    });
			});
		</script> 
	</jsp:attribute>

 	<jsp:attribute name="implCardsContent">
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
	                	<c:forEach items="${_cardsMap}" var="_cardsMapId">
	                		 <tr>
		                        <td><c:out value="${_cardsMapId.value.cardName}"/></td>
		                        <td><c:out value="${_cardsMapId.value.cardType}"/></td>
		                        <td><c:out value="${_cardsMapId.value.userPhone}"/></td>
		                        <td>
									<a class="add" title="Add" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="add"/>
																							</c:url>"><i class="material-icons">&#xE03B;</i></a>
		                            <a class="edit" title="Edit" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="edit"/>
																							</c:url>"><i class="material-icons">&#xE254;</i></a>
		                            <a class="delete" title="Delete" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="delete"/>
																							</c:url>"><i class="material-icons">&#xE872;</i></a>
		                        </td>
		                    </tr>
	                	</c:forEach>
	                
	                
	                	<c:forEach items="${_cardsList}" var="_cardsListId" varStatus="q">
	                		 <tr>
		                        <td><c:out value="${_cardsListId.cardName}"/></td>
		                        <td><c:out value="${_cardsListId.cardType}"/></td>
		                        <td><c:out value="${_cardsListId.userPhone}"/></td>
		                        <td>
									<a class="add" title="Add" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="add"/>
																							</c:url>"><i class="material-icons">&#xE03B;</i></a>
		                            <a class="edit" title="Edit" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="edit"/>
																							</c:url>"><i class="material-icons">&#xE254;</i></a>
		                            <a class="delete" title="Delete" data-toggle="tooltip" href="<c:url value="/cards">
																								<c:param name="action" action="delete"/>
																							</c:url>"><i class="material-icons">&#xE872;</i></a>
		                        </td>
		                    </tr>
	                	</c:forEach>


 	                    <tr>
	                        <td>John Doe</td>
	                        <td>Administration</td>
	                        <td>(171) 555-2222</td>
	                        <td>
								<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
	                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
	                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
	                        </td>
	                    </tr>
	                    <tr>
	                        <td>Peter Parker</td>
	                        <td>Customer Service</td>
	                        <td>(313) 555-5735</td>
	                        <td>
								<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
	                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
	                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
	                        </td>
	                    </tr>
	                    <tr>
	                        <td>Fran Wilson</td>
	                        <td>Human Resources</td>
	                        <td>(503) 555-9931</td>
	                        <td>
								<a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
	                            <a class="edit" title="Edit" data-toggle="tooltip"><i class="material-icons">&#xE254;</i></a>
	                            <a class="delete" title="Delete" data-toggle="tooltip"><i class="material-icons">&#xE872;</i></a>
	                        </td>
	                    </tr> 

	                </tbody>
	            </table>
	        </div>
	    </div>
	</jsp:attribute>
	
 	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:implMain> --%>