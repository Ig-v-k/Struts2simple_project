package com.struts2.action;
 
import java.util.logging.Logger;

//import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
//import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
@Namespace(value="")
//@Action(value = "login",
//	results = {
//        @Result(name = "input", location = "/WEB-INF/login.jsp"), // --> jsp
//        @Result(name = "error" , location = "/WEB-INF/login.jsp"), // --> jsp
//        @Result(name = "success", type="redirect", location= "/userInfo") //  --> Action
//	} // results
//) // Action
//@ResultPath(value="/")
//@InterceptorRef(value = "customStack")
//@ParentPackage(value = "default")
public class LoginControllerToDoAction extends ActionSupport {
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private ClassValidateUserIn classValidateUserIn;
    private String username, password;
    
    @Override
    public String execute() {
		LOGGER.info("---LOGGER: method - execute()");
    	this.classValidateUserIn = new ClassValidateUserIn();
    	switch (this.classValidateUserIn.checkOne(this.getUsername(), this.getPassword())) {
		case INPUT:
			LOGGER.info("---LOGGER: INPUT");
			return INPUT;
		case SUCCESS:
			LOGGER.info("---LOGGER: SUCCESS");
			addActionMessage(getText("success.login"));
			return SUCCESS;
    	default:
    		LOGGER.info("---LOGGER: ERROR");
    		addActionError(getText("error.login"));
    		return ERROR;
    	} // switch
    	
    } // m:execute()
    
    
    // *** GETTERS & SETTERS ***
    public String getUsername() {
    	return this.username;
    }
 
//    @RequiredStringValidator(message = "please enter correctly 'username'")
    public void setUsername(String username) {
    	this.username = username;
    }
 
    public String getPassword() {
        return this.password;
    }
 
//    @RequiredStringValidator(message = "please enter correctly 'password'")
    public void setPassword(String password) {
        this.password = password;
    }
} // c:LoginControllerToDoAction