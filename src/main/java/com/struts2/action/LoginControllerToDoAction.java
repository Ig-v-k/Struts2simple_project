package com.struts2.action;
 
import java.util.Date;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.todo.ClassValidateUserIn;

/**
 * @author iw
 *
 */
//@ParentPackage(value = "default")
@Namespace(value="")
//@InterceptorRef(value = "check_stack")
public class LoginControllerToDoAction extends ActionSupport implements SessionAware{
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private Map<String, Object> session;
    private String username, password;
    private Date timedate;
    
    
//    @Action(value = "GET_login",
//    		results = {
//    				@Result(name = "input", location = "/WEB-INF/login.jsp"),
//    				@Result(name = "succes_redirect", location = "POST_login")
//    		})
//    public String GET_login() {
//		if(session.get("USER") != null)
//			return "success_redirect";
//		return INPUT;
//    } // m:GET_login()
    
//    @Action(value = "POST_login",
//    		results = {
//    				@Result(name = "input", location = "/WEB-INF/login.jsp"),
//    				@Result(name = "error", location = "/WEB-INF/login.jsp"),
//    				@Result(name = "success", type = "redirect", location = "userInfo"),
//    		})
//    private String POST_login() {
//    	LOGGER.info("---LOGGER: method - execute()");
//    	switch (new ClassValidateUserIn().checkOne(this.getUsername(), this.getPassword())) {
//		case INPUT:
//			LOGGER.info("---LOGGER: INPUT");
//			timedate = new Date();
//			return INPUT;
//		case SUCCESS:
//			LOGGER.info("---LOGGER: SUCCESS");
//			addActionMessage(getText("success.login"));
//			return SUCCESS;
//    	default:
//    		LOGGER.info("---LOGGER: ERROR");
//    		addActionError(getText("error.login"));
//    		return ERROR;
//    	} // switch
//    } // m:POST_login()
    
    @Override
    public String execute() {
		LOGGER.info("---LOGGER: method - execute()");
    	switch (new ClassValidateUserIn().checkOne(this.getUsername(), this.getPassword())) {
//		case INPUT:
//			LOGGER.info("---LOGGER: INPUT");
//			return INPUT;
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
    
    
	/**** 
	 * GETTERS & SETTERS 
	 ****/
    public void setSession(Map<String, Object> session) {
		this.session = session;
	}
    
    public String getUsername() {
    	return this.username;
    }

    public void setUsername(String username) {
    	this.username = username;
    }
 
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Date getDate() {
		return timedate;
	}
} // c:LoginControllerToDoAction