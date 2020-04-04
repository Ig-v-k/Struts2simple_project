<%--@elvariable id="db" type="java.util.Map<String, com.struts2.beans.User>"--%>

<template:implLogin htmlTitle="Login" bodyTitle="Login">

 	<div align="center">
<%--  	    <jsp:include page="_menu.jsp" /> 
	    <h2>Struts 2 - Login Application</h2>--%>
	    <s:actionerror />
	 	<hr>
<%-- 	    <s:form action="login_POST" method="post">
	        <s:textfield name="username" key="label.username" size="20" />
	        <s:password name="password" key="label.password" size="20" />
	        <s:submit method="execute" key="label.login" align="center" />
	        <input type="radio" name="role" value="admin">
			<label for="male">Admin</label><br>
			<input type="radio" name="role" value="employee">
			<label for="female">Employee</label><br>
			<input type="radio" name="role" value="user">
			<label for="other">User</label>
	    </s:form> --%>
	    

	    <form id="form_login" class="card card-block bg-faded" action="login_POST" method="post">
			  <legend class="m-b-1 text-xs-center">Sign up</legend>
			
<!-- 			  <div class="form-group input-group" align="center">
			    <span class="has-float-label">
			    	<label for="first">First</label>
			    	<input class="form-control" id="first" type="text" placeholder="Name"/>
			    </span>
			    <label class="has-float-label">
			      <input class="form-control" type="text" placeholder="Surname"/>
			      <span>Last</span>
			    </label>
			  </div> -->
			
			  <div class="form-group input-group" align="center">
<!-- 				    <span class="input-group-addon">@</span> -->
			    <label class="has-float-label">
			    	<span>User Name</span>
			    	<input name="username" class="form-control" placeholder="email@example.com"/>
			    </label>
			  </div>
			
			  <div class="form-group has-float-label" align="center">
				  	<label for="password">Password</label>
				    <input name="password" class="form-control" id="password" type="password" placeholder="••••••••"/>
			  </div>
			
<!-- 			  <label class="form-group has-float-label">
			    <select class="form-control custom-select">
			      <option selected>United States</option>
			      <option>Canada</option>
			      <option>...</option>
			    </select>
			    <span>Country</span>
			  </label> -->
			
<!-- 				  <div class="form-group">
				    <label class="custom-control custom-checkbox">
				      <input class="custom-control-input" type="checkbox"/>
				      <span class="custom-control-indicator"></span>
				      <span class="custom-control-description">Subscribe to newsletter</span>
				    </label>
				  </div> -->
			  
			  <div>
			        <input type="radio" name="role" value="admin">
					<label for="male">Admin</label><br>
					<input type="radio" name="role" value="employee">
					<label for="female">Employee</label><br>
					<input type="radio" name="role" value="user">
					<label for="other">User</label>
			  </div>
			
			  <button class="btn btn-block btn-primary" type="submit" >Sign up</button>
		</form>
	    

		
		<!---->
		
		<a href="https://github.com/tonystar/bootstrap-float-label" target="_blank">
		  <img src="https://img.shields.io/github/stars/tonystar/bootstrap-float-label.svg?style=social&label=Star"/>
		</a>
	    
	    <hr>
	    <br>
<%-- 	    Login: &emsp; Password:
		<c:forEach items="${db}" var="i">
        	<p>${i.key} &nbsp; - &nbsp; ${i.value.password}</p>
        </c:forEach> 
--%>
	</div>
	    
</template:implLogin>