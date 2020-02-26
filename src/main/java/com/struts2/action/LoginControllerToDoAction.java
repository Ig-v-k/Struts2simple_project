package com.struts2.action;
 
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
//import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
//import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
import com.struts2.dao.UsersRepository;

/**
 * @author iw
 *
 */
@Namespace(value="")
//@ResultPath(value="/")
@Action(value = "login",
	results = {
        @Result(name = "input", location = "/WEB-INF/login.jsp"), // --> jsp
        @Result(name = "error" , location = "/WEB-INF/login.jsp"), // --> jsp
        @Result(name = "success", type="redirect", location= "/userInfo") //  --> Action
	} // results
) // Action
//@ResultPath(value="/")
//@InterceptorRef(value = "customStack")
//@ParentPackage(value = "default")
public class LoginControllerToDoAction extends ActionSupport {
	 
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LoginControllerToDoAction.class.getName());
    private UsersRepository repository = new UsersRepository();
    private String username, password;
    private HttpSession session;
    public byte check_switch;
    
    @Override
    public void validate() {
    	LOGGER.info("---LOGGER: method - validate()");
        if (this.getUsername() == null && this.getPassword() == null) {
        	LOGGER.info("---LOGGER: INPUT");
        	check_switch = 1;
        	return;
	    } // if
	    HttpServletRequest request = ServletActionContext.getRequest();
	    if (this.getUsername().equals(repository.returnAllUsers().get(this.getUsername()).getUsername()) && this.getPassword().equals(repository.returnAllUsers().get(this.getUsername()).getPassword())) {
	    	LOGGER.info("---LOGGER: SUCCESS");
	    	check_switch = 2;
	    	addActionMessage(getText("success.login"));
	    	session = request.getSession();
	        getSession().setAttribute("loginedUsername", repository.returnAllUsers().get(this.getUsername()).getUsername());
	        return;
	    } // if
	    else {
	    	LOGGER.info("---LOGGER: ERROR");
	    	check_switch = 3;
	        addActionError(getText("error.login"));
	        return;
	    } // else
    } // m:validate()
    
    @Override
    public String execute() {
    	LOGGER.info("---LOGGER: method - execute()");
    	LOGGER.info("---LOGGER: check_switch = " + this.check_switch);
        switch (check_switch) {
		case 1:
			return INPUT;
		case 2:
			return SUCCESS;
		case 3:
			return ERROR;
        } // switch
        return null;
    } // m:execute()
    
    public String getUsername() {
    	return this.username;
    }
 
    public void setUsername(String username) {
    	LOGGER.info("---LOGGER: username - " + username);
    	this.username = username;
    }
 
    public String getPassword() {
        return this.password;
    }
 
    public void setPassword(String password) {
    	LOGGER.info("---LOGGER: password - " + password);
        this.password = password;
    }
    
    public HttpSession getSession() {
		return this.session;
	}
}