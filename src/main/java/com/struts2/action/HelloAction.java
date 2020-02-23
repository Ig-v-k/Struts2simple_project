package com.struts2.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
 
import com.opensymphony.xwork2.ActionSupport;
 
@Action(value = "hello",
	results = {
	        @Result(name = "success", location = "/WEB-INF/pages/helloPageMain.jsp")
	}
)
public class HelloAction  extends ActionSupport {
    private static final long serialVersionUID = 1L;
 
    private HttpSession session;
    private String username;
    
    @Override
    public void validate() {
	    HttpServletRequest request = ServletActionContext.getRequest();
    	session = request.getSession();
    	setUsername(getSession().getAttribute("loginedUsername").toString());
    }
    
    @Override
    public String execute() {
        return SUCCESS;
    }
    
    public void setUsername(String username) {
		this.username = username;
	}
    
    public HttpSession getSession() {
		return session;
	}
    
	public void setSession(HttpSession session) {
		this.session = session;
	}
}
