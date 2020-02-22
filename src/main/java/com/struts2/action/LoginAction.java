package com.struts2.action;
 
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
//import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
//import com.opensymphony.xwork2.validator.annotations.Validations;
import com.struts2.beans.Users;

/**
 * @author iw
 *
 */
@Namespace(value="/")
//@ResultPath(value="/")
@Action(value = "login",
	results = {
	        @Result(name = "input", location = "/WEB-INF/pages/login.jsp"), // --> jsp
	        @Result(name = "error" , location = "/WEB-INF/pages/login.jsp"), // --> jsp
	        @Result(name = "success", type="redirect", location= "/userInfo") //  --> Action
	}
)
public class LoginAction extends ActionSupport {
	 
    private static final long serialVersionUID = 7299264265184515893L;
    private static final Logger LOGGER = Logger.getLogger(LoginAction.class.getName());
//    private String username;
//    private String password;
    private Users user;
    private HttpSession session = null;
    public byte check_switch;
    
    @Override
    public void validate() {
    	LOGGER.info("---LOGGER: method - validate()");
        if ( this.getUser() == null && this.getUser() == null) {
	//          if(this.setUser(new Users()) == null) {
        	check_switch = 1;
        	return;
	    }
	    HttpServletRequest request = ServletActionContext.getRequest();
	    if ("admin".equals(this.getUser().getUsername()) && "admin123".equals(this.getUser().getPassword())) {
	    	check_switch = 2;
	    	addActionMessage(getText("success.login"));
//	    	user = new Users(getUsername(), getPassword());
	    	session = request.getSession();
	        getSession().setAttribute("loginedUsername", user.getUsername());
	        return;
	    }
	    else {
	    	check_switch = 3;
	        addActionError(getText("error.login"));
	        return;
	    }
    }
    
    @Override
    public String execute() {
    	LOGGER.info("---LOGGER: method - execute()");
//        if ( this.getUsername() == null && this.getPassword() == null) {
////        if(this.setUser(new Users()) == null) {
//            return INPUT;
//        }
//        HttpServletRequest request = ServletActionContext.getRequest();
//        if ("admin".equals(this.getUsername()) && "admin123".equals(this.getPassword())) {
//        	user = new Users(getUsername(), getPassword());
//        	session = request.getSession();
//            getSession().setAttribute("loginedUsername", user.getUsername());
        switch (check_switch) {
		case 1:
			return INPUT;
		case 2:
			return SUCCESS;
		case 3:
			return ERROR;
        }
        return null;
//        else {
//            String message = getText("error.login");
//            addActionError(message);
//            return ERROR;
//        }
    }
//    public String getUsername() {
//    	return this.username;
//    	return this.getUsername();
//    }
    
    public void setUser(Users user) {
		this.user = user;
	}
    
    public Users getUser() {
		return user;
	}
    
    public HttpSession getSession() {
		return this.session;
	}
 
//    public void setUsername(String username) {
//    	this.username = username;
//    	this.user = new Users();
//    	this.user.setUsername(username);
//    }
 
//    public String getPassword() {
//        return this.password;
//    }
 
//    public void setPassword(String password) {
//        this.password = password;
//    }
}