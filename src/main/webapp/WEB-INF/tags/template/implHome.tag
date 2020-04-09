<%@ tag body-content="scriptless" trimDirectiveWhitespaces="true" %>
<%@ attribute name="htmlTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ attribute name="bodyTitle" type="java.lang.String" rtexprvalue="true" required="true" %>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/base.jspf" %>

<template:implMain bodyTitle="${htmlTitle}" htmlTitle="${bodyTitle}">
	<jsp:attribute name="headCardsContent">
		<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round|Open+Sans">
		<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
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
		<c:if test="${transferContent}">
			<div class="container">
			    <div class="row">
			      <div class="col-sm">
			        <a href="<c:url value="profile">
			                 	<c:param name="actionMenu" value="transfers"/>
								<c:param name="actionTransfer" value="add"/>
							 </c:url>">Add</a>
			      </div>
			    </div>
			    <c:if test="${userTransferContent}">
			    	<c:forEach items="${_transferMap}" var="transferMapId">
				    	<div class="row">
						    <div class="col-sm">
						      <p>${transferMapId.value._card.cardName}</p>
						    </div>
						    <div class="col-sm">
						      <p>${transferMapId.value._user.userName}</p>
						    </div>
						    <div class="col-sm">
						      <p>${transferMapId.value.date}</p>
						    </div>
						    <div class="col-sm">
						      <p>${transferMapId.value._card.state}</p>
						    </div>
				    	</div>
			    	</c:forEach>
			    </c:if>
			    <c:if test="${addTransferForm}">
			    	<h2>ADD TRANSFER FORM!</h2>
			    </c:if>
			</div>
		</c:if>
		<c:if test="${cardContent}">
			<div class="container">
		        <div class="table-wrapper">
		            <div class="table-title">
		                <div class="row">
		                    <div class="col-sm-8"><h2>Cards <b>Details</b></h2></div>
		                    <div class="col-sm-4">
		                        <a href="<c:url value="profile">
			                            	<c:param name="actionMenu" value="cards"/>
											<c:param name="actionCardContent" value="content"/>
										 </c:url>">Add</a>
		                    </div>
		                </div>
		            </div>
		            <table class="table table-bordered">
		                <thead>
		                    <tr>
		                        <th>Card Name</th>
		                        <th>Card Type</th>
		                        <th>Phone</th>
		                        <th>State</th>
		                    </tr>
		                </thead>
		                <tbody>
		                	<c:forEach items="${_cardsMap}" var="cardsMapId">
		                		 <tr>
			                        <td><c:out value="${cardsMapId.value.cardName}"/></td>
			                        <td><c:out value="${cardsMapId.value.cardType}"/></td>
			                        <td><c:out value="${cardsMapId.value.userPhone}"/></td>
			                        <td><c:out value="${cardsMapId.value.state}"/></td>
			                        <td>
			                            <a class="edit" title="Edit" data-toggle="tooltip" href="<c:url value="profile">
			                            															<c:param name="actionMenu" value="cards"/>
			                            															<c:param name="cardName" value="${cardsMapId.value.cardName}"/>
																									<c:param name="actionCardContent" value="edit"/>
																								</c:url>"><i class="material-icons">&#xE254;</i></a>
			                            <a class="delete" title="Delete" data-toggle="tooltip" href="<c:url value="profile">
			                            															<c:param name="actionMenu" value="cards"/>
			                            															<c:param name="cardName" value="${cardsMapId.value.cardName}"/>
																									<c:param name="actionCard" value="delete"/>
																								</c:url>"><i class="material-icons">&#xE872;</i></a>
			                        </td>
			                    </tr>
		                	</c:forEach>
		                </tbody>
		            </table>
		            <c:if test="${addFormCardContent}">
		            	<br>
		            	<hr>
		            	<h3>Type of card card</h3>
						<div align="center">
							<div class="form-group">
							    <div class="form-check">
							      <input class="form-check-input" type="checkbox" id="gridCheck">
							      <label class="form-check-label" for="gridCheck">
							        Check me out
							      </label>
							    </div>
							</div>
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Discount</a>&emsp;
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Insurable</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Promotional</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Club</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Identification</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Payment</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Gift</a>&emsp;									 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Vcards and calendars</a>&emsp;								 
							<a href="<c:url value="profile">
										<c:param name="actionMenu" value="transfers"/>
									 </c:url>">Fuel</a>&emsp;										 
						</div>
						<c:if test="${addFormCard}">
			                <h1>Add card</h1>
			                <form action="">
							  <div class="form-row">
							    <div class="form-group col-md-6">
							      <label for="inputEmail4">Card Name</label>
							      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
							    </div>
							    <div class="form-group col-md-6">
							      <label for="inputPassword4">Password</label>
							      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputAddress">Address</label>
							    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
							  </div>
							  <div class="form-group">
							    <label for="inputAddress2">Address 2</label>
							    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
							  </div>
							  <div class="form-row">
							    <div class="form-group col-md-6">
							      <label for="inputCity">City</label>
							      <input type="text" class="form-control" id="inputCity">
							    </div>
							    <div class="form-group col-md-4">
							      <label for="inputState">State</label>
							      <select id="inputState" class="form-control">
							        <option selected>Choose...</option>
							        <option>...</option>
							      </select>
							    </div>
							    <div class="form-group col-md-2">
							      <label for="inputZip">Zip</label>
							      <input type="text" class="form-control" id="inputZip">
							    </div>
							  </div>
							  <div class="form-group">
							    <div class="form-check">
							      <input class="form-check-input" type="checkbox" id="gridCheck">
							      <label class="form-check-label" for="gridCheck">
							        Check me out
							      </label>
							    </div>
							  </div>
							  <button type="submit" class="btn btn-primary">Add</button>
							</form>
		            	</c:if>
			         	<c:if test="${editFormCard}">
			                <h1>Edit card</h1>
			                <form action="">
							  <div class="form-row">
							    <div class="form-group col-md-6">
							      <label for="inputEmail4">Email</label>
							      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
							    </div>
							    <div class="form-group col-md-6">
							      <label for="inputPassword4">Password</label>
							      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
							    </div>
							  </div>
							  <div class="form-group">
							    <label for="inputAddress">Address</label>
							    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
							  </div>
							  <div class="form-group">
							    <label for="inputAddress2">Address 2</label>
							    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
							  </div>
							  <div class="form-row">
							    <div class="form-group col-md-6">
							      <label for="inputCity">City</label>
							      <input type="text" class="form-control" id="inputCity">
							    </div>
							    <div class="form-group col-md-4">
							      <label for="inputState">State</label>
							      <select id="inputState" class="form-control">
							        <option selected>Choose...</option>
							        <option>...</option>
							      </select>
							    </div>
							    <div class="form-group col-md-2">
							      <label for="inputZip">Zip</label>
							      <input type="text" class="form-control" id="inputZip">
							    </div>
							  </div>
							  <div class="form-group">
							    <div class="form-check">
							      <input class="form-check-input" type="checkbox" id="gridCheck">
							      <label class="form-check-label" for="gridCheck">
							        Check me out
							      </label>
							    </div>
							  </div>
							  <button type="submit" class="btn btn-primary">Edit</button>
							</form>
			            </c:if>
			         </c:if>
		        </div>
		    </div>
		</c:if>
		<c:if test="${creditsContent}">
			<div class="container">
			    <div class="row">
			      <div class="col-sm">
			        <a href="<c:url value="profile">
			                 	<c:param name="actionMenu" value="credits"/>
								<c:param name="actionCredit" value="add"/>
							 </c:url>">Add</a>
			      </div>
			    </div>
			    <c:if test="${userCreditContent}">
			    	<c:forEach items="${_creditMap}" var="creditMapId">
				    	<div class="row">
						    <div class="col-sm">
						      <p>${creditMapId.value._card.cardName}</p>
						    </div>
						    <div class="col-sm">
						      <p>${creditMapId.value._user.userName}</p>
						    </div>
						    <div class="col-sm">
						      <p>${creditMapId.value.creditState}</p>
						    </div>
						    <div class="col-sm">
						      <p>${creditMapId.value.date}</p>
						    </div>
						    <div class="col-sm">
						      <p>${creditMapId.value.firmName}</p>
						    </div>						    
				    	</div>			    	
			    	</c:forEach>
			    </c:if>
			    <c:if test="${addCreditForm}">
			    	<h2>ADD CREDIT FORM!</h2>
			    </c:if>
			</div>
		</c:if>
		<c:if test="${settingsContent}">
			<div class="container">
			    <div class="row">
			      <div class="col-sm">
			        <a href="<c:url value="profile">
			                 	<c:param name="actionMenu" value="settings"/>
								<c:param name="actionTransfer" value="add"/>
							 </c:url>">Add</a>
			      </div>
			   	</div>
			</div>
		</c:if>
		<c:if test="${contactContent}">
			<div class="container">
			    <div class="row">
			      	<div class="col-sm">
			      		tel: (0) 000-000-000
			      	</div>    
			    </div>
			    <div class="row">
			    	<div class="col-sm">
			    		Send us at the e-mail 
			    	</div>
			    	<div class="col-sm">
			    		<a href="<c:url value="profile">
			                 	<c:param name="actionMenu" value="contacts"/>
								<c:param name="actionContact" value="send"/>
							 </c:url>">Send</a>
			    	</div>
			    </div>
			    <div class="row">
			    	<div class="col-sm">
			    		<c:if test="${sendFormContact}">
			    			<h1>Send e-mail</h1>
				            <form action="">
								  <div class="form-row">
								    <div class="form-group col-md-6">
								      <label for="inputEmail4">Email</label>
								      <input type="email" class="form-control" id="inputEmail4" placeholder="Email">
								    </div>
								    <div class="form-group col-md-6">
								      <label for="inputPassword4">Password</label>
								      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="inputAddress">Address</label>
								    <input type="text" class="form-control" id="inputAddress" placeholder="1234 Main St">
								  </div>
								  <div class="form-group">
								    <label for="inputAddress2">Address 2</label>
								    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
								  </div>
								  <div class="form-row">
								    <div class="form-group col-md-6">
								      <label for="inputCity">City</label>
								      <input type="text" class="form-control" id="inputCity">
								    </div>
								    <div class="form-group col-md-4">
								      <label for="inputState">State</label>
								      <select id="inputState" class="form-control">
								        <option selected>Choose...</option>
								        <option>...</option>
								      </select>
								    </div>
								    <div class="form-group col-md-2">
								      <label for="inputZip">Zip</label>
								      <input type="text" class="form-control" id="inputZip">
								    </div>
								  </div>
								  <div class="form-group">
								    <div class="form-check">
								      <input class="form-check-input" type="checkbox" id="gridCheck">
								      <label class="form-check-label" for="gridCheck">
								        Check me out
								      </label>
								    </div>
								  </div>
								<button type="submit" class="btn btn-primary">Send</button>
							</form>
			    		</c:if>
			    	</div>
			    </div>
			</div>
		</c:if>
	</jsp:attribute>
	
	<jsp:body>
        <jsp:doBody/>
    </jsp:body>
    
</template:implMain>