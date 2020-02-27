package com.struts2.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

@Action(value="logout", results = @Result(name = "logout", location = "/WEB-INF/logout.jsp"))
public class LogoutAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String username;
	@Override
	public String execute() {
		this.username = (String) ServletActionContext.getRequest().getSession().getAttribute("user");
		ServletActionContext.getRequest().getSession().invalidate();
		addActionMessage("You are successfully logout!");
		return "logout";
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
