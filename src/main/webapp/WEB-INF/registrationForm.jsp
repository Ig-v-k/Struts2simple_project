<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="register_POST" method="post">
	  <div class="container" align="center">
	  	<jsp:include page="_menu.jsp" />
	    <h1>Register</h1>
	    <p>Please fill in this form to create an account.</p>
	    <hr>
		<s:actionerror />
	    <label for="name"><b>Email</b></label>
	    <input type="text" placeholder="Enter Username" name="username" required>
		<br>
	    <label for="psw"><b>Password</b></label>
	    <input type="password" placeholder="Enter Password" name="password" required>
		<br>
	    <label for="psw-repeat"><b>Repeat Password</b></label>
	    <input type="password" placeholder="Repeat Password" name="passwordR" required>
	    <hr>
	    <br>
	    <input type="radio" name="role" value="admin">
		<label for="male">Admin</label><br>
		<input type="radio" name="role" value="employee">
		<label for="female">Employee</label><br>
		<input type="radio" name="role" value="user">
		<label for="other">User</label>
	
	    <p>By creating an account you agree to our <!-- <a href="#">Terms & Privacy</a> -->.</p>
	    <button type="submit" class="registerbtn">Register</button>
	  </div>
	
	  <div class="container signin" align="center">
	    <p>Already have an account? <a href="login_GET">Sign in</a>.</p>
	  </div>
	</form>

</body>
</html>